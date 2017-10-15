import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Arrangement_Implementation extends UnicastRemoteObject implements Arrangement {
    public Arrangement_Implementation() throws RemoteException {
    }

    public int[] InterChangeSort(int[] a, int n) throws RemoteException {
        for(int i = 0; i < n - 1; ++i) {
            for(int j = i + 1; j < n; ++j) {
                if (a[j] < a[i]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        return a;
    }
}