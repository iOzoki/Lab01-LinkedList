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
        if(tamanho == 0) {
            cabeca = novaCabeca;
            cabeca.setProx(null);
            tamanho++;
        }
        else{
            cabeca.setProx(cabeca);
            cabeca = novaCabeca;
            tamanho++;
        }
    }

    public boolean buscaElemento(int i) {
       int aux = i;
       do {
           if(cabeca.getDados() == aux){
               return true;
           }
       }
       while (cabeca.getDados() != aux);
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
