import javax.swing.*;

public class JanelaPrincipal extends JFrame{


    private JPanel PainelPrincipal;


    public static void main(String[] args) {
        JFrame frame = new JanelaPrincipal("MinesFinder");
        frame.setVisible(true);
    }


    public JanelaPrincipal(String title) {
        super(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(PainelPrincipal);
        pack();
    }
}
