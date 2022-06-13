package behavior_and_builder.client;

import behavior_and_builder.element.Director;
import behavior_and_builder.model.builder.CarConstructor;
import behavior_and_builder.visitor.visitorOne;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Director director = new Director();
        CarConstructor manualBuilder = new CarConstructor();

        while (true) {
            visitorOne visitor = new visitorOne();
            System.out.println("Welcome to TMPS lab3 car dealership!\nYou can choose our ready-made solutions or to combine " +
                    "your wishes\n");
            System.out.println(" 1: Ready-made solutions \n 2: To combine your wishes\n 9: EXIT");
            int choice = in.nextInt();
            if (choice == 1) {
                director.accept(visitor);
            } else if (choice == 2) {
                manualBuilder.accept(visitor);
            } else if (choice == 9) break;
            else System.out.println("unknown command");
        }
    }
}
