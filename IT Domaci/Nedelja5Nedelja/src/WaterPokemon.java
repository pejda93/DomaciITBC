public class WaterPokemon extends Pokemon{
    // Napada: Vodom
    // Brani se: Vodom
    // Pobedjuje: Fire type
    // Gubi od: Grass type

    private static String type = "Water";

    public WaterPokemon(String name, int health) {
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
        return "Vodom";
    }

    @Override
    public String defend() {
        return "Vodom";
    }

    @Override
    public String wins() {
        return "Fire type";
    }

    @Override
    public String loses() {
        return "Grass type";
    }
}