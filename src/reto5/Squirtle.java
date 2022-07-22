
package reto5;


public class Squirtle extends Pokemon{
     
    public Squirtle(char nivel, String nombre, int salud ) {
        setNivel(nivel);
        setNombre(nombre);
        setSalud(salud);
    }

    
    @Override
    public String gritar(){
        return "Squirtle!";
    }
    
        
    @Override
    public Pokemon evolucionar(){
        return new Wartortle(this.nivel,this.nombre,this.salud);
    }
}
