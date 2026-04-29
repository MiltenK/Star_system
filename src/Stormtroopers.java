public class Stormtroopers extends FlyCreature {

    public Stormtroopers(String name) {
        super(name);
    }

    // Проверка условий жизни
    public Boolean necessaryForLife(PlanetTotation planet) {
        if (planet.getAtmosphere().equals("breathable") &&
                planet.getTemperature() >= -20 &&
                planet.getTemperature() <= 45 &&
                planet.hasWater()) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean necessaryForLife() {
        return null;
    }


    @Override
    public String move() {
        return "Летают сверху-вниз";
    }
}