import java.rmi.Naming;

public class Server {
    private static final String host = "localhost";

    public Server() {
    }

    public static void main(String[] var0) throws Exception {
        Arrangement_Implementation temp = new Arrangement_Implementation();
        String rmiObjectName = "rmi://localhost/Arrangement";
        Naming.rebind(rmiObjectName, temp);
        System.out.println("Binding complete...\n");
    }
}