import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        Aluno a1 = new Aluno();
        a1.setCodigo(10);
        a1.setCpf("12345678912");
        a1.setDataInsercao(LocalDate.of(2022, 04, 01));
        a1.setDataMatricula(LocalDate.of(2022, 01, 01));
        a1.setDataNascimento(LocalDate.of(2004, 07, 16));
        a1.setEndereco("Avenida Afonso Pena, 2623");
        a1.setMatricula("235131");
        a1.setNome("Renan");
        a1.setRg("2543777");
        a1.setTelefone("992543333");

        Professor p1 = new Professor();
        p1.setCodigo(45);
        p1.setCpf("12332112332");
        p1.setDataContratacao(LocalDate.of(2018, 8, 8));
        p1.setDataInsercao(LocalDate.of(2002, 02, 22));
        p1.setDataNascimento(LocalDate.of(2002, 04, 10));
        p1.setEndereco("Rua dos Alpes, 33");
        p1.setNome("Marcos");
        p1.setRegistro("abc123");
        p1.setRg("12312322");
        p1.setTelefone("12331233");
    }

}
