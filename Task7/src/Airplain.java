public class Airplain {

    public static class Wing {
        private double wingWeight;

        public void setWingWeight(double wingWeight) {
            this.wingWeight = wingWeight;
        }

        public double getWingWeight() {
            return wingWeight;
        }

        public void printWingWeight() {
            System.out.println(wingWeight);
        }
    }

    public static void main(String[] args) {
        Airplain.Wing wing1 = new Airplain.Wing();
        wing1.setWingWeight(5.3);
        wing1.printWingWeight();
        Airplain.Wing wing2 = new Airplain.Wing();
        wing2.setWingWeight(6.3);
        wing2.printWingWeight();
    }
}
