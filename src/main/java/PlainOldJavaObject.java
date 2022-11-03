public class PlainOldJavaObject {

    private String car;
    private String colour;

    @Override
    public String toString() {
        return "Car: " + this.car + " — Colour: " + this.colour;
    }
    public PlainOldJavaObject(String Car, String Colour) {
        this.car = Car;
        this.colour = Colour;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}