package LSP;

import java.util.ArrayList;
import java.util.List;

public class CarUtils {

    public static void main(String[] args) {

        Car a=new Car();
        Car b=new Car();
        Car c=new RacingCar();


        List<Car> carList=new ArrayList<>();
        carList.add(a);
        carList.add(b);
        carList.add(c);


        for(Car car :carList){
            car.getCabinWidth();
        }
    }
}
