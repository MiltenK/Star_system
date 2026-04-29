public class PlanetTotation extends AstrumGalactic {
    private String atmosphere;
    private int temperature;
    private boolean hasWater;

    public PlanetTotation(String name) {
        super(name);
        this.atmosphere = "breathable";
        this.temperature = 22;
        this.hasWater = true;
    }

    public PlanetTotation(String name, String atmosphere, int temperature, boolean hasWater) {
        super(name);
        this.atmosphere = atmosphere;
        this.temperature = temperature;
        this.hasWater = hasWater;
    }


    public String getAtmosphere() {
        return atmosphere;
    }

    public int getTemperature() {
        return temperature;
    }

    public boolean hasWater() {
        return hasWater;
    }


    public void setAtmosphere(String atmosphere) {
        this.atmosphere = atmosphere;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void setHasWater(boolean hasWater) {
        this.hasWater = hasWater;
    }


    @Override
    public String planet() {
        return "Эта планета: " + getName() + " с " + atmosphere + " атмосферой и " + temperature + "°C";
    }

    @Override
    public String stars() {
        return getName() + " orbits around a yellow dwarf star";
    }

    @Override
    public String asteroid() {
        return "Asteroid belt is located near " + getName();
    }


    public void showPlanetInfo() {
        System.out.println("Planet: " + getName());
        System.out.println("Atmosphere: " + atmosphere);
        System.out.println("Temperature: " + temperature + "°C");
        System.out.println("Water: " + (hasWater ? "Yes" : "No"));
    }
}