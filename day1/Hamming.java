import java.util.Scanner;

class Hamming {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = Integer.parseInt(in.nextLine());

        if (n <= 0) {
            System.out.println("INVALID INPUT");
            in.close();
            return;
        }

        int num = n;
        int factor = 2;
        boolean status = true;
        boolean firstFactor = true;

        System.out.print("Prime factors: ");

        while (num > 1) {
            if (num % factor == 0) {
                if (!firstFactor)
                    System.out.print(" x ");

                System.out.print(factor);
                firstFactor = false;

                num = num / factor;

                if (factor != 2 && factor != 3 && factor != 5)
                    status = false;
            } else {
                factor++;
            }
        }

        if (status)
            System.out.println("\n" + n + " IS A HAMMING NUMBER");
        else
            System.out.println("\n" + n + " IS NOT A HAMMING NUMBER");

        in.close();
    }
}
