public class FirePokemon extends Pokemon{
    // Napada: Vatrom
    // Brani se: Telesno
    // Pobedjuje: Grass type
    // Gubi od: Water type

    private static String type = "Fire";


    public FirePokemon(String name, int health) {
        super(name, type, health);

    }

    @Override
    public String logAll() {
        return "Napada: " + attack() + "\n" +
                "Brani se: " +defend() + "\n" +
                "Pobedjuje: " +wins() + "\n" +
                "Gubi od: "+loses();
    }

    @Override
    public String attack() {
        return "Vatrom";
    }

    @Override
    public String defend() {
        return "Telesno";
    }

    @Override
    public String wins() {
        return "Grass type";
    }

    @Override
    public String loses() {
        return "Water type";
    }
}
