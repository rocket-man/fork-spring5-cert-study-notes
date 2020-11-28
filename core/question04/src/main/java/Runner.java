import beans.Car;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Runner {
    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext context =
                    new AnnotationConfigApplicationContext(ApplicationConfiguration.class)){
            Car car = context.getBean(Car.class);
            car.drive();
        }
    }
}
