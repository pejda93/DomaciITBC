public class GrassPokemon extends Pokemon{
    // Napada: Travom
    // Brani se: Izbegava
    // Pobedjuje: Water type
    // Gubi od: Fire type

    private static String type = "Grass";


    public GrassPokemon(String name, int health) {
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
        return "Travom";
    }

    @Override
    public String defend() {
        return "Izbegava";
    }

    @Override
    public String wins() {
        return "Water type";
    }

    @Override
    public String loses() {
        return "Fire type";
    }
}