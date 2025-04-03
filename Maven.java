import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Maven {
    public static void main(String[] args) {
        try {
            Class.forName("jdbc.mysql.cj.Driver");

            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/nanidb", "root", "root");

            java.sql.Statement stmt = connect.createStatement();

            String sql = "select * from login";

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                System.out.println(rs.getString(1) + " " +  rs.getString(2));
                
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
