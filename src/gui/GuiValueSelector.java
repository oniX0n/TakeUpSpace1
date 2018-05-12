package gui;

import javax.swing.*;
import java.io.File;


public class GuiValueSelector {
    private JButton buttonConfrim;
    private JPanel panelMain;
    private JPanel panelValueSelector;
    private JButton buttonSelectFile;
    private JButton buttonSelectPath;
    private JButton buttonNumber;
    private JTextField textFieldSelectedFile;
    private JTextField textFieldSelectedPath;
    private JTextField textFieldSelectNumber;

    private JFrame frameMain;

    private boolean finished = false;

    private File fileToCopy;
    private String pathWhereToCopy;
    private int numberOfCopies;

    public GuiValueSelector() {

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | UnsupportedLookAndFeelException | IllegalAccessException e) {
            e.printStackTrace();
        }

        buttonSelectFile.addActionListener(e -> selectFile());
        buttonSelectPath.addActionListener(e -> selectPath());
        buttonNumber.addActionListener(e -> selectNumber());
        buttonConfrim.addActionListener(e -> confirmValues());

        frameMain = new JFrame("Value selector");
        frameMain.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frameMain.setSize(500, 200);
        frameMain.add(panelMain);
        frameMain.setVisible(true);
    }

    private void selectFile(){

    }

    private void selectPath(){

    }

    private void selectNumber(){

    }

    private void confirmValues(){

    }

    public boolean isFinished() {
        return finished;
    }

    public File getFileToCopy() {
        return fileToCopy;
    }

    public int getNumberOfCopies() {
        return numberOfCopies;
    }

    public String getPathWhereToCopy() {
        return pathWhereToCopy;
    }
}
