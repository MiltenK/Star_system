public abstract class AstrumGalactic {
    private String name;

    public AstrumGalactic(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public abstract String planet();
    public abstract String stars();
    public abstract String asteroid();

    @Override
    public String toString() {
        return "AstrumGalactic{name='" + name + "'}";
    }
}