package linegenerator.core.exceptions;

public class FalseGridException extends Exception {

    /** Version ID. */
    private static final long serialVersionUID = 4381069862971665038L;

    /**
     * Constructor.
     * @param pr_Message The reason why the notation is invalid
     */
    public FalseGridException(final String pr_Message) {
        super(pr_Message);
    }

}
