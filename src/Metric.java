public class Metric {
    private double meters;

    public Metric(double meters) {
        this.meters = meters;
    }

    public double convertToFeet(){
        return meters * 3.28084;
    }

    public void setMeters(double meters) {
        this.meters = meters;
    }

    public double getMeters() {
        return meters;
    }

    public double getKilometers(){
        return meters/1000;
    }

    public double getCentimeters(){
        return meters * 100;
    }

    public double getKilometers(double meters){
        return meters/1000;
    }

    public double getCentimeters(double meters){
        return meters * 100;
    }

    @Override
    public String toString() {
        return "Meters{" +
                "meters=" + meters +
                '}';
    }
}
