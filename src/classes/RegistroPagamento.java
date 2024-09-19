package classes;

public class RegistroPagamento {
    private String dataPag;
    private float valorPago;
    private String metodoPagamento;
    private String associadoPagador;

    public String getDataPag() {
        return dataPag;
    }

    public void setDataPag(String dataPag) {
        this.dataPag = dataPag;
    }

    public float getValorPago() {
        return valorPago;
    }

    public void setValorPago(float valorPago) {
        this.valorPago = valorPago;
    }

    public String getMetodoPagamento() {
        return metodoPagamento;
    }

    public void setMetodoPagamento(String metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public String getAssociadoPagador() {
        return associadoPagador;
    }

    public void setAssociadoPagador(String associadoPagador) {
        this.associadoPagador = associadoPagador;
    }
}
