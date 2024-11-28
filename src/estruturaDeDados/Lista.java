package estruturaDeDados;

public class Lista {
    private No cabeca;
    private int tamanho;


    public Lista() {
        this.cabeca = null;
        this.tamanho = 0;
    }

    public void insereInicio(int i) {
        No novaCabeca = new No(i);
        cabeca.setProx(cabeca);
        cabeca = novaCabeca;
    }

    public boolean buscaElemento(int i) {
        if (cabeca == null) {
            return false;
        }
        No atual = cabeca;
        do {
            if (atual.getDados() == i) {
                return true;
            }
            atual = atual.getProx();
        } while (atual != null); 
    
        return false;
    }

    public Object buscaIndice(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscaIndice'");
    }

    public void insereFim(int i) {
        No novaCabeca = new No(i);
        cabeca.setProx(novaCabeca);
        tamanho++;
    }

    public void removeInicio() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeInicio'");
    }

    public void removeFim() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeFim'");
    }

    public void removeIndice(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeIndice'");
    }

    public void insereElementoPosicao(int i, int j) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insereElementoPosicao'");
    }
    
}
