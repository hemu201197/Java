public class AreaCalculator {
    public static void main(String[] args) {

    }

    public static double area(double radius) {
        if (radius > 0) {
            double areaofcircle = radius * radius * Math.PI;
            return areaofcircle;
        }
        else
            return -1;

    }
    public static double area(double x, double y) {
        if (x > 0 && y > 0) {
            double areofrectangle = x*y;
            return areofrectangle;
        }
        else
            return -1;

    }

}

