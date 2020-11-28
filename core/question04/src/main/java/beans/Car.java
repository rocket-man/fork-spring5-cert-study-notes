package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
    @Autowired
    private Battery battery;
    @Autowired
    private Engine engine;
    @Autowired
    private GearBox gearBox;
    @Autowired
    private Wheels wheels;

    public void drive(){
        battery.switchOn();
        engine.turnOn();
        gearBox.putInFirstGear();
        wheels.roll();
    }
}
