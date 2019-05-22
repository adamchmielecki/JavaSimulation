package simulation;

public class Army {
    public Army(int amountOfSoldiers, int amountOfTanks, int amountOfJets) {
        this.amountOfSoldiers = amountOfSoldiers;
        this.amountOfTanks = amountOfTanks;
        this.amountOfJets = amountOfJets;
        soldier = new Soldier();
        tank = new Tank();
        jet = new Jet();
    }

    private int amountOfSoldiers;
    private int amountOfTanks;
    private int amountOfJets;

    Soldier soldier;
    Tank tank;
    Jet jet;

    private void updateArmy(){}
    private void generateRandomArmy(){}

    public int getAmountOfSoldiers() {
        return amountOfSoldiers;
    }

    public void setAmountOfSoldiers(int amountOfSoldiers) {
        this.amountOfSoldiers = amountOfSoldiers;
    }

    public int getAmountOfTanks() {
        return amountOfTanks;
    }

    public void setAmountOfTanks(int amountOfTanks) {
        this.amountOfTanks = amountOfTanks;
    }

    public int getAmountOfJets() {
        return amountOfJets;
    }

    public void setAmountOfJets(int amountOfJets) {
        this.amountOfJets = amountOfJets;
    }
}
