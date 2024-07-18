package ui;
import ui.telaCalculadora;

import javax.swing.*;

public class aplicacao extends JFrame {

    private telaCalculadora telaCalculadora = new telaCalculadora();
    public aplicacao() {
        JPanel painel = telaCalculadora.getContentPane();
        add(painel);
        setSize(400,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}
