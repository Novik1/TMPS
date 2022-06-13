package behavior_and_builder.visitor;

import behavior_and_builder.element.Director;
import behavior_and_builder.model.CarComponents.*;
import behavior_and_builder.model.builder.CarConstructor;

import java.util.Scanner;

public class visitorOne implements visitors{
    Scanner in = new Scanner(System.in);
    @Override
    public void visit(Director director) {
        System.out.println("Choice option:\n     1: Hatchback\n     2: Sedan\n     3: Wagon\n" +
                "     4: SUV\n     5: Coupe");

        switch (in.nextInt()){
            case 1: director.constructHatchback(); break;
            case 2: director.constructSedan(); break;
            case 3: director.constructWagon(); break;
            case 4: director.constructSUV(); break;
            case 5: director.constructCoupe(); break;
            default: break;
        }
    }

    @Override
    public void visit(CarConstructor engineer) {
        System.out.println("Welcome to Car Constructor!");
        setType(engineer);
        setEngine(engineer);
        setTransmission(engineer);
        setComplectation(engineer);
        engineer.getResult();
    }

    private void setType(CarConstructor engineer) {
        System.out.println("Choice car type:\n     1: Hatchback\n     2: Sedan\n     3: Wagon\n" +
                "     4: SUV\n     5: Coupe");

        switch (in.nextInt()) {
            case 1:
                engineer.setCarType(CarType.HATCHBACK);
                engineer.setSeats(5);
                break;
            case 2:
                engineer.setCarType(CarType.SEDAN);
                engineer.setSeats(5);
                break;
            case 3:
                engineer.setCarType(CarType.WAGON);
                engineer.setSeats(7);
                break;
            case 4:
                engineer.setCarType(CarType.SUV);
                engineer.setSeats(7);
                break;
            case 5:
                engineer.setCarType(CarType.CUOPE);
                engineer.setSeats(4);
                break;
            default:
                engineer.setCarType(CarType.SEDAN);
                engineer.setSeats(5);
                break;
        }
    }

    private void setEngine(CarConstructor engineer){
        System.out.println("Choice engine:\n     1: Volume: 1.2; Power: 90; Fuel: gasoline\n     2: Volume: 2.0; Power: 160; Fuel: diesel\n   " +
                "  3: Volume: 3.5; Power: 249; Fuel: gasoline\n     4: Volume: 5.2; Power: 450; Fuel: gasoline");

        switch (in.nextInt()) {
            case 1:
                engineer.setEngine(new Engine(1.2, 90, Fuel.gasoline));
                break;
            case 2:
                engineer.setEngine(new Engine(2.0, 160, Fuel.diesel));
                break;
            case 3:
                engineer.setEngine(new Engine(3.5, 249, Fuel.gasoline));
                break;
            case 4:
                engineer.setEngine(new Engine(5.2, 450, Fuel.gasoline));
                break;
            default:
                engineer.setEngine(new Engine(2.0, 160, Fuel.diesel));
                break;
        }
    }

    private void setTransmission(CarConstructor engineer){
        System.out.println("Choice transmission:\n     1: Manual\n     2: Automatic\n   " +
                "  3: CVT\n     4: Robot");

        switch (in.nextInt()) {
            case 1:
                engineer.setTransmission(Transmission.MANUAL);
                break;
            case 2:
                engineer.setTransmission(Transmission.AUTOMATIC);
                break;
            case 3:
                engineer.setTransmission(Transmission.CVT);
                break;
            case 4:
                engineer.setTransmission(Transmission.ROBOT);
                break;
            default:
                engineer.setTransmission(Transmission.CVT);
                break;
        }
    }

    private void setComplectation(CarConstructor engineer){
        System.out.println("Choice complectation:\n     1: Standard\n     2: Comfort\n     3: Luxury\n");

        switch (in.nextInt()) {
            case 1:
                engineer.setComplectation(Complectation.STANDARD);
                break;
            case 2:
                engineer.setComplectation(Complectation.COMFORT);
                break;
            case 3:
                engineer.setComplectation(Complectation.LUXURY);
                break;
            case 4:
                engineer.setTransmission(Transmission.ROBOT);
                break;
            default:
                engineer.setTransmission(Transmission.CVT);
                break;
        }
    }
}
