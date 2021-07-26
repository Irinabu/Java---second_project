public class U2 extends Rocket {
    public U2(){
        rocketWeight = 18000;
        rocketCost = 120;
        rocketMaxWeight = 29000;
        type = "U2";
    }
    @Override
    public boolean launch(){
        double chanceOfLaunchExplosion = 0.05*(rocketWeight/rocketMaxWeight);
        return chanceOfLaunchExplosion < 50;
    }

    @Override
    public boolean land(){
        double chanceOfLandExplosion = 0.01*(rocketWeight/rocketMaxWeight);
        return chanceOfLandExplosion < 50;

    }
}
