public abstract class AlfaZentavrSystem {
    private String name;

    public AlfaZentavrSystem(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "AlfaZentavrSystem{" +
                "name='" + name + '\'' +
                '}';
    }
}
