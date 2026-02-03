package core.mate.academy.service;

import core.mate.academy.model.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine>{

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        if(type == Truck.class){
            TruckProducer producer = new TruckProducer();
            return new ArrayList<>(producer.get());
        }
        if(type == Excavator.class) {
            ExcavatorProducer producer = new ExcavatorProducer();
            return new ArrayList<>(producer.get());
        }
        if(type == Bulldozer.class) {
            BulldozerProducer producer = new BulldozerProducer();
            return new ArrayList<>(producer.get());
        }
        return null;
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value){
        for( int i = 0; i < machines.size(); i++ ){
            machines.add(i,value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines){
        for(Machine machine : machines){
            machine.doWork();
        }

    }
}
