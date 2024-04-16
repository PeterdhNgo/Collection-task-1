import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        Fruit fruit1 = new Fruit();
        fruit1.setName("Apple");
        fruit1.setColour("Green");
        fruit1.setCountry("England");

        Fruit fruit2 = new Fruit();
        fruit2.setName("Banana");
        fruit2.setColour("Yellow");
        fruit2.setCountry("Brazil");

        Fruit fruit3 = new Fruit();
        fruit3.setName("Orange");
        fruit3.setColour("Orange");
        fruit3.setCountry("USA");

        ArrayList<Fruit> fruitList = new ArrayList();
        fruitList.add(fruit1);
        fruitList.add(fruit2);
        fruitList.add(fruit3);
    }
}