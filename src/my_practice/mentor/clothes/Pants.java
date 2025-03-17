package my_practice.mentor.clothes;

public class Pants extends Clothing implements MenClothing, WomenClothing{
    public Pants(ClothingSize clothingSize, int price, String color) {
        super(clothingSize, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужские брюки " + this);
    }

    @Override
    public void dressWomen() {
        System.out.println("Женские брюки " + this);
    }
}
