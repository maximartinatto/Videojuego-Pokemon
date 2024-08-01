package Logica;


public class Charmander extends Pokemon implements IFuego {

    public Charmander() {
    }
    

    @Override
    protected void atacarPlacaje() {
        System.out.println("Soy Charmander y este es mi ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Soy Charmander y este es mi ataque araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Soy charmander y este es mi ataque mordisco");
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Soy charmander y este es mi ataque punio fuego");
    }

    @Override
    public void atacarLanzaLlamas() {
        System.out.println("Soy charmander y este es mi ataque lanza llamas");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Soy charmander y este es mi ataque ascuas");
    }
    
}
