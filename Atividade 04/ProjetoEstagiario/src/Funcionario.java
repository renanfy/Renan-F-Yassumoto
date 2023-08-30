import java.time.LocalDate;

public class Funcionario extends BasePessoa {
    protected String contaCorrente;
    protected String registro;
    protected String cracha;

    public String getContaCorrente() {
        return contaCorrente;
    }

    public void setContaCorrente(String contaCorrente) {
        this.contaCorrente = contaCorrente;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getCracha() {
        return cracha;
    }

    public void setCracha(String cracha) {
        this.cracha = cracha;
    }

    public Funcionario(int codigo, String nome, String email, String telefone, LocalDate dataNascimento, String usuario,
            String senha, String contaCorrente, String registro, String cracha) {
        super(codigo, nome, email, telefone, dataNascimento, usuario, senha);
        this.contaCorrente = contaCorrente;
        this.registro = registro;
        this.cracha = cracha;
    }

    public Funcionario(String contaCorrente, String registro, String cracha) {
        this.contaCorrente = contaCorrente;
        this.registro = registro;
        this.cracha = cracha;
    }

}
