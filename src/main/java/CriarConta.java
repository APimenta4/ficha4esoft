import javax.swing.*;
public class CriarConta extends JFrame {

    private JPanel PainelCriarConta;

    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JPasswordField passwordField1;
    private JTextField textField4;
    private JButton continuarParaConfirmarOsButton;

    public CriarConta(String title) {
        JFrame frame = new JFrame(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(PainelCriarConta);
        frame.pack();
        frame.setVisible(true);
    }

    public void criarConta(){
        String nome = textField1.getText();
        String apelido = textField2.getText();
        String email = textField3.getText();
        String password = passwordField1.getText();
        String telemovel = textField4.getText();
    }





}
