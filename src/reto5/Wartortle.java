
package reto5;

public class Wartortle extends Pokemon {
        public Wartortle(char nivel, String nombre, int salud ) {
        setNivel(nivel);
        setNombre(nombre);
        setSalud(salud);
    }

    
    @Override
    public String gritar(){
        return "Wartortle!";
    }
         
    @Override
    public Pokemon evolucionar(){
        return new Blastoise(this.nivel,this.nombre,this.salud);
    }
    
  
}
