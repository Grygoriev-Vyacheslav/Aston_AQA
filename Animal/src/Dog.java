public class Dog extends Animal {
    String name;
    static int countDog = 0;

    public Dog(String name) {
        super();
        countDog++;
        this.name = name;

    }

    @Override
    public void run(int range) {
        if (range > 500) {
            System.out.println(name + " cant run more 500metres");
        } else {
            System.out.println(name + " running metres " + range);
        }
    }


    @Override
    public void swim(int range) {
        if (range > 10) {
            System.out.println(name + " cant swim more metres " + range);
        } else {
            System.out.println(name + " swim metres " + range);
        }
    }


    static int getCountDog() {
        return countDog;
    }
}
