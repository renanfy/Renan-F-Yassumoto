public class Onibus extends BaseVeiculo implements IImprimir {
    protected int eixos;
    protected double pesoLiquido;
    protected int portas;
    protected String codigoRenavam;

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

    public double getPesoLiquido() {
        return pesoLiquido;
    }

    public void setPesoLiquido(double pesoLiquido) {
        this.pesoLiquido = pesoLiquido;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public String getCodigoRenavam() {
        return codigoRenavam;
    }

    public void setCodigoRenavam(String codigoRenavam) {
        this.codigoRenavam = codigoRenavam;
    }

    public Onibus() {
    }

    public Onibus(int codigo, String nome, String modelo, String cor, String chassi, String placa, int anoModelo,
            int anoFabricacao, double pesoTotal, int assentos, int rodas, String fabricante, double potencia,
            String tipoCombustivel, String nomeProprietario, String estadoUF, String cidadeUF, String tipoVeiculo,
            int qtdeMotores, int qtdeOcupantes) {
        super(codigo, nome, modelo, cor, chassi, placa, anoModelo, anoFabricacao, pesoTotal, assentos, rodas,
                fabricante, potencia, tipoCombustivel, nomeProprietario, estadoUF, cidadeUF, tipoVeiculo, qtdeMotores,
                qtdeOcupantes);
    }

    @Override
    public void imprimir() {
        System.out.println("------------ ÔNIBUS --------------");
        System.out.println("Código: " + this.getCodigo());
        System.out.println("Nome: " + this.getNome());
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Chassi: " + this.getChassi());
        System.out.println("Placa: " + this.getPlaca());
        System.out.println("Ano do Modelo: " + this.getAnoModelo());
        System.out.println("Ano de Fabricação: " + this.getAnoFabricacao());
        System.out.println("Peso Total: " + this.getPesoTotal());
        System.out.println("Assentos: " + this.getAssentos());
        System.out.println("Rodas: " + this.getRodas());
        System.out.println("Fabricante: " + this.getFabricante());
        System.out.println("Potência: " + this.getPotencia());
        System.out.println("Tipo de Combustível: " + this.getTipoCombustivel());
        System.out.println("Nome do Proprietário: " + this.getNomeProprietario());
        System.out.println("Estado UF: " + this.getEstadoUF());
        System.out.println("Cidade UF: " + this.getCidadeUF());
        System.out.println("Tipo do Veículo: " + this.getTipoVeiculo());
        System.out.println("Quantidade de Motores: " + this.getQtdeMotores());
        System.out.println("Quantidade de Ocupantes: " + this.getQtdeOcupantes());
        System.out.println("Eixos: " + this.getEixos());
        System.out.println("Peso Liquído: " + this.getPesoLiquido());
        System.out.println("Portas: " + this.getPortas());
        System.out.println("Código RENAVAM: " + this.getCodigoRenavam());
        System.out.println("------------ ÔNIBUS --------------");

    }

}
