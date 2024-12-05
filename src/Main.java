import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Taban değerini girin: ");
        int base = sc.nextInt();
        System.out.print("Üs değerini girin: ");
        int exponent = sc.nextInt();
        int result = 1;
        for (int i = 1; i <= exponent; i++){
            result *= base;
        }
        System.out.println(base + "^" + exponent + " = " + result);
    }
}