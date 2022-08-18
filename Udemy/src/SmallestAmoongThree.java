public class SmallestAmoongThree {
    public static void main(String[] args){
        Smallest(46873,657,80000);
    }
    public static void Smallest(int first , int second , int third){
        int small = 0;
        if(first < second){
             small = first;
        }else{
             small = second;
        }
        if (small < third){

            System.out.println(small+" is the smallest number");
        }
        else {

            System.out.println(third+ " is the smallest number");
        }

    }
}
