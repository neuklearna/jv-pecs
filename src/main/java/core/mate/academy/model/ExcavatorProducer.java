package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {

    @Override
    public List<Excavator> get() {
        List<Excavator> excavator = new ArrayList<Excavator>();
        excavator.add(new Excavator(2020,50600,400));
        excavator.add(new Excavator(2021,62200,500));
        excavator.add(new Excavator(2002,51600,250));
        return excavator;
    }
}
