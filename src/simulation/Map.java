package simulation;

import java.util.ArrayList;
import java.util.Random;

public class Map {
    //private ArrayList<Country> countries ;
    int ID=0;

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
/*
        for(int i = 0; i<data.getSize(); i++){
            for(int j = 0; j<data.getSize(); j++) {
               System.out.print(field[i][j].getGold()+" ");
            }System.out.println();
        }
 */
    }
    public void settingFieldID(){
        for(int i = 0; i<data.getMapSize(); i++){
            for(int j = 0; j<data.getMapSize(); j++)
            {
                field[i][j] = new Field();
                field[i][j].setFieldID(ID);
                ID++;
                // System.out.print(field[i][j].getOwnerID()+" ");
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
/*
        for(int i = 0; i<data.getSize(); i++){
            for(int j = 0; j<data.getSize(); j++) {
                System.out.print(field[i][j].getPopulation()+" ");
            }System.out.println();
        }
*/
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
            }while(field[xCor][yCor].ownerID!=-1);

            countries.get(i).getTerritory().add(field[xCor][yCor]);
            countries.get(i).ggg(field[xCor][yCor]);
            countries.get(i).ppp(field[xCor][yCor]);
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

            countries.get(i).getTerritory().lastElement().getFieldID();
            for(int j=0; j<data.getMapSize(); j++){
                for(int k=0; k<data.getMapSize(); k++){
                    if(field[j][k].getFieldID()==countries.get(i).getTerritory().lastElement().getFieldID()){
                        //System.out.println(field[j][k].getFieldID()+"    "+countries.get(i).getTerritory().lastElement().getFieldID());
                        while(true) {
                            try {

                                x = generator.nextInt(4);

                                // System.out.println("ID " + i + "X" + x);
                                if (x == 0&&field[j - 1][k].getOwnerID()!=i) {
                                    field[j - 1][k].setOwnerID(i);
                                    //countries.get(i).getTerritory().add(field[j-1][k]);
                                    break;
                                }

                                else if (x == 1&&field[j + 1][k].getOwnerID()!=i) {
                                    field[j + 1][k].setOwnerID(i);
                                    //countries.get(i).getTerritory().add(field[j+1][k]);
                                    break;
                                }

                                else if (x == 2&&field[j][k-1].getOwnerID()!=i) {
                                    field[j][k - 1].setOwnerID(i);
                                    //countries.get(i).getTerritory().add(field[j][k-1]);
                                    break;
                                }

                                else if (x == 3&&field[j][k+1].getOwnerID()!=i) {
                                    field[j][k + 1].setOwnerID(i);
                                    //countries.get(i).getTerritory().add(field[j][k+1]);
                                    break;
                                }
                            } catch (ArrayIndexOutOfBoundsException e) {


                            }
                        }
                    }
                }

            }
            for(int j=0; j<data.getMapSize(); j++){
                for(int k=0; k<data.getMapSize(); k++){
                    if(field[j][k].getOwnerID()==i)
                        countries.get(i).getTerritory().add(field[j][k]);
                }
            }


            //countries.get(i).getTerritory().add(field[xCor][yCor]);
            //field[xCor][yCor].setOwnerID(i);
        }
    }
}