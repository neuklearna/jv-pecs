package core.mate.academy.model;

public class Bulldozer extends Machine {

    private int productionYear;
    private int cost;
    private int power;

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
