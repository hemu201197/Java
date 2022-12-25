import java.lang.Math;
public class Point {
    private int x;
    private int y;
    public Point(){

    }
    public Point(int x , int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){
        double distance = Math.sqrt((0-this.x)*(0-this.x) + (0- this.y)*(0- this.y));
        return distance;
    }
    public  double distance(int x2, int y2){
        double distance = Math.sqrt((x2-this.x)*(x2-this.x) + (y2- this.y)*(y2- this.y));
        return distance;
    }
    public double distance(Point p2){
        double distance = Math.sqrt((p2.x-this.x)*(p2.x-this.x) + (p2.y- this.y)*(p2.y- this.y));
        return distance;
    }

    }

