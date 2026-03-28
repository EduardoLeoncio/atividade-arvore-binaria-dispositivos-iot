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

    public void inserir(No novo) {

        if (estaVazia()) { // se a arvore esta vazia basta raiz "apontar" para o novo no e incrementarmos o contador de nos
            raiz = novo;
            quantidadeNos++;
            return;
        }

        No atual = raiz;
        No pai = null;

        while (atual != null) {
            pai = atual;

            if (novo.getId() < atual.getId()) { // nossa condicao para organizacao da ABB se baseia no valor do ID de cada dispositivo
                atual = atual.esquerdo; // se o novo no possuir um id inferior ao atual ele "vai para esquerda", porem, ele sempre sera superior aos ids anteriores, eai?
            } else if (novo.getId() > atual.getId()) {
                atual = atual.direito;
            } else {
                return; // return para o caso de ID duplicado, o que nao deve acontecer
            }
        }

        if (novo.getId() < pai.getId()) {
            pai.esquerdo = novo;
        } else {
            pai.direito = novo;
        }

        quantidadeNos++;
    }

    public No buscar(int id) { // pesquisa binaria
        No atual = raiz;

        while (atual != null) {
            if (id == atual.getId()) {
                return atual;
            } else if (id > atual.getId()) {
                atual = atual.direito;
            } else {
                atual = atual.esquerdo;
            }
        }
        return null; // nao achou o No com o respectivo id na arvore e, portanto, retornou null
    }

    public boolean existe(int id) {
        return buscar(id) != null;
    }

    public void remover(int id) {
        No atual = raiz;
        No pai = null;

        while (atual != null && atual.getId() != id) {
            pai = atual;

            if (id < atual.getId()) {
                atual = atual.esquerdo;
            } else {
                atual = atual.direito;
            }
        }

        if (atual == null) {
            return;
        }

        // achamos o id - caso 1 (no folha - 0 filhos) e 2 (no com apenas 1 filho)

        if (atual.esquerdo == null || atual.direito == null) {
            No filho = (atual.esquerdo != null) ? atual.esquerdo : atual.direito;

            if (pai == null) {
                raiz = filho; // arvore (raiz) aponta para null - fim da arvore
            } else if (atual == pai.esquerdo) {
                pai.esquerdo = filho;
            } else {
                pai.direito = filho; // pai, do atual, aponta para filho (avo assumi "neto")
            }
        }

        // caso 3 (no com 2 filhos)

        else {
            No sucessor = atual.direito;
            No paiSucessor = atual;

            while (sucessor.esquerdo != null) {
                paiSucessor = sucessor;
                sucessor = sucessor.esquerdo;
            }

            atual = copiarDados(sucessor, atual);

            if (paiSucessor == atual) {
                paiSucessor.direito = sucessor.direito;
            } else {
                paiSucessor.esquerdo = sucessor.direito;
            }
        }
        quantidadeNos--;
    }

    private No copiarDados(No origem, No destino) {
        destino = origem;
        return destino;
    }
}
