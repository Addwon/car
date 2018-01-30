package assignments.car;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class CarApp {
    @RequestMapping("/")
    public String output() {
        Car c = new Car();
        c.setColor("red");
        c.setBrand("Porsche");
        c.setSpeed(50);
        System.out.println("The " + c.getColor() + " " + c.getBrand() + " is " + c.start());
        System.out.println("The " + c.getColor() + " " + c.getBrand() + " is " + c.accelerate());
        System.out.println("The " + c.getColor() + " " + c.getBrand() + " is " + c.going()+" "+c.getSpeed()+" mph");
        System.out.println("The " + c.getColor() + " " + c.getBrand() + " is " + c.stop());

        return "The " + c.getColor() + " " + c.getBrand() + " is " + c.start()+"<br/>"+
                "The " + c.getColor() + " " + c.getBrand() + " is " + c.accelerate()+"<br/>"+
                "The " + c.getColor() + " " + c.getBrand() + " is " + c.going()+" "+c.getSpeed()+" mph"+"<br/>"+
                "The " + c.getColor() + " " + c.getBrand() + " is " + c.stop();
    }
}
