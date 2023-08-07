package view;

import model.ToyStore;

public class OrganizeRaffleAction implements MenuAction{
    private ToyStore toyStore;

    public OrganizeRaffleAction(ToyStore toyStore) {
        this.toyStore = toyStore;
    }

    @Override
    public void execute() {
        toyStore.organizeRaffle();
    }
}
