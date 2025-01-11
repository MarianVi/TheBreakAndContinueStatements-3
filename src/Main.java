import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TO DO:

        int numar = scanner.nextInt();
        int cnt = 0;
        int copyNumar = numar;
        while (numar != 0) {
            if (copyNumar < 100) {
                System.out.println("Numarul introdus trebuie sa contina cel putin 3 cifre");
                break;
            }
            if (cnt > 2) {
                break;
            }
            int reverse = numar % 10;
            System.out.print(reverse + " ");
            numar /= 10;
            cnt++;
        }
    }
}