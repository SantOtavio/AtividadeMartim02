package classes;

public class ContaFinanceira {
    private float saldoAtual;
    private float depositos;
    private float limiteCredito;

    public float getSaldoAtual() {
        return saldoAtual;
    }

    public void setSaldoAtual(float saldoAtual) {
        this.saldoAtual = saldoAtual;
    }

    public float getDepositos() {
        return depositos;
    }

    public void setDepositos(float depositos) {
        this.depositos = depositos;
    }

    public float getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(float limiteCredito) {
        this.limiteCredito = limiteCredito;
    }
}
