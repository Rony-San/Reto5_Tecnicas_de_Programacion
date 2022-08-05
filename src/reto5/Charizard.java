

package reto5;


public class Charizard extends Pokemon{
    
    public Charizard(char nivel, String nombre, int salud ) {
        setNivel(nivel);
        setNombre(nombre);
        setSalud(salud);
    }

    
    @Override
    public String gritar(){
        return "Charizard!!";
    }
    
        
    @Override
    public Pokemon evolucionar() throws NoEvolucionaException {
        throw new NoEvolucionaException();
    }

    

}
