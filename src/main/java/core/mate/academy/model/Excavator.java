package core.mate.academy.model;

public class Excavator extends Machine {

    private int productionYear;
    private int cost;
    private int power;

    public  Excavator() {
    }

    public Excavator(int productionYear, int cost, int power) {
        this.productionYear = productionYear;
        this.cost = cost;
        this.power = power;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
