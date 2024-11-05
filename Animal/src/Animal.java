public class Animal {
    static int countAnimal = 0;

    public Animal() {
        countAnimal++;
    }


    public void run(int range) {
        System.out.println("Animal running metres" + range);
    }

    public void swim(int range) {
        System.out.println("Animal swimming metres" + range);
    }

    public static int getCountAnimal() {
        return countAnimal;
    }


}












