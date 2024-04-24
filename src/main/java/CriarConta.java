import javax.swing.*;
import java.util.LinkedList;

public class CriarConta extends JFrame {

    private JPanel PainelCriarConta;

    private JTextField nomeTextField;
    private JTextField apelidoTextField;
    private JTextField emailTextField;
    private JTextField telemovelTextField;
    private JButton confirmarButton;
    private JButton imprimirButton;
    private JTextField passwordTextField;
    //lista de contas
    private LinkedList<Conta> contas;


    public CriarConta(String title) {
        JFrame frame = new JFrame(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(PainelCriarConta);
        frame.pack();
        frame.setVisible(true);
    }

    public CriarConta() {
        String nome = nomeTextField.getText();
        String apelido = apelidoTextField.getText();
        String email = emailTextField.getText();
        String password = passwordTextField.getText();
        String telemovel = telemovelTextField.getText();

        Conta conta = new Conta(nome, apelido, email, password, telemovel);
        contas.add(conta);

    }


}
