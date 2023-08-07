package controller;

import model.Toy;

import java.util.List;
import java.util.Random;

public class RandomPrizeDistribution implements PrizeDistribution {
    private Random random;

    public RandomPrizeDistribution() {
        random = new Random();
    }

    @Override
    public Toy selectPrizeToy(List<Toy> toys) {
        double totalWeight = toys.stream().mapToDouble(Toy::getWeight).sum();
        double randomValue = random.nextDouble() * totalWeight;
        double weightSum = 0;

        for (Toy toy : toys) {
            weightSum += toy.getWeight();
            if (randomValue <= weightSum) {
                return toy;
            }
        }

        return null;
    }
}