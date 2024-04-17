import javax.swing.*;

public class JanelaPesquisar extends JFrame {
    private JPanel PainelPesquisar;

    public JanelaPesquisar(String title) {
        JFrame frame = new JFrame(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(PainelPesquisar);
        frame.pack();
        frame.setVisible(true);
    }
}
