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
                acme.limpar();
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
                textArea.setText(acme.getSb().toString());
            }
        });

        zeroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acme.addNum('0');
                textArea.setText(acme.getSb().toString());
            }
        });

        oneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acme.addNum('1');
                textArea.setText(acme.getSb().toString());
            }
        });

        twoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acme.addNum('2');
                textArea.setText(acme.getSb().toString());
            }
        });

        threeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acme.addNum('3');
                textArea.setText(acme.getSb().toString());
            }
        });

        fourButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acme.addNum('4');
                textArea.setText(acme.getSb().toString());
            }
        });

        fiveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acme.addNum('5');
                textArea.setText(acme.getSb().toString());
            }
        });

        sixButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acme.addNum('6');
                textArea.setText(acme.getSb().toString());
            }
        });

        sevenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acme.addNum('7');
                textArea.setText(acme.getSb().toString());
            }
        });

        eightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acme.addNum('8');
                textArea.setText(acme.getSb().toString());
            }
        });

        nineButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acme.addNum('9');
                textArea.setText(acme.getSb().toString());
            }
        });

        virgButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acme.addNum(',');
                textArea.setText(acme.getSb().toString());
            }
        });

        sumButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acme.addNum('+');
                textArea.setText(acme.getSb().toString());
            }
        });

        subButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        xButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        divButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        equalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acme.result();
                textArea.setText(acme.getSb().toString());
            }
        });

        porcentagemButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        rootButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        onebyxButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        potButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        mmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    @Override
    public JPanel getContentPane() {
        return contentPane;
    }
}
