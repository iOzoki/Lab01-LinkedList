package estruturaDeDados;

public class Lista {
    private No cabeca;
    private int tamanho = 0;

    public Lista() {
        this.cabeca = null;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void insereInicio(int i) {
        No novaCabeca = new No(i);
        novaCabeca.setProx(this.cabeca);
        this.cabeca = novaCabeca;
        this.tamanho++;
    }

    public boolean buscaElemento(int i) {
        No atual = cabeca;
        while (atual != null) {
            if (atual.getDados() == i) {
                return true;
            }
            atual = atual.getProx();
        }
        return false;
    }

    public int buscaIndice(int indice) {
        if (indice < 0 || indice >= tamanho) {
            throw new IndexOutOfBoundsException("Índice inválido.");
        }

        No atual = cabeca;
        int contador = 0;
        while (atual != null) {
            if (contador == indice) {
                return atual.getDados();
            }
            atual = atual.getProx();
            contador++;
        }
        return -1;
    }

    public void insereFim(int i) {
        No novoNo = new No(i);

        if (cabeca == null) {
            cabeca = novoNo;
        } else {
            No atual = cabeca;
            while (atual.getProx() != null) {
                atual = atual.getProx();
            }
            atual.setProx(novoNo);
        }
        tamanho++;
    }

    public void removeInicio() {
        if (cabeca == null) {
            throw new IllegalStateException("A lista está vazia.");
        }

        cabeca = cabeca.getProx();
        tamanho--;
    }

    public void removeFim() {
        if (cabeca == null) {
            throw new IllegalStateException("A lista está vazia.");
        }

        if (cabeca.getProx() == null) {
            cabeca = null;
        } else {
            No atual = cabeca;
            while (atual.getProx().getProx() != null) {
                atual = atual.getProx();
            }
            atual.setProx(null);
        }
        tamanho--;
    }

    public void removeIndice(int indice) {
        if (indice < 0 || indice >= tamanho) {
            throw new IndexOutOfBoundsException("Índice inválido.");
        }

        if (indice == 0) {
            removeInicio();
        } else {
            No atual = cabeca;
            for (int i = 0; i < indice - 1; i++) {
                atual = atual.getProx();
            }
            atual.setProx(atual.getProx().getProx());
            tamanho--;
        }
    }

    public void insereElementoPosicao(int i, int posicao) {
        if (posicao < 0 || posicao > tamanho) {
            throw new IndexOutOfBoundsException("Posição inválida.");
        }

        if (posicao == 0) {
            insereInicio(i);
        } else if (posicao == tamanho) {
            insereFim(i);
        } else {
            No novoNo = new No(i);
            No atual = cabeca;

            for (int j = 0; j < posicao - 1; j++) {
                atual = atual.getProx();
            }
            novoNo.setProx(atual.getProx());
            atual.setProx(novoNo);
            tamanho++;
        }
    }
}