import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scam = new Scanner(System.in);
        int[] num = new int[5];

        for (int i = 0; i < num.length; i++) {
            System.out.print("Digite o "+(i+1)+"ª numero: ");
            num[i] = scam.nextInt();
        }

        System.out.println("Os valores INVERTIDO dos numeros é: ");

        for (int i = num.length-1; i >= 0 ; i--) {
            System.out.print(num[i] + " ");
        }
    }
}