package apprun;

import gui.GuiValueSelector;

public class Main {
    private static GuiValueSelector guiValueSelector;

    public static void main(String[] args) {
        guiValueSelector = new GuiValueSelector();
    }

    public static void afterGui(){
        RepeatingCopy repeatingCopier = new RepeatingCopy(
                guiValueSelector.getFileToCopy(),
                guiValueSelector.getPathWhereToCopy(),
                guiValueSelector.getNumberOfCopies()
        );
        repeatingCopier.copy();
    }
}
