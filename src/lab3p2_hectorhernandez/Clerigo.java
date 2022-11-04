package lab3p2_hectorhernandez;


public class Clerigo extends Personaje{
    private String dios_demonio;
    private String tipo_invocacion;

    public Clerigo() {
    }

    public Clerigo(String dios_demonio, String tipo_invocacion, String nombre, String raza, String descrpcion, String nacionalidad, String tipo_personaje, double estatura, double peso, int edad, int HP, int CS, int AC) {
        super(nombre, raza, descrpcion, nacionalidad, tipo_personaje, estatura, peso, edad, HP, CS, AC);
        this.dios_demonio = dios_demonio;
        this.tipo_invocacion = tipo_invocacion;
    }

    public String getDios_demonio() {
        return dios_demonio;
    }

    public void setDios_demonio(String dios_demonio) {
        this.dios_demonio = dios_demonio;
    }

    public String getTipo_invocacion() {
        return tipo_invocacion;
    }

    public void setTipo_invocacion(String tipo_invocacion) {
        this.tipo_invocacion = tipo_invocacion;
    }

    @Override
    public String toString() {
        return super.toString()+ "Clerigo{" + "dios_demonio=" + dios_demonio + ", tipo_invocacion=" + tipo_invocacion + '}';
    }

    
    
    
    
    
    
}
