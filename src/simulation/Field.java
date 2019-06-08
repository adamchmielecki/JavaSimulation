package simulation;

import java.util.Random;

public class Field {

    Plague plague;
    Drought drought;
    Tornado tornado;
    Data data;


    private int gold;
    private int population;
    private int ownerID;
    private int fieldID;
    private Random generator;

    public Field(int gold, int population) {
        this.setGold(gold);
        this.setPopulation(population);
        this.ownerID = -1;

        generator = new Random();

    }



    public int getFieldID() {
        return fieldID;
    }

    public void setFieldID(int fieldID) {
        this.fieldID = fieldID;
    }

    public int getOwnerID() {
        return ownerID;
    }

    public void setOwnerID(int ownerID) {
        this.ownerID = ownerID;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getPopulation() { return population; }

    public void setPopulation(int population) { this.population = population; }


}
