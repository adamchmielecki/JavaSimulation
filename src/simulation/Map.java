package simulation;

import java.util.ArrayList;
import java.util.Random;

public class Map {
    //private ArrayList<Country> countries ;
    private int ID=0;

    public Map(Data data) {
        this.data = data;
        field = new Field[data.getMapSize()][data.getMapSize()];
        countries = new ArrayList<>();
        generator = new Random();
        generator2 = new Random();

        for(int i = 0; i<data.getNumberOfCountries(); i++){
            countries.add(new Country(i,new Army(1,1,1)));

        }
    }

    Data data;
    Field [][] field;
    ArrayList<Country> countries;
    Random generator;
    Random generator2;

    public void settingID(){
        for(int i = 0; i<data.getMapSize(); i++){
            for(int j = 0; j<data.getMapSize(); j++)
            {
                field[i][j] = new Field(1,1);
                field[i][j].setFieldID(ID);
                ID++;
                // System.out.print(field[i][j].getOwnerID()+" ");
            }
        }
    }

    private void generateGold(int max, int min){
        for(int i = 0; i<data.getMapSize(); i++) {
            for (int j = 0; j < data.getMapSize(); j++) {
                // field[i][j] = new Field();
                field[i][j].setGold(generator.nextInt(max) + min);

            }
        }

        for(int i = 0; i<data.getMapSize(); i++){
            for(int j = 0; j<data.getMapSize(); j++) {
               System.out.print(field[i][j].getGold()+" ");
            }System.out.println();
        }

    }



    private void generatePopulation(int max, int min){
        for(int i = 0; i<data.getMapSize(); i++){
            for(int j = 0; j<data.getMapSize(); j++) {
                //field[i][j]=new Field();
                field[i][j].setPopulation(generator.nextInt(max)+min);
            }
        }

        for(int i = 0; i<data.getMapSize(); i++){
            for(int j = 0; j<data.getMapSize(); j++) {
                System.out.print(field[i][j].getPopulation()+" ");
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
                field[i][j].setFieldID(ID);
                ID++;
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
            }while(field[xCor][yCor].getOwnerID()!=-1);

            countries.get(i).getTerritory().add(field[xCor][yCor]);
            countries.get(i).summingCountryGold();
            countries.get(i).summingCountryPopuation();
            field[xCor][yCor].setOwnerID(i);
        }
    }
    public void takeNewField(){
        int [][] ownerTable = new int[data.getMapSize()][data.getMapSize()];

        for(int j=0; j<data.getMapSize(); j++) {
            for (int k = 0; k < data.getMapSize(); k++) {
                ownerTable[j][k]=field[j][k].getOwnerID();
            }
        }

        for(int i = 0; i<data.getNumberOfCountries(); i++){
            int x;
            int pole=0;
            int randomField;

            if(!countries.get(i).getTerritory().empty()){
                boolean t1=false,t2=false,t3=false,t4=false;
                for(int j=0; j<data.getMapSize(); j++){
                    for(int k=0; k<data.getMapSize(); k++){
                        pole=countries.get(i).getTerritory().size();
                        randomField=generator.nextInt(pole);
                        if(field[j][k].getFieldID()==countries.get(i).getTerritory().get(randomField).getFieldID()){
                            //System.out.println(field[j][k].getFieldID()+"    "+countries.get(i).getTerritory().lastElement().getFieldID());
                            while(true) {
                                try {

                                    x = generator.nextInt(4);

                                    // System.out.println("ID " + i + "X" + x);
                                    if (x == 0&&field[j - 1][k].getOwnerID()!=i) {
                                        if (field[j - 1][k].getOwnerID()!=-1) {
                                            if(countries.get(i).attack()>countries.get(field[j - 1][k].getOwnerID()).defend()){
                                                countries.get(field[j - 1][k].getOwnerID()).getTerritory().pop();
                                                field[j - 1][k].setOwnerID(i);
                                            }
                                            else  field[j - 1][k].setOwnerID(field[j - 1][k].getOwnerID());
                                        }


                                        else field[j - 1][k].setOwnerID(i);


                                        break;
                                    }

                                    if (x == 1&&field[j + 1][k].getOwnerID()!=i) {
                                        if (field[j + 1][k].getOwnerID()!=-1) {
                                            if(countries.get(i).attack()>countries.get(field[j + 1][k].getOwnerID()).defend()){
                                                countries.get(field[j + 1][k].getOwnerID()).getTerritory().pop();
                                                field[j + 1][k].setOwnerID(i);
                                            }
                                            else  field[j + 1][k].setOwnerID(field[j - 1][k].getOwnerID());
                                        }
                                        else  field[j + 1][k].setOwnerID(i);

                                        //countries.get(i).getTerritory().add(field[j+1][k]);
                                        break;
                                    }

                                    if (x == 2&&field[j][k-1].getOwnerID()!=i) {
                                        if (field[j][k-1].getOwnerID()!=-1) {
                                            if(countries.get(i).attack()>countries.get(field[j][k-1].getOwnerID()).defend()){
                                                countries.get(field[j][k-1].getOwnerID()).getTerritory().pop();
                                                field[j][k-1].setOwnerID(i);
                                            }
                                            else  field[j ][k- 1].setOwnerID(field[j - 1][k].getOwnerID());
                                        }
                                        else field[j][k - 1].setOwnerID(i);

                                        break;
                                    }

                                   if (x == 3&&field[j][k+1].getOwnerID()!=i) {
                                        if (field[j][k+1].getOwnerID()!=-1) {
                                            if(countries.get(i).attack()>countries.get(field[j][k+1].getOwnerID()).defend()){
                                                countries.get(field[j][k+1].getOwnerID()).getTerritory().pop();
                                                field[j][k+1].setOwnerID(i);
                                            }
                                            else  field[j][k - 1].setOwnerID(field[j - 1][k].getOwnerID());
                                        }
                                        else  field[j][k+1].setOwnerID(i);


                                        break;
                                    }
                                   break;
                                } catch (ArrayIndexOutOfBoundsException e) {

                                }
                            }
                        }
                    }

                }
                for(int j=0; j<data.getMapSize(); j++){
                    for(int k=0; k<data.getMapSize(); k++){
                        if(field[j][k].getOwnerID()==i) {
                            countries.get(i).getTerritory().add(field[j][k]);
                        }
                    }
                }
            }

        }
    }
}