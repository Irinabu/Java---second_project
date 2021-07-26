public interface SpaceShip {

    boolean launch();
    boolean land();
    boolean canCarry(Item object);
    void carry(Item object);

}
