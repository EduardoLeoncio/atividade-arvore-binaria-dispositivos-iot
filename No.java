import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;

public class No {
    
    private static final AtomicInteger contador = new AtomicInteger(0); // thread-safe, embora nao precisemos

    private final int id;
    private String nome;
    private String localizacao;
    private UnidadeMedida unidadeMedida;
    private double valorAlerta;
    private LinkedList<Leitura> historico;

    public No (String nome, String localizacao, UnidadeMedida unidadeMedida, double valorAlerta) {
        this.id = contador.incrementAndGet();
        this.nome = nome;
        this.localizacao = localizacao;
        this.unidadeMedida = unidadeMedida;
        this.valorAlerta = valorAlerta;
        this.historico = new LinkedList<>();
    }


    No direito;
    No esquerdo;
}
