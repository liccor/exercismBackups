public class Lasagna {
    double time;
    int layers;

    public Lasagna() {

    }

    public Lasagna(double time, int layers) {
        this.time = time;
        this.layers = layers;
    }

    // TODO: define the 'expectedMinutesInOven()' method
    public double expectedMinutesInOven() {
        return 40;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public double remainingMinutesInOven(double time) {
        return  expectedMinutesInOven() - time;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public double preparationTimeInMinutes(int layer) { 
        return 2*layer;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public double totalTimeInMinutes(double time, int layers) {
        return preparationTimeInMinutes(layers) + time;
    }
}