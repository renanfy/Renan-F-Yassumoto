public class App {
    public static void main(String[] args) throws Exception {

        // VALORES QUE NÃO SÃO GLOBAIS
        // - eixos: int
        // - pesoLiquido: double
        // - portas: int
        // - codigoRenavam: string

        Caminhao Caminhao = new Caminhao();
        Caminhao.setCodigo(98765);
        Caminhao.setNome("Caminhão de Carga 123");
        Caminhao.setModelo("Modelo XYZ");
        Caminhao.setCor("Vermelho");
        Caminhao.setChassi("XYZ987654ABC321");
        Caminhao.setPlaca("ABC-1234");
        Caminhao.setAnoModelo(2022);
        Caminhao.setAnoFabricacao(2021);
        Caminhao.setPesoTotal(18000.0);
        Caminhao.setAssentos(3);
        Caminhao.setRodas(10);
        Caminhao.setFabricante("FabricanteCorp");
        Caminhao.setPotencia(350.0);
        Caminhao.setTipoCombustivel("Diesel");
        Caminhao.setNomeProprietario("Maria da Silva");
        Caminhao.setEstadoUF("SP");
        Caminhao.setCidadeUF("São Paulo");
        Caminhao.setTipoVeiculo("Caminhão de Carga");
        Caminhao.setQtdeMotores(1);
        Caminhao.setQtdeOcupantes(2);
        Caminhao.setEixos(3);
        Caminhao.setPesoLiquido(16000.0);
        Caminhao.setPortas(2);
        Caminhao.setCodigoRenavam("12345678901");
        Caminhao.imprimir();
    }
}
