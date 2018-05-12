package gui;

import apprun.Main;

import javax.swing.*;
import java.io.File;


public class GuiValueSelector {
    private JButton buttonConfirm;
    private JPanel panelMain;
    private JPanel panelValueSelector;
    private JButton buttonSelectFile;
    private JButton buttonSelectPath;
    private JButton buttonNumber;
    private JTextField textFieldSelectedFile;
    private JTextField textFieldSelectedPath;
    private JTextField textFieldSelectNumber;

    private JFrame frameMain;

    private File fileToCopy = null;
    private String pathWhereToCopy = null;
    private int numberOfCopies = 0;

    public GuiValueSelector() {

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | UnsupportedLookAndFeelException | IllegalAccessException e) {
            e.printStackTrace();
        }

        buttonSelectFile.addActionListener(e -> selectFile());
        buttonSelectPath.addActionListener(e -> selectPath());
        buttonNumber.addActionListener(e -> selectNumber());
        buttonConfirm.addActionListener(e -> confirmValues());

        frameMain = new JFrame("Value selector");
        frameMain.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frameMain.setSize(500, 200);
        frameMain.add(panelMain);
        frameMain.setVisible(true);
    }

    private void selectFile(){
        fileToCopy = fileChooserFile();
        if(!(fileToCopy == null)){
            textFieldSelectedFile.setText(fileToCopy.getAbsolutePath());
        }
        else {
            textFieldSelectedFile.setText(null);
        }
    }

    private void selectPath(){
        pathWhereToCopy = fileChooserPath();
        textFieldSelectedPath.setText(pathWhereToCopy);
    }

    private void selectNumber(){
        if(!textFieldSelectNumber.isEditable()){
            textFieldSelectNumber.setText(null);
            textFieldSelectNumber.setEditable(true);
            buttonNumber.setText("Set");
            numberOfCopies = 0;
            return;
        }

        try{
            int inputNumber = Integer.parseInt(textFieldSelectNumber.getText());

            if(inputNumber < 1){
                JOptionPane.showMessageDialog(null, "Input must be greater than 0!");
                textFieldSelectNumber.setText(null);
            }
            else {
                numberOfCopies = inputNumber;
                textFieldSelectNumber.setEditable(false);
                buttonNumber.setText("Edit");
            }

        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Illegal input!");
            textFieldSelectNumber.setText(null);
        }
    }

    private void confirmValues(){
        if((fileToCopy == null) || (pathWhereToCopy == null) || (numberOfCopies == 0)){
            JOptionPane.showMessageDialog(null, "Select all values first!");
        }
        else {
            Main.afterGui();
            frameMain.dispose();
        }
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

    private File fileChooserFile(){
        JFileChooser jFC = new JFileChooser();
        jFC.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int returnValue = jFC.showOpenDialog(null);
        if(returnValue == JFileChooser.APPROVE_OPTION){
            return jFC.getSelectedFile();
        }
        return null;
    }

    private String fileChooserPath(){
        JFileChooser jFC = new JFileChooser();
        jFC.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int returnValue = jFC.showOpenDialog(null);
        if(returnValue == JFileChooser.APPROVE_OPTION){
            return jFC.getSelectedFile().getAbsolutePath();
        }
        return null;
    }
}
