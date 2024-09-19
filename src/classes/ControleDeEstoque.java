package classes;

public class ControleDeEstoque {
    private String idProdutos;
    private String nomeProduto;
    private String qtdEstoque;
    private String precoUnitario;
    private String dataEntrada;
    private String relatorioMovimentacao;

    public String getIdProdutos() {
        return idProdutos;
    }

    public void setIdProdutos(String idProdutos) {
        this.idProdutos = idProdutos;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(String qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public String getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(String precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getRelatorioMovimentacao() {
        return relatorioMovimentacao;
    }

    public void setRelatorioMovimentacao(String relatorioMovimentacao) {
        this.relatorioMovimentacao = relatorioMovimentacao;
    }
}
