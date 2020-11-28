package beans;

import org.springframework.stereotype.Component;

@Component
public class Battery {
    public void switchOn(){
        System.out.println("Battery has is on");
    }
}
