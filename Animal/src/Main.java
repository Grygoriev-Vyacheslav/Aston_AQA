
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int action;

        Cat[] allCats = new Cat[4];

        allCats[0] = new Cat("Markiz", 5, false);
        allCats[1] = new Cat("Barsik", 10, false);
        allCats[2] = new Cat("Murzik", 35, false);
        allCats[3] = new Cat("Pushok", 15, false);

        Miska miska = new Miska(50);
        miska.info();
        for (Cat allCat : allCats) {
            if (!allCat.fullness && allCat.appetite < miska.food) {
                allCat.eat(miska);
                allCat.fullness = true;
                System.out.println("Cat : " + allCat.name + " eat");
            } else {
                System.out.println("Cat : " + allCat.name + "do not eat");
            }
        }
        miska.info();
        System.out.println("how much food can be added?");
        action = sc.nextInt();
        miska.increaseFood(action);
        miska.info();


        allCats[0].swim(200);
        allCats[0].run(100);

        Dog jessy = new Dog("Jessy");
        Dog lessy = new Dog("Lessy");


        jessy.run(250);
        lessy.run(125);
        jessy.swim(74);

        System.out.println("Total animals is:" + Animal.getCountAnimal());
        System.out.println("Total cats is:" + Cat.getCountCat());
        System.out.println("Total dogs is:" + Dog.getCountDog());
    }
}