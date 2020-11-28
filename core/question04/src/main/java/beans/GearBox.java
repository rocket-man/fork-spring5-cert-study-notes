package beans;

import org.springframework.stereotype.Component;

@Component
public class GearBox {
    public void putInFirstGear(){
        System.out.println("First gear is on");
    }
}
