package simulation;

public class Data {
    private int numberOfCountries;
    private int size;
    private int numberOfIterations;

    public Data(int numberOfCountries, int size, int numberOfIterations) {
        this.numberOfCountries = numberOfCountries;
        this.size = size;
        this.numberOfIterations = numberOfIterations;
    }

    public int getNumberOfCountries() {
        return numberOfCountries;
    }

    public void setNumberOfCountries(int numberOfCountries) {
        this.numberOfCountries = numberOfCountries;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getNumberOfRounds() {
        return numberOfIterations;
    }

    public void setNumberOfRounds(int numberOfRounds) {
        this.numberOfIterations = numberOfRounds;
    }
}
