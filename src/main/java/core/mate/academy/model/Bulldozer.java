package core.mate.academy.model;

public class Bulldozer extends Machine {

    int productionYear;
    int cost;
    int power;

    public Bulldozer() {
    }

    public Bulldozer(int productionYear, int cost, int power) {
        this.productionYear = productionYear;
        this.cost = cost;
        this.power = power;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
