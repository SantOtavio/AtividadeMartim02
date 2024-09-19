package classes;

public class VendasComLimiteDeGastos {
    private float valorCompra;
    private float limite;
    private float saldoDisponivel;
    private String tipoProduto;
    private String dataTransacao;

    public float getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(float valorCompra) {
        this.valorCompra = valorCompra;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public float getSaldoDisponivel() {
        return saldoDisponivel;
    }

    public void setSaldoDisponivel(float saldoDisponivel) {
        this.saldoDisponivel = saldoDisponivel;
    }

    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public String getDataTransacao() {
        return dataTransacao;
    }

    public void setDataTransacao(String dataTransacao) {
        this.dataTransacao = dataTransacao;
    }
}
