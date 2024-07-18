package ui;
import aplicacao.ACMECalculator;
import ui.aplicacao;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class telaCalculadora extends javax.swing.JDialog {
    ACMECalculator acme;
    private javax.swing.JPanel contentPane;
    private JButton equalButton;
    private JButton eraseButton;
    private JButton subButton;
    private JButton sumButton;
    private JButton divButton;
    private JButton xButton;
    private JButton onebyxButton;
    private JButton potButton;
    private JButton rootButton;
    private JButton nineButton;
    private JButton eightButton;
    private JButton sevenButton;
    private JButton sixButton;
    private JButton fiveButton;
    private JButton fourButton;
    private JButton oneButton;
    private JButton twoButton;
    private JButton threeButton;
    private JButton virgButton;
    private JButton zeroButton;
    private JButton mmButton;
    private JButton cButton;
    private JButton ceButton;
    private JButton porcentagemButton;
    private JTextArea textArea;
    private javax.swing.JButton buttonOK;

    public telaCalculadora() {
        acme = new ACMECalculator();
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        cButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText("");
                acme.limparLista();
            }
        });

        ceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText("");
            }
        });

        eraseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acme.apagar();
                textArea.setText(acme.getCalculos().toString());
            }
        });

        zeroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acme.addNum("0");
                textArea.setText(acme.getCalculos().toString());
            }
        });




    }

    @Override
    public JPanel getContentPane() {
        return contentPane;
    }
}
