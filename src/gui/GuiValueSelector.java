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

    public GuiValueSelector() {

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | UnsupportedLookAndFeelException | IllegalAccessException e) {
            e.printStackTrace();
        }

        buttonSelectFile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        buttonSelectPath.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        buttonNumber.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        buttonConfrim.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
