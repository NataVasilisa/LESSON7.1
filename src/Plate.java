public class Plate {
    public int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int n) {
        if (food - n <= 0) return false;
        food -= n;
        return true;
    }

    public void increaseFood(int x) {
        food += x;
    }

    public void info() {
        System.out.println("Всего еды: " + food);
    }
}
