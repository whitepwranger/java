package model;

import controller.PrizeDistribution;
import controller.PrizeStorage;

import java.util.ArrayList;
import java.util.List;

public class ToyStore {
    private List<Toy> toys;
    private List<Toy> prizeToys;
    private PrizeDistribution prizeDistribution;
    private PrizeStorage prizeStorage;

    public ToyStore(PrizeDistribution prizeDistribution, PrizeStorage prizeStorage) {
        toys = new ArrayList<>();
        prizeToys = new ArrayList<>();
        this.prizeDistribution = prizeDistribution;
        this.prizeStorage = prizeStorage;
    }

    public void addToy(Toy toy) {
        toys.add(toy);
    }

    public void updateToyWeight(int toyId, double weight) {
        for (Toy toy : toys) {
            if (toy.getId() == toyId) {
                toy.setWeight(weight);
                break;
            }
        }
    }

    public void organizeRaffle() {
        Toy prizeToy = prizeDistribution.selectPrizeToy(toys);
        if (prizeToy != null) {
            prizeToys.add(prizeToy);
            removePrizeToyFromList(prizeToy);
            prizeStorage.savePrizeToy(prizeToy);
            System.out.println("Congratulations! You won a toy: " + prizeToy.getName());
        }
    }

    private void removePrizeToyFromList(Toy prizeToy) {
        for (int i = 0; i < toys.size(); i++) {
            Toy toy = toys.get(i);
            if (toy.getId() == prizeToy.getId()) {
                toy.decreaseQuantity();
                if (toy.getQuantity() == 0) {
                    toys.remove(i);
                }
                break;
            }
        }
    }

    public List<Toy> getAvailableToys() {
        return new ArrayList<>(toys);
    }
}
