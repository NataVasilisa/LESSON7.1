import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal animal1 = new Animal();
        Animal animal2 = new Animal();
        Cat barsik = new Cat("Barsik", 7);
        Dog tuzik = new Dog("Tuzik");
        Cat barsik1 = new Cat("Barsik", 20);
        Dog tuzik1 = new Dog("Tuzik");
        barsik.run(150);
        barsik.run(201);
        tuzik.run(500);
        tuzik.run(501);
        barsik.swim(100);
        tuzik.swim(200);
        tuzik.swim(5);
        System.out.println("Total animals: " +Animal.getCountAnimal());
        System.out.println("Total cats: "+Cat.getCountCat());
        System.out.println("Total dogs: "+Dog.getCountDod());
        Cat[] allCats = new Cat[2];
        allCats[0] = barsik;
        allCats[1] = barsik1;
        Plate plate = new Plate(26);
        plate.info();
        for (int i = 0; i < allCats.length; i++) {
                allCats[i].eat(plate);
                allCats[i].info();
        }
        plate.info();
        System.out.println("Сколько грамм вискаса добавить еще в миску?");
        Scanner sc = new Scanner(System.in);
        int action = sc.nextInt();
        plate.increaseFood(action);
        plate.info();
    }
}