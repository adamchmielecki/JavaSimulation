package simulation;

public class Field extends Resources{

    int ownerID;
    int fieldID;

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

    Tornado tornado = new Tornado();
    Plague plague = new Plague();
    Drought drought = new Drought();

    public Field(int gold, int silver) {
        this.setGold(gold);
        this.setPopulation(silver);
        this.ownerID = -1;
    }

    public Field() {
        this.setGold(0);
        this.setPopulation(0);
        this.ownerID = -1;
    }



}
