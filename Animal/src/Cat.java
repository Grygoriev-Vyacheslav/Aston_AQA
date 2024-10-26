

public class Cat extends Animal {
    public String name;
    public int appetite;
    public boolean fullness;
    public static int countCat = 0;

    public Cat(String name, int appetite, boolean fullness) {
        super();
        countCat++;
        this.name = name;
        this.appetite = appetite;
        this.fullness = fullness;
    }


    public void eat(Miska m) {
        m.decreaseFood(appetite);
    }

    @Override
    public void run(int range) {
        if (range > 200) {
            System.out.println(name + " cant  run more 200m ");
        } else {
            System.out.println(name + " running metres " + range);
        }
    }

    @Override
    public void swim(int range) {
        System.out.println("Cat cant swim omg!");
    }

    static int getCountCat() {
        return countCat;
    }

}

