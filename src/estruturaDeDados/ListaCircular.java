public class ListaCircular {
    private No cabeca;
    private No cauda;
    private int tamanho;

    public ListaCircular() {
        this.cabeca = null;
        this.cauda = null;
        this.tamanho = 0;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void insereInicio(int i) {
        No novoNo = new No(i);
        if (tamanho == 0) {
            cabeca = novoNo;
            cauda = novoNo;
            cauda.setProx(cabeca); // Circularidade
        } else {
            novoNo.setProx(cabeca);
            cabeca = novoNo;
            cauda.setProx(cabeca); // Circularidade
        }
        tamanho++;
    }

    public boolean buscaElemento(int i) {
        if (tamanho == 0) {
            return false;
        }

        No atual = cabeca;
        do {
            if (atual.getDados() == i) {
                return true;
            }
            atual = atual.getProx();
        } while (atual != cabeca);

        return false;
    }

    public int buscaIndice(int indice) {
        if (indice < 0 || indice >= tamanho) {
            throw new IndexOutOfBoundsException("Índice inválido.");
        }

        No atual = cabeca;
        for (int i = 0; i < indice; i++) {
            atual = atual.getProx();
        }
        return atual.getDados();
    }

    public void insereFim(int i) {
        No novoNo = new No(i);
        if (tamanho == 0) {
            cabeca = novoNo;
            cauda = novoNo;
            cauda.setProx(cabeca); // Circularidade
        } else {
            cauda.setProx(novoNo);
            cauda = novoNo;
            cauda.setProx(cabeca); // Circularidade
        }
        tamanho++;
    }

    public void removeInicio() {
        if (tamanho == 0) {
            throw new IllegalStateException("A lista está vazia.");
        }

        if (tamanho == 1) {
            cabeca = null;
            cauda = null;
        } else {
            cabeca = cabeca.getProx();
            cauda.setProx(cabeca); // Manter circularidade
        }
        tamanho--;
    }

    public void removeFim() {
        if (tamanho == 0) {
            throw new IllegalStateException("A lista está vazia.");
        }

        if (tamanho == 1) {
            cabeca = null;
            cauda = null;
        } else {
            No atual = cabeca;
            while (atual.getProx() != cauda) {
                atual = atual.getProx();
            }
            atual.setProx(cabeca);
            cauda = atual;
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

            if (indice == tamanho - 1) {
                cauda = atual;
            }
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