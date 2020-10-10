import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    static int y;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printArray(scanner.nextInt());

        if(1==1) {
            y = 100;
        }
        y=200;
        int j;
        for(j=0;j<100;j++) {

        }
        j++;




    }

    // МЕТОД!!!
    public static void printArray(int n) {
        y++;
        int[] x = new int[n];
        Random r = new Random();
        for(int i=0;i<n;i++) {
            x[i] = r.nextInt(1000);
        }
        System.out.println(Arrays.toString(x));
    }

}
