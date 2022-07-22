
package reto5;


public class Pikachu extends Pokemon{
    public Pikachu(char nivel, String nombre, int salud ) {
        setNivel(nivel);
        setNombre(nombre);
        setSalud(salud);
    }

    
    @Override
    public String gritar(){
        return "Pikachu!";
    }
    
        
    @Override
    public Pokemon evolucionar(){
        return new Raichu(this.nivel,this.nombre,this.salud);
    }
}
