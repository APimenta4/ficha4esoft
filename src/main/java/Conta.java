import com.sun.jdi.event.StepEvent;

public class Conta {
    private String nome;
    private String apelido;

    private String email;
    private String senha;
    private String telemovel;

    // Construtor
    public Conta(String nome, String apelido, String email, String senha, String telemovel) {
        this.nome = nome;
        this.apelido = apelido;
        this.email = email;
        this.senha = senha;
        this.telemovel = telemovel;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelemovel() {
        return telemovel;
    }

    public void setTelemovel(String telemovel) {
        this.telemovel = telemovel;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
