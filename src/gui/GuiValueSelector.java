package gui;

import javax.swing.*;


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
}
