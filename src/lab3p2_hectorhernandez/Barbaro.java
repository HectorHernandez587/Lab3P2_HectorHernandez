package lab3p2_hectorhernandez;


public class Barbaro extends Personaje {
    private String tipo_arma;
    private int nivelxp;

    public Barbaro() {
    }

    public Barbaro(String tipo_arma, int nivelxp, String nombre, String raza, String descrpcion, String nacionalidad, String tipo_personaje, double estatura, double peso, int edad, int HP, int CS, int AC) {
        super(nombre, raza, descrpcion, nacionalidad, tipo_personaje, estatura, peso, edad, HP, CS, AC);
        this.tipo_arma = tipo_arma;
        this.nivelxp = nivelxp;
    }

    public String getTipo_arma() {
        return tipo_arma;
    }

    public void setTipo_arma(String tipo_arma) {
        this.tipo_arma = tipo_arma;
    }

    public int getNivelxp() {
        return nivelxp;
    }

    public void setNivelxp(int nivelxp) {
        this.nivelxp = nivelxp;
    }

    @Override
    public String toString() {
        return super.toString()+ "Barbaro{" + "tipo_arma=" + tipo_arma + ", nivelxp=" + nivelxp + '}';
    }

    
    
    
    
    
    
}
