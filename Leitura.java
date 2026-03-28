import java.time.LocalDateTime;

public class Leitura {
    
    private double valor;
    private LocalDateTime dataHora;

    public Leitura(double valor) {
        this.valor = valor;
        this.dataHora = LocalDateTime.now();
    }

    public double getValor() {
        return valor;
    }
    
    public LocalDateTime getDataHora() {
        return dataHora;
    }

    @Override
    public String toString() {
        return "VALOR: " + valor + " | DATA_HORA: " + dataHora;
    }
}
