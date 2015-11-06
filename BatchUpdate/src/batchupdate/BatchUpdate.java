package batchupdate;

import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchUpdate {

    public static void main(String[] args) throws SQLException {
        DriverManager.registerDriver(new Driver());
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_allowance", "root", "");
        Statement st = con.createStatement();
        st.addBatch("insert into demo values (1)");
        st.addBatch("insert into demo values (2)");
        st.addBatch("insert into demo values (3)");
        int[] executeBatch = st.executeBatch();
        st.close();
        con.close();
        for(int i : executeBatch)
            System.out.println(i + " row(s) affected.");
    }
}
