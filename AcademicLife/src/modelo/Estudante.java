package modelo;

import java.time.LocalDateTime;

public class Estudante {
    
    private String eMailE;
    private String senhaE;
    private String nomeE;
    private String nomeInstituicaoE;
    private String materiasCursandoE;
    private String cursoE;
    private LocalDateTime anoInicioE;
    private LocalDateTime anoFinalE;
    private int codigoCE;
    private int idCE;
    
    public Estudante(){}

    public Estudante(String eMailE, String senhaE, String nomeE, String nomeInstituicaoE, String materiasCursandoE, String cursoE, LocalDateTime anoInicioE, LocalDateTime anoFinalE, int codigoCE, int idCE) {
        this.eMailE = eMailE;
        this.senhaE = senhaE;
        this.nomeE = nomeE;
        this.nomeInstituicaoE = nomeInstituicaoE;
        this.materiasCursandoE = materiasCursandoE;
        this.cursoE = cursoE;
        this.anoInicioE = anoInicioE;
        this.anoFinalE = anoFinalE;
        this.codigoCE = codigoCE;
        this.idCE = idCE;
    }

    public String getCursoE() {
        return cursoE;
    }

    public void setCursoE(String cursoE) {
        this.cursoE = cursoE;
    }

    public String geteMailE() {
        return eMailE;
    }

    public void seteMailE(String eMailE) {
        this.eMailE = eMailE;
    }

    public String getSenhaE() {
        return senhaE;
    }

    public void setSenhaE(String senhaE) {
        this.senhaE = senhaE;
    }

    public String getNomeE() {
        return nomeE;
    }

    public void setNomeE(String nomeE) {
        this.nomeE = nomeE;
    }

    public String getNomeInstituicaoE() {
        return nomeInstituicaoE;
    }

    public void setNomeInstituicaoE(String nomeInstituicaoE) {
        this.nomeInstituicaoE = nomeInstituicaoE;
    }

    public String getMateriasCursandoE() {
        return materiasCursandoE;
    }

    public void setMateriasCursandoE(String materiasCursandoE) {
        this.materiasCursandoE = materiasCursandoE;
    }

    public LocalDateTime getAnoInicioE() {
        return anoInicioE;
    }

    public void setAnoInicioE(LocalDateTime anoInicioE) {
        this.anoInicioE = anoInicioE;
    }

    public LocalDateTime getAnoFinalE() {
        return anoFinalE;
    }

    public void setAnoFinalE(LocalDateTime anoFinalE) {
        this.anoFinalE = anoFinalE;
    }

    public int getCodigoCE() {
        return codigoCE;
    }

    public void setCodigoCE(int codigoCE) {
        this.codigoCE = codigoCE;
    }

    public int getIdCE() {
        return idCE;
    }

    public void setIdCE(int idCE) {
        this.idCE = idCE;
    }

    @Override
    public String toString() {
        return "Estudante{" + "eMailE=" + eMailE + ", senhaE=" + senhaE + ", nomeE=" + nomeE + ", nomeInstituicaoE=" + nomeInstituicaoE + ", materiasCursandoE=" + materiasCursandoE + ", cursoE=" + cursoE + ", anoInicioE=" + anoInicioE + ", anoFinalE=" + anoFinalE + ", codigoCE=" + codigoCE + ", idCE=" + idCE + '}';
    }

    
    

    
    
    
}
