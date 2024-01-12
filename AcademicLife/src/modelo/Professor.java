package modelo;

public class Professor {
    private String emailP;
    private String senhaP;
    private String nomeP;
    private String nomeInstituicaoP;
    private String materiaP;
    private int codigoCP;
    private int idCP;
    
    public Professor() {
    }

    public Professor(String emailP, String senhaP, String nomeP, String nomeInstituicaoP, String materiaP, int codigoCP, int idCP) {
        this.emailP = emailP;
        this.senhaP = senhaP;
        this.nomeP = nomeP;
        this.nomeInstituicaoP = nomeInstituicaoP;
        this.materiaP = materiaP;
        this.codigoCP = codigoCP;
        this.idCP = idCP;
    }

    
    public String getEmailP() {
        return emailP;
    }

    public void setEmailP(String emailP) {
        this.emailP = emailP;
    }

    public String getSenhaP() {
        return senhaP;
    }

    public void setSenhaP(String senhaP) {
        this.senhaP = senhaP;
    }

    public String getNomeP() {
        return nomeP;
    }

    public void setNomeP(String nomeP) {
        this.nomeP = nomeP;
    }
    
    public String getNomeInstituicaoP() {
        return nomeInstituicaoP;
    }

    public void setNomeInstituicaoP(String nomeInstituicaoP) {
        this.nomeInstituicaoP = nomeInstituicaoP;
    }

    public String getMateriaP() {
        return materiaP;
    }

    public void setMateriaP(String materiaP) {
        this.materiaP = materiaP;
    }

    public int getCodigoCP() {
        return codigoCP;
    }

    public void setCodigoCP(int codigoCP) {
        this.codigoCP = codigoCP;
    }

    public int getIdCP() {
        return idCP;
    }

    public void setIdCP(int idCP) {
        this.idCP = idCP;
    }

    @Override
    public String toString() {
        return "Professor{" + "emailP=" + emailP + ", senhaP=" + senhaP + ", nomeP=" + nomeP + ", nomeInstituicaoP=" + nomeInstituicaoP + ", materiaP=" + materiaP + ", codigoCP=" + codigoCP + ", idCP=" + idCP + '}';
    }

    
}
