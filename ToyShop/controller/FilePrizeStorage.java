package controller;

import model.Toy;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FilePrizeStorage implements PrizeStorage {
    private String filePath;

    public FilePrizeStorage(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void savePrizeToy(Toy toy) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write("Toy ID: " + toy.getId() + ", Name: " + toy.getName());
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
