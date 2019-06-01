package simulation;

import java.util.ArrayList;
import java.util.Random;

public class Map {
    public Map(Data data) {
        this.data = data;
        field = new Field[data.getMapSize()][data.getMapSize()];
        countries = new ArrayList<>();
        for(int i = 0; i<data.getNumberOfCountries(); i++){
            countries.add(new Country(i,new Army(1,1,1)));

        }
    }

    Data data;
    Field [][] field;
    ArrayList<Country> countries;
    Random generator = new Random();

    private void generateGold(int max, int min){
        for(int i = 0; i<data.getMapSize(); i++) {
            for (int j = 0; j < data.getMapSize(); j++) {
                field[i][j] = new Field();
                field[i][j].setGold(generator.nextInt(max) + min);

            }
        }

        for(int i = 0; i<data.getMapSize(); i++){
            for(int j = 0; j<data.getMapSize(); j++) {
               System.out.print(field[i][j].getGold());

            }System.out.println();

        }
    }
    private void generatePopulation(int max, int min){
        for(int i = 0; i<data.getMapSize(); i++){
            for(int j = 0; j<data.getMapSize(); j++) {
                field[i][j]=new Field();
                field[i][j].setPopulation(generator.nextInt(max)+min);
            }
        }
        for(int i = 0; i<data.getMapSize(); i++){
            for(int j = 0; j<data.getMapSize(); j++) {
                System.out.print(field[i][j].getPopulation());

            }System.out.println();

        }
    }

    public void generateResources(int max, int min){
      generateGold(max,min);
      generatePopulation(max,min);


    }
    public void printMap(){
        for(int i = 0; i<data.getMapSize(); i++){
            for(int j = 0; j<data.getMapSize(); j++) {
                System.out.print(field[i][j].getOwnerID()+" ");
            }System.out.println();
        }

    }
    public void generateStartingPosition(){
        for(int i = 0; i<data.getNumberOfCountries(); i++){
            int xCor=0;
            int yCor=0;
            do{
                xCor = generator.nextInt(data.getMapSize());
                yCor = generator.nextInt(data.getMapSize());
            }while(field[xCor][yCor].ownerID!=-1);

            countries.get(i).getTerritory().add(field[xCor][yCor]);
            field[xCor][yCor].setOwnerID(i);
        }
    }
}
