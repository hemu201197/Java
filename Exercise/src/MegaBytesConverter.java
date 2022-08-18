public class MegaBytesConverter {
    public static void main(String[] args) {
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes > 0) {
            int meggabytes = kiloBytes / 1024;
            int remainingKiloBytes = kiloBytes % 1024;
            System.out.println(+kiloBytes + " KB = " + meggabytes + " MB and " + remainingKiloBytes + " KB.");

        }
        else
            System.out.println("Invalid Value");
    }
}
