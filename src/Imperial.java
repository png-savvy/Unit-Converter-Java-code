public class Imperial {
    private double feet;

    public Imperial(double feet) {
        this.feet = feet;
    }

    public double convertToMeters(){ return feet/3.28084;}

    public void setFeet(double feet) {
        this.feet = feet;
    }

    public double getFeet() {
        return feet;
    }

    public double getInches(){
        return feet * 12;
    }

    public double getMiles(){
        return feet * 5280;
    }

    // methods that will take a parameter in feet to convert to desired mesurment
    public double getInches(double feet){
        return feet * 12;
    }

    public double getMiles(double feet){
        return feet * 5280;
    }

    @Override
    public String toString() {
        return "Imperial{" +
                "feet=" + feet +
                '}';
    }
}
