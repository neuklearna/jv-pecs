package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.BulldozerProducer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.ExcavatorProducer;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import core.mate.academy.model.TruckProducer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        if (type == Truck.class) {
            TruckProducer producer = new TruckProducer();
            return new ArrayList<>(producer.get());
        }
        if (type == Excavator.class) {
            ExcavatorProducer producer = new ExcavatorProducer();
            return new ArrayList<>(producer.get());
        }
        if (type == Bulldozer.class) {
            BulldozerProducer producer = new BulldozerProducer();
            return new ArrayList<>(producer.get());
        }
        return Collections.emptyList();
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i,value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines){
            machine.doWork();
        }
    }
}
