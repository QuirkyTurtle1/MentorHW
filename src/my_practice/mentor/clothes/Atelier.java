package my_practice.mentor.clothes;

public class Atelier {
    public static void dressMan (Clothing[] clothing) {
        System.out.println("Мужская одежда: ");
        for (Clothing cl: clothing) {
            if (cl instanceof MenClothing) {
                ((MenClothing) cl).dressMan();
            }
        }
    }
    public static void dressWomen (Clothing[] clothing) {
        System.out.println("Женская одежда: ");
        for (Clothing cl: clothing) {
            if (cl instanceof WomenClothing) {
                ((WomenClothing) cl).dressWomen();
            }
        }
    }
}
