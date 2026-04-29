public abstract class FlyCreature {
    private String name;

    public FlyCreature(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract String move();
    public abstract Boolean necessaryForLife();

    @Override
    public String toString() {
        return "FlyCreature{name='" + name + "'}";
    }
}