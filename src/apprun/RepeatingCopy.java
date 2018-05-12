package apprun;

import java.io.File;

class RepeatingCopy {
    private File sourceFile;
    private String destinationPath;
    private int number;

    RepeatingCopy(File sourceFileInput, String destinationPathInput, int numberInput){
        sourceFile = sourceFileInput;
        destinationPath = destinationPathInput;
        number = numberInput;
    }

    void copy(){
        File destinationFile;

        for (int i = 0; i < number; i++){
            destinationFile = new File(
                    destinationPath
                            + "\\"
                            + (sourceFile.getName().substring(0, sourceFile.getName().indexOf(".")))
                            + Integer.toString(i)
                            + ".txt"
            );
        }
    }
}
