import javax.swing.*;

public class JanelaComprar extends JFrame{
    private JPanel PainelComprar;

    public JanelaComprar(String title) {
        JFrame frame = new JFrame(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(PainelComprar);
        frame.pack();
        frame.setVisible(true);
    }

}
