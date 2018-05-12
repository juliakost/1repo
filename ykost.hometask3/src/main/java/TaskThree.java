public class TaskThree {

    private int x;
    private int y;
    double k;
    double z;

    public TaskThree(int x, int y, double k, double z) {
        this.x = x;
        this.y = y;
        this.k = k;
        this.z = z;

    }

    public double addDouble() {
        return k + z;
    }

    public int subInteger() {
        return x - y;
    }

    public int multInteger() {
        return x * y;
    }

    public int divideInteger() {
        return x / y;
    }

    public double divideDouble() {
        return k / z;
    }


}


