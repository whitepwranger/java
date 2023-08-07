import controller.FilePrizeStorage;
import controller.PrizeDistribution;
import controller.PrizeStorage;
import controller.RandomPrizeDistribution;

import model.ToyStore;
import view.*;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        PrizeDistribution prizeDistribution = new RandomPrizeDistribution();
        PrizeStorage prizeStorage = new FilePrizeStorage("prize_toys.txt");
        ToyStore toyStore = new ToyStore(prizeDistribution, prizeStorage);
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu(scanner);
        menu.addOption("Add New Toy", new AddNewToyAction(toyStore, scanner));
        menu.addOption("Update Toy Weight", new UpdateToyWeightAction(toyStore, scanner));
        menu.addOption("Organize Raffle", new OrganizeRaffleAction(toyStore));
        menu.addOption("Print Available Toys", new PrintAvailableToysAction(toyStore));

        menu.show();

        scanner.close();
    }
}

