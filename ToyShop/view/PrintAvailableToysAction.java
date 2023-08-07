package view;

import model.Toy;
import model.ToyStore;

import java.util.List;

public class PrintAvailableToysAction implements MenuAction{
    private ToyStore toyStore;

    public PrintAvailableToysAction(ToyStore toyStore) {
        this.toyStore = toyStore;
    }

    @Override
    public void execute() {
        System.out.println("Available Toys:");
        List<Toy> availableToys = toyStore.getAvailableToys();
        for (Toy toy : availableToys) {
            System.out.println("Toy ID: " + toy.getId() + ", Name: " + toy.getName() +
                    ", Quantity: " + toy.getQuantity() + ", Weight: " + toy.getWeight());
        }
    }
}
