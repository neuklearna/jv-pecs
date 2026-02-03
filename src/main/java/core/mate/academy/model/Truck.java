package core.mate.academy.model;

public class Truck extends Machine {

    int productionYear;
    int cost;
    int power;

    public Truck() {
    }

    public Truck(int productionYear, int cost, int power) {
        this.productionYear = productionYear;
        this.cost = cost;
        this.power = power;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
