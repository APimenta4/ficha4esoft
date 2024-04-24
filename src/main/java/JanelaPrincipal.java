import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JanelaPrincipal extends JFrame{

    private JPanel PainelPrincipal;
    private JButton comprar;
    private JButton pesquisar;
    private JButton comparar;
    private JButton criarContaButton;


    public static void main(String[] args) {
        JFrame frame = new JanelaPrincipal("App vendas");
        frame.setVisible(true);
    }

    public JanelaPrincipal(String title) {
        super(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(PainelPrincipal);
        pack();

        comprar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JanelaComprar frame = new JanelaComprar("Comprar");
                frame.setVisible(true);
            }
        });

        pesquisar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("Pesquisar");
                frame.setVisible(true);
            }
        });

        comparar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("Comparar");
                frame.setVisible(true);
            }
        });

        criarContaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new CriarConta("Criar Conta");
                frame.setVisible(true);
            }
        });
    }
}