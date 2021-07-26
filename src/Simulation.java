import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;

public class Simulation {

        public ArrayList<Item> loadItems(String path) throws Exception{
        File phase = new File(path);
        Scanner input = new Scanner(phase);
        ArrayList<Item> arrayOfItems = new ArrayList<>();

        int count = 0;
        while(input.hasNextLine()){
            String line = input.nextLine();
            String[] parts = line.split("=");
            String _name = parts[0];
            int _weight = Integer.parseInt(parts[1]);
            Item objItem = new Item(_name, _weight);
            System.out.println();
            arrayOfItems.add(objItem);
        }

        return arrayOfItems;

    }

    public ArrayList<Rocket> loadU1(String path) throws Exception{
        ArrayList<Item> itemArrayList = loadItems(path);
        ArrayList<Rocket> listOfU1Rockets= new ArrayList<>();
        listOfU1Rockets.add(new U1());
        int n = 0;
        for(int i = 0; i < itemArrayList.size(); i ++)
        {
            Item obj = itemArrayList.get(i);

            if(listOfU1Rockets.get(n).canCarry(obj)) {
                listOfU1Rockets.get(n).carry(obj);

            }
            else
            {
                n++;
                listOfU1Rockets.add(new U1());
                i--;
            }
        }
        return listOfU1Rockets;
    }

    public ArrayList<Rocket> loadU2(String path) throws Exception{
        ArrayList<Item> itemArrayList = loadItems(path);
        ArrayList<Rocket> listOfU2Rockets= new ArrayList<>();
        listOfU2Rockets.add(new U2());
        int m = 0;
        for(int i = 0; i < itemArrayList.size(); i ++)
        {
            Item obj = itemArrayList.get(i);
            if(listOfU2Rockets.get(m).canCarry(obj)) {
                listOfU2Rockets.get(m).carry(obj);
            }
            else
            {
                m++;
                listOfU2Rockets.add(new U2());
                i--;
            }
        }
        return listOfU2Rockets;

    }

    public int runSimulation(ArrayList<Rocket> rockets){
        int budget = 0;

        for(int i = 0; i < rockets.size(); i ++)
            if((rockets.get(i).launch() == false) || (rockets.get(i).land() == false)) budget += 2*rockets.get(i).rocketCost;
            else budget += rockets.get(i).rocketCost;

        return budget;
    }

}
