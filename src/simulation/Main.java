package simulation;

public class Main {

    public static void main(String[] args) {

        Data data = new Data(10,10,10);
        Map map = new Map(data);
        map.generateResources(100,10);
        map.generateStartingPosition();
        map.printMap();

    }
}
