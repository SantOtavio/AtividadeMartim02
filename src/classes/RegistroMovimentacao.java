package classes;

public class RegistroMovimentacao {
    private String saldo;
    private float depositos;
    private float debitos;
    private float limiteCredito;
    private String historicoTransacoes;

    public String getSaldo() {
        return saldo;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }

    public float getDepositos() {
        return depositos;
    }

    public void setDepositos(float depositos) {
        this.depositos = depositos;
    }

    public float getDebitos() {
        return debitos;
    }

    public void setDebitos(float debitos) {
        this.debitos = debitos;
    }

    public float getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(float limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public String getHistoricoTransacoes() {
        return historicoTransacoes;
    }

    public void setHistoricoTransacoes(String historicoTransacoes) {
        this.historicoTransacoes = historicoTransacoes;
    }
}
