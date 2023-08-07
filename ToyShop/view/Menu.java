package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private List<String> options;
    private List<MenuAction> actions;
    private Scanner scanner;

    public Menu(Scanner scanner) {
        options = new ArrayList<>();
        actions = new ArrayList<>();
        this.scanner = scanner;
    }

    public void addOption(String option, MenuAction action) {
        options.add(option);
        actions.add(action);
    }

    public void show() {
        boolean exit = false;
        while (!exit) {
            printMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Считываем лишний перевод строки

            if (choice >= 1 && choice <= options.size()) {
                MenuAction action = actions.get(choice - 1);
                action.execute();
            } else if (choice == options.size() + 1) {
                exit = true;
                System.out.println("Exiting the program...");
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void printMenu() {
        System.out.println("==== Toy Raffle Program ====");
        for (int i = 0; i < options.size(); i++) {
            System.out.println((i + 1) + ". " + options.get(i));
        }
        System.out.println((options.size() + 1) + ". Exit");
        System.out.println("Enter your choice:");
    }
}
