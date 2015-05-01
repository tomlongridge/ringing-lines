package linegenerator.core.exceptions;

public class CompositionDefinitionException extends Exception {

    /**
     * 
     */
    private static final long serialVersionUID = -8357014711781762874L;
    /**
     * Constructor.
     * @param pr_Message The reason why the notation is invalid
     */
    public CompositionDefinitionException(final String pr_Message) {
        super(pr_Message);
    }

}
