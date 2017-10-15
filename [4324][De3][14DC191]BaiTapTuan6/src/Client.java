import java.rmi.ConnectException;
import java.rmi.Naming;
import java.util.Scanner;

public class Client {
    private static final String host = "localhost";

    public Client() {
    }

    public static void main(String[] var0) throws Exception {
        Scanner bp = new Scanner(System.in);
        System.out.println("Import to array number : ");

        int n;
        do {
            n = bp.nextInt();
            if (n <= 0) {
                System.out.println("Please enter again and > 0");
            }
        } while(n <= 0);

        int[] a = new int[n];

        int i;
        for(i = 0; i < n; ++i) {
            System.out.println("Input element[" + i + "]:");
            a[i] = bp.nextInt();
        }

        System.out.println("---- Array list ----");

        for(i = 0; i < n; ++i) {
            System.out.print(a[i] + "  ");
        }

        try {
            String rmiObjectName = "rmi://localhost/Arrangement";
            Arrangement greeting_message = (Arrangement)Naming.lookup(rmiObjectName);

            System.out.println("\n---- OK -----\n");
            int[] Hello = new int[n];
            Hello = greeting_message.InterChangeSort(a, n);

            for(int j = 0; j < n; ++j) {
                System.out.print(Hello[j] + "  ");
            }
        } catch (ConnectException var8) {
            System.out.println("Unable to connect to server!");
            System.exit(1);
        } catch (Exception var9) {
            var9.printStackTrace();
            System.exit(1);
        }

    }
}