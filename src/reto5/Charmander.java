

package reto5;


public class Charmander extends Pokemon{
    
    public Charmander(char nivel, String nombre, int salud ) {
        setNivel(nivel);
        setNombre(nombre);
        setSalud(salud);
    }

    
    @Override
    public String gritar(){
        return "Charmander!";
    }
    
        
    @Override
    public Pokemon evolucionar(){
        return new Charmeleon(this.nivel,this.nombre,this.salud);
    }

    

}
