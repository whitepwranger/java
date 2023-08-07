package view;

import model.Toy;
import model.ToyStore;

import java.util.Scanner;

public class AddNewToyAction implements MenuAction{
    private ToyStore toyStore;
    private Scanner scanner;

    public AddNewToyAction(ToyStore toyStore, Scanner scanner) {
        this.toyStore = toyStore;
        this.scanner = scanner;
    }

    @Override
    public void execute() {
        System.out.println("Enter Toy ID:");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter Toy Name:");
        String name = scanner.nextLine();

        System.out.println("Enter Toy Quantity:");
        int quantity = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter Toy Weight:");
        double weight = scanner.nextDouble();
        scanner.nextLine();

        Toy toy = new Toy(id, name, quantity, weight);
        toyStore.addToy(toy);
        System.out.println("Toy added successfully.");
    }
}
