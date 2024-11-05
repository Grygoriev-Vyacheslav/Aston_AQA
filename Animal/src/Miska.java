public class Miska {
    public int food;

    public Miska(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {
        food -= n;
    }

    public void increaseFood(int n) {
        food += n;
    }

    public void info() {
        System.out.println("Total food is:" + food);
    }
}
