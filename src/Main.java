import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception{
        Simulation object = new Simulation();
        //System.out.println(object.loadItems("src/phase1.txt"));
        //System.out.println(object.loadU1("src/phase1.txt"));
        //System.out.println(object.loadItems("src/phase2.txt"));
        //System.out.println(object.loadU1("src/phase2.txt"));
        ArrayList<Rocket> u1 = object.loadU1("src/phase2.txt");
        System.out.println("The budget of U1 : " + object.runSimulation(u1));
        /* System.out.println(object.loadItems("src/phase1.txt"));
        System.out.println(object.loadU2("src/phase1.txt"));
        System.out.println(object.loadItems("src/phase2.txt"));
        System.out.println(object.loadU2("src/phase2.txt"));
        */
        ArrayList<Rocket> u2 = object.loadU2("src/phase2.txt");

        System.out.println("The budget of U2 : " + object.runSimulation(u2));

    }
}
