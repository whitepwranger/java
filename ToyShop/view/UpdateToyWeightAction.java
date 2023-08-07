package view;

import model.ToyStore;

import java.util.Scanner;

public class UpdateToyWeightAction implements MenuAction{
    private ToyStore toyStore;
    private Scanner scanner;

    public UpdateToyWeightAction(ToyStore toyStore, Scanner scanner) {
        this.toyStore = toyStore;
        this.scanner = scanner;
    }

    @Override
    public void execute() {
        System.out.println("Enter Toy ID:");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter New Weight:");
        double weight = scanner.nextDouble();
        scanner.nextLine();

        toyStore.updateToyWeight(id, weight);
        System.out.println("Toy weight updated successfully.");
    }
}
