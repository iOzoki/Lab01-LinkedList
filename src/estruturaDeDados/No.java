package estruturaDeDados;

public class No {
    int dados;
    No prox;

    public No(int dados){
        this.dados = dados;
        this.prox = null;
    }

    public int getDados() {
        return dados;
    }

    public void setDados(int dados) {
        this.dados = dados;
    }

    public No getProx() {
        return prox;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }
}
