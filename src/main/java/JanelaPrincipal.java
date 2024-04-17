import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JanelaPrincipal extends JFrame{


    private JPanel PainelPrincipal;
    private JButton comprar;
    private JButton pesquisar;
    private JButton compararButton;

    private JPanel PainelComprar;


    public void main(String[] args) {
        JFrame frame = new JanelaPrincipal("MinesFinder");
        frame.setVisible(true);

        //if "comprar" is clicked, open PainelComprar in JanelaComprar
        comprar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JanelaComprar("Comprar");
                frame.setVisible(true);
            }
        });


    }


    public JanelaPrincipal(String title) {
        super(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(PainelPrincipal);
        pack();
    }
}
