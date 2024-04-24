import javax.swing.*;

public class JanelaComparar extends JFrame {
    private JPanel PainelComparar;


    public JanelaComparar(String title) {
        JFrame frame = new JFrame(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(PainelComparar);
        frame.pack();
        frame.setVisible(true);
    }
}
