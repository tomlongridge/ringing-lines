package linegenerator.core.exceptions;

public class RepeatedChangeException extends FalseGridException {

    /** Version ID. */
    private static final long serialVersionUID = 4381069862971665038L;

    /**
     * Constructor.
     * @param pr_Change The change that is repeated.
     */
    public RepeatedChangeException(final String pr_Change) {
        super("Repeated change found: " + pr_Change);
    }

}
