package simulation;

import java.util.ArrayList;
import java.util.Random;

public class Country {

    private int countryID;
    private ArrayList<Field> territory;
    Army army;
    Random generator;

    public Country(int countryID, Army army) {
        territory = new ArrayList<>();
        this.countryID = countryID;
        this.army = army;
        this.generator = generator;
    }

    void attack() {

    }

    void defend() {

    }

    public int getCountryID() {
        return countryID;
    }

    public void setCountryID(int countryID) {
        this.countryID = countryID;
    }

    public Army getArmy() {
        return army;
    }

    public void setArmy(Army army) {
        this.army = army;
    }

    public Random getGenerator() {
        return generator;
    }

    public void setGenerator(Random generator) {
        this.generator = generator;
    }

    public ArrayList<Field> getTerritory() {
        return territory;
    }

    public void setTerritory(ArrayList<Field> territory) {
        this.territory = territory;
    }
}
