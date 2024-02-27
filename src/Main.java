import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int [] arrays = new int [10];

         for (int i = 0; i < arrays.length; i++) {
             System.out.println("Nhap so");
             arrays[i] = scanner.nextInt();
         }
         int max = arrays[0];
         for (int i = 0; i < arrays.length; i++) {
             if (max < arrays[i]) {
                 max = arrays[i];

             }
         }
        System.out.println("so lon nhat " +max);

    }
}