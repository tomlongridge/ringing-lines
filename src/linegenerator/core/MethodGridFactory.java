package linegenerator.core;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MethodGridFactory extends AbstractMethodGenerator {
    
    public MethodGridFactory(final File pr_OutputDir) {
        super(pr_OutputDir);
    }
    
    public boolean generate(final Method pr_Method, final boolean pr_Overwrite) throws IOException
    {
        final File outputFile = new File(getOutputDirectory().getAbsolutePath() + 
                                         File.separator + 
                                         pr_Method.getFileIdentifier() +
                                         ".grid" +
                                         ".txt");
        if (!pr_Overwrite && outputFile.exists()) {
            return false;
        }

        final FileWriter writer = new FileWriter(outputFile, false);

        final Notation notation = new Notation();
        for (int i = 0; i < pr_Method.getPlaceNotation().length; i++) {
            notation.addAll(pr_Method.getLeadNotation(LeadType.PLAIN, i));
        }
        
        final Grid grid = new Grid(pr_Method.getStage());
        grid.add(notation, pr_Method.getStartOffset());
        grid.add(notation, 0, pr_Method.getStartOffset() - 1);
        
        while (!grid.endsInRounds()) {
        	grid.add(notation);
        }
        
        writer.write(grid.toString());
        
        writer.write("\n");
        writer.close();
        
        return true;
    }
    
}
