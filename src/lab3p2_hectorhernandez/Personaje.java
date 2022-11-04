package lab3p2_hectorhernandez;


public class Personaje {
    protected String nombre, raza, descrpcion, nacionalidad, tipo_personaje;
    protected double estatura, peso;
    protected int edad, HP, CS, AC;

    public Personaje() {
    }

    public Personaje(String nombre, String raza, String descrpcion, String nacionalidad, String tipo_personaje, double estatura, double peso, int edad, int HP, int CS, int AC) {
        this.nombre = nombre;
        this.raza = raza;
        this.descrpcion = descrpcion;
        this.nacionalidad = nacionalidad;
        this.tipo_personaje = tipo_personaje;
        this.estatura = estatura;
        this.peso = peso;
        this.edad = edad;
        this.HP = HP;
        this.CS = CS;
        this.AC = AC;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getDescrpcion() {
        return descrpcion;
    }

    public void setDescrpcion(String descrpcion) {
        this.descrpcion = descrpcion;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getTipo_personaje() {
        return tipo_personaje;
    }

    public void setTipo_personaje(String tipo_personaje) {
        this.tipo_personaje = tipo_personaje;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getCS() {
        return CS;
    }

    public void setCS(int CS) {
        this.CS = CS;
    }

    public int getAC() {
        return AC;
    }

    public void setAC(int AC) {
        this.AC = AC;
    }

    @Override
    public String toString() {
        return "Personaje{" + "nombre=" + nombre + ", raza=" + raza + ", descrpcion=" + descrpcion + ", nacionalidad=" + nacionalidad + ", tipo_personaje=" + tipo_personaje + ", estatura=" + estatura + ", peso=" + peso + ", edad=" + edad + ", HP=" + HP + ", CS=" + CS + ", AC=" + AC + '}';
    }
  
}
