package modelo;

public class Gerencia {
    private String eMailG;
    private String senhaG;
    private String nomeG;

    public Gerencia() {
    }

    public Gerencia(String eMailG, String senhaG, String nomeG) {
        this.eMailG = eMailG;
        this.senhaG = senhaG;
        this.nomeG = nomeG;
    }

    

    public String geteMailG() {
        return eMailG;
    }

    public void seteMailG(String eMailG) {
        this.eMailG = eMailG;
    }

    public String getSenhaG() {
        return senhaG;
    }

    public void setSenhaG(String senhaG) {
        this.senhaG = senhaG;
    }

    public String getNomeG() {
        return nomeG;
    }

    public void setNomeG(String nomeG) {
        this.nomeG = nomeG;
    }

    @Override
    public String toString() {
        return "Gerencia{" + "eMailG=" + eMailG + ", senhaG=" + senhaG + ", nomeG=" + nomeG + '}';
    }

    
    
}
