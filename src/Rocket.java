public abstract class Rocket implements SpaceShip {
    public String type;
    public int rocketWeight;
    public int rocketMaxWeight;
    public int rocketCost;

    @Override
    public boolean canCarry(Item object) {

        return rocketWeight + object.weight <= rocketMaxWeight;
    }

    @Override
    public boolean launch() {

        return true;
    }

    @Override
    public boolean land(){

        return true;
    }

    @Override
    public void carry(Item object){
        rocketWeight += object.weight;
    }

    public String toString() {
        return (" Name of rocket " + type + " cost of rocket " + rocketCost + " weight of rocket " +  rocketWeight + " max weight " + rocketMaxWeight + "\n");
    }
}
