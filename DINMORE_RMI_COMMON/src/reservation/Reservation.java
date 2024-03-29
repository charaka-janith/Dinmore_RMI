package reservation;

import java.rmi.Remote;

public interface Reservation extends Remote {
    public boolean reserve(Object key)throws Exception;
    public boolean release(Object key)throws Exception;
}
