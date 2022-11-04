package lab3p2_hectorhernandez;


public class Mago extends Personaje {
    private String tipo_magia;

    public Mago() {
    }

    public Mago(String tipo_magia, String nombre, String raza, String descrpcion, String nacionalidad, String tipo_personaje, double estatura, double peso, int edad, int HP, int CS, int AC) {
        super(nombre, raza, descrpcion, nacionalidad, tipo_personaje, estatura, peso, edad, HP, CS, AC);
        this.tipo_magia = tipo_magia;
    }

    public String getTipo_magia() {
        return tipo_magia;
    }

    public void setTipo_magia(String tipo_magia) {
        this.tipo_magia = tipo_magia;
    }

    @Override
    public String toString() {
        return super.toString()+ "Mago{" + "tipo_magia=" + tipo_magia + '}';
    }

    
    
    
    
}
