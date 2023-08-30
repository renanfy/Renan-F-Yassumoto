import java.time.LocalDate;

public class Passageiro extends BasePessoa {
    protected String numeroCartao;
    protected String documento;
    protected String registro;

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public Passageiro(int codigo, String nome, String email, String telefone, LocalDate dataNascimento, String usuario,
            String senha, String numeroCartao, String documento, String registro) {
        super(codigo, nome, email, telefone, dataNascimento, usuario, senha);
        this.numeroCartao = numeroCartao;
        this.documento = documento;
        this.registro = registro;
    }

    public Passageiro(String numeroCartao, String documento, String registro) {
        this.numeroCartao = numeroCartao;
        this.documento = documento;
        this.registro = registro;
    }

}
