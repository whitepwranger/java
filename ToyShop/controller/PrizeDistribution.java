package controller;

import model.Toy;

import java.util.List;

public interface PrizeDistribution {
    Toy selectPrizeToy(List<Toy> toys);
}