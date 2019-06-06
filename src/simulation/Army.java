package simulation;

public class Army{
    public Army(int amountOfSoldiers, int amountOfTanks, int amountOfJets) {
        this.amountOfSoldiers = amountOfSoldiers;
        this.amountOfTanks = amountOfTanks;
        this.amountOfJets = amountOfJets;
        soldier = new Soldier();
        tank = new Tank();
        jet = new Jet();
        soldier.setStrenghtOfAttack(20);
        soldier.setStrenghtOfDefence(12);
        tank.setStrenghtOfAttack(56);
        tank.setStrenghtOfDefence(33);
        jet.setStrenghtOfAttack(200);
        jet.setStrenghtOfDefence(45);
    }



    private int amountOfSoldiers;
    private int amountOfTanks;
    private int amountOfJets;

    Soldier soldier;
    Tank tank;
    Jet jet;


    private void updateArmy(){}

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
