
package reto5;


public class Charmeleon extends Pokemon{
    
    public Charmeleon(char nivel, String nombre, int salud ) {
        setNivel(nivel);
        setNombre(nombre);
        setSalud(salud);
    }


    @Override
    public String gritar() {
        return "Charmeleon!";
    
}

    @Override
    public Pokemon evolucionar() {
        return new Charizard(this.nivel,this.nombre,this.salud);
    }
}