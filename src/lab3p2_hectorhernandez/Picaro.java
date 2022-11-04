package lab3p2_hectorhernandez;

public class Picaro extends Personaje {
    private String tipo_instrumento;
    private int cant_robos;

    public Picaro() {
    }
    

    public Picaro(String tipo_instrumento, int cant_robos, String nombre, String raza, String descrpcion, String nacionalidad, String tipo_personaje, double estatura, double peso, int edad, int HP, int CS, int AC) {
        super(nombre, raza, descrpcion, nacionalidad, tipo_personaje, estatura, peso, edad, HP, CS, AC);
        this.tipo_instrumento = tipo_instrumento;
        this.cant_robos = cant_robos;
    }

    public String getTipo_instrumento() {
        return tipo_instrumento;
    }

    public void setTipo_instrumento(String tipo_instrumento) {
        this.tipo_instrumento = tipo_instrumento;
    }

    public int getCant_robos() {
        return cant_robos;
    }

    public void setCant_robos(int cant_robos) {
        this.cant_robos = cant_robos;
    }

    @Override
    public String toString() {
        return super.toString()+ "Picaro{" + "tipo_instrumento=" + tipo_instrumento + ", cant_robos=" + cant_robos + '}';
    }
    
    

    
    
    
    
}
