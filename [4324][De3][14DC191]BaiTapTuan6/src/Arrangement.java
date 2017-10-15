import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Arrangement extends Remote {
    int[] InterChangeSort(int[] a, int n) throws RemoteException;
}
