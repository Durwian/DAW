package org.ioc.daw;

import org.ioc.daw.db.DBConnection;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import org.ioc.daw.user.User;
import org.ioc.daw.user.UserDAO;

public class DBConnectionTest {
    private DBConnection dBConnection;
    private String connectionProperties = "db-test.properties";
    Connection connection;

    @Before
    public void setUp(){
        dBConnection = new DBConnection(connectionProperties);
    }

    @After
    public void cleanUp() throws SQLException {
        if(connection != null){
          connection.close(); 
        }
    }

    @Test
    public void connectarAmbLaBaseDeDades() throws IOException, SQLException {
        connection = dBConnection.getConnection();
        Assert.assertEquals("H2 JDBC Driver", connection.getMetaData().getDriverName());
        Assert.assertEquals("SOCIOC_DB", connection.getCatalog());
    }
    @Test
    public void dbConnectWrongDriver() throws IOException, SQLException {
        connection = dBConnection.getConnection();
        Assert.assertNull(connection);
    }
    
    @Test
    public void findAllUsers(){
        UserDAO userDAO = new UserDAO(dBConnection);
        List<User> users = userDAO.findAllUsers ();
        Assert.assertEquals("Hauriem de tenir 2 usuaris a la base de dades", 2, users.size());
    }
}
