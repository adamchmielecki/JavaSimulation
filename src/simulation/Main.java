package simulation;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        try{
            BufferedReader input = new BufferedReader(new FileReader("InputData.txt"));
            Data.readInputData(input);
            input.close();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

        Data data = new Data(Data.getNumberOfCountries(),Data.getMapSize(),Data.getNumberOfIterations());
        /*System.out.println(Data.getNumberOfCountries());
        System.out.println(Data.getMapSize());
        System.out.println(Data.getNumberOfIterations());*/
        Map map = new Map(data);
        map.generateResources(100,10);
        map.generateStartingPosition();
        map.printMap();
    }
}
az