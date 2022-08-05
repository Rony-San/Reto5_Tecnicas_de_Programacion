
package reto5;

public class Raichu extends Pokemon {
        public Raichu(char nivel, String nombre, int salud ) {
        setNivel(nivel);
        setNombre(nombre);
        setSalud(salud);
    }

    
    @Override
    public String gritar(){
        return "Raichu!";
    }
    
        
    @Override
    public Pokemon evolucionar() throws NoEvolucionaException {
        throw new NoEvolucionaException();
    }
}
