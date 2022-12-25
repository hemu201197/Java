public class Calculator {
    private Floor floor;
    private Carpet carpet;
    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }


    public double getTotalCost() {
        double Area = floor.getArea();
        double Cost = carpet.getCost();
        double Totalcost = Area*Cost;
        return Totalcost;
    }
}

