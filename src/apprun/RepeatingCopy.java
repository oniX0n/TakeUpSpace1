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
}
