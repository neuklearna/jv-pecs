package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer {

    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<Truck>();
        trucks.add(new Truck(2020,50600,400));
        trucks.add(new Truck(2021,62200,500));
        trucks.add(new Truck(2002,51600,250));
        return trucks;
    }
}
