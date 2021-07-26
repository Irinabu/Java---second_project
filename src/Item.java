public class Item {
    public String name;
    public int weight;
    public Item(String _name, int _weight){
        name = _name;
        weight = _weight;
    }

    public String toString() {
        return ("Name of item: " + name + "and weight of item: " + weight +"\n");
    }
}
