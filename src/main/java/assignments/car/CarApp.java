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

        Car c2=new Car();
        c2.setColor("blue");
        c2.setBrand("Jetta");



        return "The " + c.getColor() + " " + c.getBrand() + " is " + c.start()+"<br/>"+
                "The " + c2.getColor() + " " + c2.getBrand() + " is " + c2.start()+"<br/>"+
                "The " + c.getColor() + " " + c.getBrand() + " is " + c.accelerate()+"<br/>"+
                "The " + c2.getColor() + " " + c2.getBrand() + " is " + c2.accelerate()+"<br/>"+
                "The " + c2.getColor() + " " + c2.getBrand() + " has " + c2.stop()+" to have its emissions checked"+"<br/>"+
                "The " + c2.getColor() + " " + c2.getBrand() + " passes its emmision test"+"<br/>"+
                "The " + c.getColor() + " " + c.getBrand() + " is " + c.going()+" "+c.getSpeed()+" mph"+"<br/>"+
                "The " + c.getColor() + " " + c.getBrand() + " is " + c.stop()+"<br/>"+
                "The " + c2.getColor() + " " + c2.getBrand() + " is " + c2.stop()+"<br/>"+
                "The " + c2.getColor() + " " + c2.getBrand() + " passed the "+c.getColor()+" "+c.getBrand();

    }

}
