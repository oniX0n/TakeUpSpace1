package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

        frameMain = new JFrame("Select values");
        frameMain.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frameMain.setSize(200, 500);
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
