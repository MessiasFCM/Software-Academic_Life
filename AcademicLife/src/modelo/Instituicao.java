package modelo;

public class Instituicao {
    private String nomeInstituicaoI;
    private String cursosI;
    private String materiasI;
    private String localizacaoI;
    private String diretorI;
    private int anosDaIntituicaoI;
    private String contatoI;

    public Instituicao() {
    }

    public Instituicao(String nomeInstituicaoI, String cursosI, String materiasI, String localizacaoI, String diretorI, int anosDaIntituicaoI, String contatoI) {
        this.nomeInstituicaoI = nomeInstituicaoI;
        this.cursosI = cursosI;
        this.materiasI = materiasI;
        this.localizacaoI = localizacaoI;
        this.diretorI = diretorI;
        this.anosDaIntituicaoI = anosDaIntituicaoI;
        this.contatoI = contatoI;
    }

    public String getNomeInstituicaoI() {
        return nomeInstituicaoI;
    }

    public void setNomeInstituicaoI(String nomeInstituicaoI) {
        this.nomeInstituicaoI = nomeInstituicaoI;
    }

    public String getCursosI() {
        return cursosI;
    }

    public void setCursosI(String cursosI) {
        this.cursosI = cursosI;
    }

    public String getMateriasI() {
        return materiasI;
    }

    public void setMateriasI(String materiasI) {
        this.materiasI = materiasI;
    }

    public String getLocalizacaoI() {
        return localizacaoI;
    }

    public void setLocalizacaoI(String localizacaoI) {
        this.localizacaoI = localizacaoI;
    }

    public String getDiretorI() {
        return diretorI;
    }

    public void setDiretorI(String diretorI) {
        this.diretorI = diretorI;
    }

    public int getAnosDaIntituicaoI() {
        return anosDaIntituicaoI;
    }

    public void setAnosDaIntituicaoI(int anosDaIntituicaoI) {
        this.anosDaIntituicaoI = anosDaIntituicaoI;
    }

    

    public String getContatoI() {
        return contatoI;
    }

    public void setContatoI(String contatoI) {
        this.contatoI = contatoI;
    }

    @Override
    public String toString() {
        return "Instituicao{" + "nomeInstituicao=" + nomeInstituicaoI + ", cursosI=" + cursosI + ", materiasI=" + materiasI + ", localizacaoI=" + localizacaoI + ", diretorI=" + diretorI + ", idadeI=" + anosDaIntituicaoI + ", contatoI=" + contatoI + '}';
    }
    
    
}
