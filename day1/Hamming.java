import java.util.Scanner;

class Hamming {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = Integer.parseInt(in.nextLine());

        if (n < 0) {
            System.out.println("NEGATIVE NUMBER ENTERED. INVALID INPUT");
            in.close();
            return;
        }

        boolean status = true;

        if (n < 2)
            status = false;

        int pf = 2;
        int num = n;
        int count = 0;

        while (num > 1) {
            if (num % pf == 0) {
                count++;

                if (count == 1)
                    System.out.print(pf);
                else
                    System.out.print(" x " + pf);

                num /= pf;

                if (pf != 2 && pf != 3 && pf != 5)
                    status = false;
            } else {
                pf++;
            }
        }

        if (status)
            System.out.println("\n" + n + " IS A HAMMING NUMBER");
        else
            System.out.println("\n" + n + " IS NOT A HAMMING NUMBER");

        in.close();
    }
}
