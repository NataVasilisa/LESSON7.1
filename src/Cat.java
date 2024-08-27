public class Cat extends Animal {
    String name;
    int appetite;
    boolean fullness;
    static int countCat = 0;

    Cat(String name, int appetite) {
        super();
        countCat++;
        this.name = name;
        this.appetite = appetite;
        this.fullness = false;
    }

    @Override
    void run(int range) {
        if (range > 200) {
            System.out.println(name + " cannot to run more 200 m");
        } else {
            System.out.println(name + " have run " + range + " m");
        }
    }

    @Override
    void swim(int range) {
        System.out.println("Cat cannot to swim");
    }

    static int getCountCat() {
        return countCat;
    }

    public void eat(Plate p) {
        if (p.decreaseFood(appetite)) {
            fullness = true;
        }
    }

    public void info() {
    if (fullness) {
        System.out.println("Котик " + name + " покушал!");
    } else {
        System.out.println("Котик " + name + " не поел!");
    }
    }
}