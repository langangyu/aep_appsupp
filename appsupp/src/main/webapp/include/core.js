/** 
 * Splits a list into x lists and puts these in a table with x columns
 */
$.fn.listToTable = function(columns){
  if(!columns)
    columns = 3;
  $(this).each(function(){
    var list = $(this),
        container = list.parent(),
        listItems = list.find(' li'),
        itemsPerColumn = Math.ceil(listItems.length / columns),
        table = $('<table class="listTable"><tr /></table>'),
        listItemStart, listItemEnd;
    
    list.hide();
    
    for(i = 0; i < columns; i++){
      listItemStart = i * itemsPerColumn;
      listItemEnd = (i + 1) * itemsPerColumn;
      table.find(' tr').append('<td><ul class="index clearfix" /></td>');
      table.find(' ul').eq(i).append(listItems.slice(listItemStart,listItemEnd));
    }
    
    list.after(table).remove();
  });  
      
}
  
$.fn.equalHeights = function() {
  var h = 0;
  $(this).each(function(){
    if ($(this).height() > h) {
      h = $(this).height();
    }
  }).height(h);
  return this;
}

  
$.fn.toggleNav = function(){
  $(this).each(function(){   
   var name      = $(this).attr('href').split('#')[1],
       container = $('#nav .'+name),
       content   = $('#'+name),
       nav       = {
         name      : name,
         container : container,
         link      : $(this),
         content   : content,
         close     : content.find(' .close')
       };
    $(this).toggleAnimate(nav);
    nav.close.toggleAnimate(nav);
  });
}

$.fn.toggleAnimate = function(nav){
  $(this).click(function(event){   
    event.preventDefault();
    
    // close other nav if it's open
    if(!$(this).hasClass('close'))
      $('#nav a.open').not(this).click();
      
    nav.link.toggleClass("open");
    nav.content.stop(true, true).slideToggle("slow").focus();
    
    // show close link delayed/hide it before slideUp to prevent overlapping
    if(nav.link.hasClass('open')){
      nav.close.stop(true, true).hide().delay(400).fadeIn(200);
    }
    else {
      nav.close.stop(true, true).fadeOut(100);
    }
  }); 
}
  
  
$(document).ready(function() {
  if( $('#nav #main .tray').hasClass('img') ){
    $('#nav #main .left ul.index').listToTable(2);
  }else{
    $('#nav #main .left ul.index').listToTable();
  }
  $('#content .directory ul.index').listToTable();
  
  $('.compact_dd.dropdown select').selectbox();
  
  
  // header search form: hide label when input field is active
  $("#global_search_header").focus(function() {
    $("#header form.search label").removeClass("show");
    $("#header form.search label").addClass("hide");
  });

  // header search form: show label when input field is inactive
  $("#global_search_header").blur(function() {
    var qs = $("#global_search_header").val().length;
    if (qs < 1) {
      $("#header form.search label").removeClass("hide");
      $("#header form.search label").addClass("show");
    }
  });

  // footer search form: hide label when input field is active
  $("#global_search_footer").focus(function() {
    $("#footer form.search label").removeClass("show");
    $("#footer form.search label").addClass("hide");
  });

  // footer search form: show label when input field is inactive
  $("#global_search_footer").blur(function() {
    var qs = $("#global_search_footer").val().length;
    if (qs < 1) {
      $("#footer form.search label").removeClass("hide");
      $("#footer form.search label").addClass("show");
    }
  });  
  
  $('.section').each(function(){    
    $(this).find('.left, .right').equalHeights();
    $(this).find('.left .index').equalHeights();
  });

  // set columns in sub nav
  var subCols = $('#nav .sub > li').length;
  $("#nav ul.sub").addClass("cols" + subCols);

  // set equal heights on columns in sub nav
  var anchorHeight = 0;
  $('#header .sub > li > a').each(function(){
    if ($(this).height() > anchorHeight) {
      anchorHeight = $(this).height();
    }
  });
  $("#header .sub > li > a").css("height", anchorHeight);

  // hide nav trays
  $("#nav .close a").click(function(event) {
    event.preventDefault();
    $(this).fadeOut(100);
    $(this).fadeIn(2500);
  });

  // extended navs are hidden by default
  $("#main .section").hide();
  $("#sub").hide();

  // toggle primary nav tray
  $("#nav .main a").has('span').toggleNav();

  // toggle secondary nav tray
  $("#nav .sub .more a").toggleNav();


  // article rating form: indicating selected score
  $(".rate .score a").click(function(event) {
    event.preventDefault();
    $(".rate .score a").removeClass("selected");
    $(this).addClass("selected");
  });

  // article rating form: hide label when input field is active
  $("#rate_reason").focus(function() {
    $(".rate form label").removeClass("show");
    $(".rate form label").addClass("hide");
  });

  // article rating form: show label when input field is inactive
  $("#rate_reason").blur(function() {
    var qs = $("#rate_reason").val().length;
    if (qs < 1) {
      $(".rate form label").removeClass("hide");
      $(".rate form label").addClass("show");
    }
  });


  // feature content item hover state for IE6
  $(".feature .content .main").hover(
    function() {
      $(this).addClass("hover");
    },
    function() {
      $(this).removeClass("hover");
    }
  );

  // feature list item hover state for IE6
  $(".feature .list li").hover(
    function() {
      $(this).addClass("hover");
    },
    function() {
      $(this).removeClass("hover");
    }
  );

  // feature item link click disabled
  $(".feature h3 a").click(function(event) {
    event.preventDefault();
  });

  // feature item click
  $(".feature .content .main").click(function() {
    var url = $(this).children().children().attr("href");
    location.href = url;
    return false;
  });
  $(".feature .list div").click(function() {
    var url = $(this).children().children().attr("href");
    location.href = url;
    return false;
  });


  // newsletter subscription form: hide label when input field is active
  $("#newsletter_text").focus(function() {
    $("form.newsletter label").removeClass("show");
    $("form.newsletter label").addClass("hide");
  });

  // newsletter subscription form: show label when input field is inactive
  $("#newsletter_text").blur(function() {
    var qs = $("#newsletter_text").val().length;
    if (qs < 1) {
      $("form.newsletter label").removeClass("hide");
      $("form.newsletter label").addClass("show");
    }
  });
  

  // input_form form: hide label when input field is active
  $("#input_text").focus(function() {
    $("form.input_form label").removeClass("show");
    $("form.input_form label").addClass("hide");
  });

  // input_form form: show label when input field is inactive
  $("#input_text").blur(function() {
    var qs = $("#input_text").val().length;
    if (qs < 1) {
      $("form.input_form label").removeClass("hide");
      $("form.input_form label").addClass("show");
    }
  });


  // slider: restore to default state with page reload
  $("#slides").scrollTo("#slide1", 0);

  // slider: basic navigation
  $("#slider .nav a").click(function(event) {
    event.preventDefault();                                // disable HREF
    $("#slider .nav a").removeClass("current");            // resets buttons
    $("#slider .nav a span").remove();                     // removes "(Current)" label
    $(this).addClass("current").append(" <span> (Current)</span>");   // sets active button and "(Current)" label
  });
  $("#slider .nav a").eq(0).click(function() {
    $("#slides").scrollTo("#slide1", 1000);
  });
  $("#slider .nav a").eq(1).click(function() {
    $("#slides").scrollTo("#slide2", 1000);
  });
  $("#slider .nav a").eq(2).click(function() {
    $("#slides").scrollTo("#slide3", 1000);
  });
  $("#slider .nav a").eq(3).click(function() {
    $("#slides").scrollTo("#slide4", 1000);
  });

  // slider: previous/next arrows
  $("#slides .arrows a").click(function(event) {
    event.preventDefault();                                // disable HREF
    $("#slider .arrows a span").fadeOut(100);              // hide arrows
    $("#slider .arrows a span").fadeIn(1000);              // show arrows
    $("#slider .nav a").removeClass("current");            // resets buttons
  });
  $("#slide1 .arrows .l a").click(function() {
    $("#slides").scrollTo("#slide4", 1000);
    $("#slider .nav a").eq(3).addClass("current");         // sets active button
  });
  $("#slide1 .arrows .r a").click(function() {
    $("#slides").scrollTo("#slide2", 1000);
    $("#slider .nav a").eq(1).addClass("current");
  });
  $("#slide2 .arrows .l a").click(function() {
    $("#slides").scrollTo("#slide1", 1000);
    $("#slider .nav a").eq(0).addClass("current");
  });
  $("#slide2 .arrows .r a").click(function() {
    $("#slides").scrollTo("#slide3", 1000);
    $("#slider .nav a").eq(2).addClass("current");
  });
  $("#slide3 .arrows .l a").click(function() {
    $("#slides").scrollTo("#slide2", 1000);
    $("#slider .nav a").eq(1).addClass("current");
  });
  $("#slide3 .arrows .r a").click(function() {
    $("#slides").scrollTo("#slide4", 1000);
    $("#slider .nav a").eq(3).addClass("current");
  });
  $("#slide4 .arrows .l a").click(function() {
    $("#slides").scrollTo("#slide3", 1000);
    $("#slider .nav a").eq(2).addClass("current");
  });
  $("#slide4 .arrows .r a").click(function() {
    $("#slides").scrollTo("#slide1", 1000);
    $("#slider .nav a").eq(0).addClass("current");
  });
});
