import java.lang.management.MemoryType;

public class PaintJob {
    public static void main(String[] args) {
        int bol = getBucketCount(2.75,3.25,2.5,1);
        System.out.println(+bol);

    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0)
            return -1;
        else {
            double area = width*height;
            double bucket = area/areaPerBucket;
            bucket = Math.ceil(bucket);
            int bucket_int = (int)bucket;
            bucket_int = bucket_int - extraBuckets;
            return bucket_int;
        }
    }
    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if(width <= 0 || height <= 0 || areaPerBucket <= 0)
            return -1;
        else {
            double area = width*height;
            double bucket = area/areaPerBucket;
            bucket = Math.ceil(bucket);
            int bucket_int = (int)bucket;
            return bucket_int;
        }
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if(area <= 0 || areaPerBucket <= 0)
            return -1;
        else {
            double bucket = area/areaPerBucket;
            bucket = Math.ceil(bucket);
            int bucket_int = (int)bucket;
            return bucket_int;
        }
    }

}
