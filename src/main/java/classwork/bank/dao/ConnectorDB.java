package classwork.bank.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ConnectorDB {
    // private final String url ;
    private final String user;
    private final String password;

    public ConnectorDB(String url, String user, String password) {
        // this.url = resource.getString();
        this.user = user;
        this.password = password;
    }

    public Connection getConnection() throws SQLException {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("database");
        return null;
    }

}
