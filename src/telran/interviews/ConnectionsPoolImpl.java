package telran.interviews;

import java.util.LinkedHashMap;
import java.util.Map;

public class ConnectionsPoolImpl implements ConnectionsPool {
    private final int connectionsPoolLimit;
    private final LinkedHashMap<Integer, Connection> connectionsMap;

    public ConnectionsPoolImpl(int connectionsPoolLimit) {
        this.connectionsPoolLimit = connectionsPoolLimit;
        this.connectionsMap = new LinkedHashMap<>(connectionsPoolLimit, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, Connection> eldest) {
                return size() > connectionsPoolLimit;
            }
        };
    }

    @Override
    public boolean addConnection(Connection connection) {
        if (connectionsMap.containsKey(connection.id)) {
            return false;
        }

        connectionsMap.put(connection.id, connection);
        return true;
    }

    @Override
    public Connection getConnection(int id) {
        return connectionsMap.get(id);
    }
}

