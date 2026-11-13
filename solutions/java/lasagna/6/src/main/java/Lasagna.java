public class Lasagna {
    int time;
    int layers;

    public Lasagna(int time, int layers) {
        this.time = time;
        this.layers = layers;
    }

    public Lasagna() {
    }

    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven() {
        return 40;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int time) {
        return expectedMinutesInOven() - time;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layers) {
        return 2*layers;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layers, int time) {
        return preparationTimeInMinutes(layers) + time;
    }
}