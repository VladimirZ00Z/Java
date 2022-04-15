package Task3;

public class Truck extends Car{
    private int wheelsCount;
    private int maxWeight;

    public Truck(int w, String m, char c, float s, int wheelsCount, int maxWeight) {
        super(w, m, c, s);
        this.wheelsCount = wheelsCount;
        this.maxWeight = maxWeight;
    }

    public  void newWheels(int wheelsCount){
        this.wheelsCount = wheelsCount;
        System.out.println("Количество колёс: " + wheelsCount);
    }
}
