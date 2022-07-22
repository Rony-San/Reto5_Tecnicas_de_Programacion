
package reto5;


public class Blastoise extends Pokemon{
    public Blastoise(char nivel, String nombre, int salud ) {
        setNivel(nivel);
        setNombre(nombre);
        setSalud(salud);
    }

    
    @Override
    public String gritar(){
        return "Blastoise!";
    }
         
    @Override
    public Pokemon evolucionar(){
        return null;
    }
    
}
