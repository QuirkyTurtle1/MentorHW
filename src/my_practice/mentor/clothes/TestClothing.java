package my_practice.mentor.clothes;

public class TestClothing {
    public static void main(String[] args) {
        Clothing[] clothes = {
                new TShirt(ClothingSize.M, 300, "Белая"),
                new Pants(ClothingSize.L, 700, "Черные"),
                new Skirt(ClothingSize.S, 500, "Красная"),
                new Tie(ClothingSize.XS, 250, "Синий")
        };
        Atelier.dressMan(clothes);
        Atelier.dressWomen(clothes);
    }
}
