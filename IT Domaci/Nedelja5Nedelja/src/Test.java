public class Test {

    public static void main(String[] args) {
        FirePokemon charizard = new FirePokemon("Charizard", 100);
        Pokemon bulbasaur = new GrassPokemon("Bulbasaur", 50);
        WaterPokemon lapras = new WaterPokemon("Lapras", 120);
        System.out.println(charizard.attack());
        System.out.println(bulbasaur.defend());
        System.out.println(lapras.logAll());
    }
}