public class Main {
    public static void main(String[] args) {
        // Создаём штурмовиков
        Stormtroopers stormtrooper1 = new Stormtroopers("TK-421");
        Stormtroopers stormtrooper2 = new Stormtroopers("FN-2187");

        // Создаём планеты
        PlanetTotation planetTotarion = new PlanetTotation("Totarion", "breathable", 22, true);
        PlanetTotation planetMars = new PlanetTotation("Mars", "carbon-dioxide", -60, false);

        // Проверяем для Totarion
        System.out.println("=== Проверка планеты " + planetTotarion.getName() + " ===");
        if (stormtrooper1.necessaryForLife(planetTotarion)) {
            System.out.println(stormtrooper1.getName() + " может жить на " + planetTotarion.getName());
        } else {
            System.out.println(stormtrooper1.getName() + " НЕ может жить на " + planetTotarion.getName());
        }

        // Проверяем для Mars
        System.out.println("\n=== Проверка планеты " + planetMars.getName() + " ===");
        if (stormtrooper2.necessaryForLife(planetMars)) {
            System.out.println(stormtrooper2.getName() + " может жить на " + planetMars.getName());
        } else {
            System.out.println(stormtrooper2.getName() + " НЕ может жить на " + planetMars.getName());
        }

        // Показываем, как они летают
        System.out.println("\n=== Перемещение ===");
        System.out.println(stormtrooper1.move());
        System.out.println(stormtrooper2.move());
    }
}