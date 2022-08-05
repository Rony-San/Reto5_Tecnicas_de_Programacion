
package reto5;


public abstract class Pokemon {
    protected String nombre; 
    protected char nivel;
    protected int salud;
    
    public abstract Pokemon evolucionar() throws NoEvolucionaException;
    public abstract String gritar();



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getNivel() {
        return nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNivel(char nivel) {
        this.nivel = nivel;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }
    
    
}
