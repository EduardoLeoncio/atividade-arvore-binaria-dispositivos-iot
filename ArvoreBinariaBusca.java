public class ArvoreBinariaBusca {
    
    private No raiz;
    private int quantidadeNos;

    public ArvoreBinariaBusca() {
        this.raiz = null;
        this.quantidadeNos = 0;
    }

    public boolean estaVazia() {
        return raiz == null;
    }

    public int quantidadeNos() {
        return quantidadeNos;
    }

    public void inserir(String nome, String localizacao, UnidadeMedida unidadeMedida, double valorAlerta) {

        if (estaVazia()) {
            raiz = new No(nome, localizacao, unidadeMedida, valorAlerta);
            quantidadeNos++;
            return;
        }

        No atual = raiz;
        No pai = null;

        while (atual != null) {
            pai = atual;
            if () {

            }
        }
    }
}
