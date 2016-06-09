package appsupp.common;

public class ApplicationException extends RuntimeException {

	private static final long serialVersionUID = 1;

	private static final String SYSTEM_ERROR_MESSAGE = "A serious application error occurred!  Please contact the system administrator.";

	/**
	 * Construct an error message for the given error message and cause.
	 * 
	 * @param theSystemMessage
	 *            System message.
	 * @param theErrorMessage
	 *            Error message.
	 * @param theInitialCause
	 *            Cause of the exception.
	 * 
	 * @return an error message to display.
	 */
	static String composeErrorMessage(String theSystemMessage,
			String theErrorMessage, Throwable theInitialCause) {

		return (theSystemMessage != null ? theSystemMessage : "")
				+ (theErrorMessage != null ? "\n\n" + theErrorMessage : "")
				+ (theInitialCause != null ? ("\n\n"
						+ theInitialCause.getClass().getName() + ": " + theInitialCause
						.getMessage()) : "");
	}

	/**
	 * Constructor with error message.
	 * 
	 * @param theErrorMessage
	 *            Error message.
	 */
	public ApplicationException(String theErrorMessage) {
		this(theErrorMessage, null);
	}

	/**
	 * Constructor with originated throwable.
	 * 
	 * @param theInitialCause
	 *            Cause of the exception.
	 */
	public ApplicationException(Throwable theInitialCause) {
		this(null, theInitialCause);
	}

	/**
	 * Constructor with error message and originated throwable.
	 * 
	 * @param theErrorMessage
	 *            Error message.
	 * @param theInitialCause
	 *            Cause of the exception.
	 */
	public ApplicationException(String theErrorMessage,
			Throwable theInitialCause) {

		super(ApplicationException.composeErrorMessage(
				ApplicationException.SYSTEM_ERROR_MESSAGE, theErrorMessage,
				theInitialCause), theInitialCause);
	}
}
