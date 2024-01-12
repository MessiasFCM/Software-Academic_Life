package modelo;

public class Chat {
    private int codigoC;
    private String mensagensC;

    public Chat() {
    }

    public Chat(int codigoC, String mensagensC) {
        this.codigoC = codigoC;
        this.mensagensC = mensagensC;
    }

    public int getCodigoC() {
        return codigoC;
    }

    public void setCodigoC(int codigoC) {
        this.codigoC = codigoC;
    }

    public String getMensagensC() {
        return mensagensC;
    }

    public void setMensagensC(String mensagensC) {
        this.mensagensC = mensagensC;
    }

    @Override
    public String toString() {
        return "Comunicacoes{" + "codigoC=" + codigoC + ", mensagensC=" + mensagensC + '}';
    }
    
    
}
