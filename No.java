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

    No direito;
    No esquerdo;

    public No (String nome, String localizacao, UnidadeMedida unidadeMedida, double valorAlerta) {
        this.id = contador.incrementAndGet();
        this.nome = nome;
        this.localizacao = localizacao;
        this.unidadeMedida = unidadeMedida;
        this.valorAlerta = valorAlerta;
        this.historico = new LinkedList<>();
    }

    public void adicionarLeitura(double valor) {
        if (historico.size() == 5) {
            historico.removeFirst(); // remove a leitura mais antiga (estrutura de fila caso tenha um tamanho igual ao limite - 5)
        }
        historico.add(new Leitura(valor));
    }

    public int getId() {
        return id;
    }

    public LinkedList<Leitura> getHistorico() {
        return historico;
    }



}
