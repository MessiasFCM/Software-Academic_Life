package modelo;

public class Calendario {
    private int idC;
    private String trabalhosC;
    private String provasC;
    private String feriadosRecessosC;
    private String inicioTerminoAulasC;

    public Calendario() {
    }

    public Calendario(int idC, String trabalhosC, String provasC, String feriadosRecessosC, String inicioTerminoAulasC) {
        this.idC = idC;
        this.trabalhosC = trabalhosC;
        this.provasC = provasC;
        this.feriadosRecessosC = feriadosRecessosC;
        this.inicioTerminoAulasC = inicioTerminoAulasC;
    }

    public int getIdC() {
        return idC;
    }

    public void setIdC(int idC) {
        this.idC = idC;
    }

    public String getTrabalhosC() {
        return trabalhosC;
    }

    public void setTrabalhosC(String trabalhosC) {
        this.trabalhosC = trabalhosC;
    }

    public String getProvasC() {
        return provasC;
    }

    public void setProvasC(String provasC) {
        this.provasC = provasC;
    }

    public String getFeriadosRecessosC() {
        return feriadosRecessosC;
    }

    public void setFeriadosRecessosC(String feriadosRecessosC) {
        this.feriadosRecessosC = feriadosRecessosC;
    }

    public String getInicioTerminoAulasC() {
        return inicioTerminoAulasC;
    }

    public void setInicioTerminoAulasC(String inicioTerminoAulasC) {
        this.inicioTerminoAulasC = inicioTerminoAulasC;
    }

    @Override
    public String toString() {
        return "Calendario{" + "idC=" + idC + ", trabalhosC=" + trabalhosC + ", provasC=" + provasC + ", feriadosRecessosC=" + feriadosRecessosC + ", inicioTerminoAulasC=" + inicioTerminoAulasC + '}';
    }

    
    
    
}
