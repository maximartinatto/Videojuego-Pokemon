package Logica;


public class EjercicioIntegrador {
    public static void main(String[] args) {
        Squirtle squirtle = new Squirtle();
        Pikachu pikachu = new Pikachu();
        Charmander charmander = new Charmander();
        Bulbasaur bulbasaur = new Bulbasaur();
        
        squirtle.atacarHidrobomba();
        squirtle.atacarAraniazo();
        charmander.atacarAraniazo();
        charmander.atacarLanzaLlamas();
        bulbasaur.atacarAraniazo();
        bulbasaur.atacarDrenaje();
        pikachu.atacarAraniazo();
        pikachu.atacarImpactrueno();
    }
 
}
