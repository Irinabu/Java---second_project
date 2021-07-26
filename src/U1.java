public class U1 extends Rocket{

    public U1(){
        rocketWeight = 10000;
        rocketCost = 100;
        rocketMaxWeight = 18000;
        type = "U1";
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
