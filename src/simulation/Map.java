package simulation;

import java.util.ArrayList;
import java.util.Random;

public class Map {
    public Map(Data data) {
        this.data = data;
        field = new Field[data.getSize()][data.getSize()];
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
        for(int i = 0; i<data.getSize(); i++) {
            for (int j = 0; j < data.getSize(); j++) {
                field[i][j] = new Field();
                field[i][j].setGold(generator.nextInt(max) + min);

            }
        }

        for(int i = 0; i<data.getSize(); i++){
            for(int j = 0; j<data.getSize(); j++) {
               System.out.print(field[i][j].getGold());

            }System.out.println();

        }
    }
    private void generateSilver(int max, int min){
        for(int i = 0; i<data.getSize(); i++){
            for(int j = 0; j<data.getSize(); j++) {
                field[i][j]=new Field();
                field[i][j].setPopulation(generator.nextInt(max)+min);
            }
        }
        for(int i = 0; i<data.getSize(); i++){
            for(int j = 0; j<data.getSize(); j++) {
                System.out.print(field[i][j].getPopulation());

            }System.out.println();

        }
    }

    public void generateResources(int max, int min){
      generateGold(max,min);
      generateSilver(max,min);


    }
    public void printMap(){
        for(int i = 0; i<data.getSize(); i++){
            for(int j = 0; j<data.getSize(); j++) {
                System.out.print(field[i][j].getOwnerID()+" ");
            }System.out.println();
        }

    }
    public void generateStartingPosition(){
        for(int i = 0; i<data.getNumberOfCountries(); i++){
            int xCor=0;
            int yCor=0;
            do{
                xCor = generator.nextInt(data.getSize());
                yCor = generator.nextInt(data.getSize());
            }while(field[xCor][yCor].ownerID!=-1);

            countries.get(i).getTerritory().add(field[xCor][yCor]);
            field[xCor][yCor].setOwnerID(i);
        }
    }
}
