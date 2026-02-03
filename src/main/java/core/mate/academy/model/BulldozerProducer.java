package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;

import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer {

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozer = new ArrayList<Bulldozer>();
        bulldozer.add(new Bulldozer(2020,50600,400));
        bulldozer.add(new Bulldozer(2021,62200,500));
        bulldozer.add(new Bulldozer(2002,51600,250));
        return bulldozer;
    }
}
