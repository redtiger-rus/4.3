import java.sql.*;


public class CreateTable {
    public static void main(String args[]) {
        Connection c = null;
        Statement stmt = null;
        String CreateSql = null;

        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection(
                    "jdbc:postgresql://192.168.1.67:5432/rt_db",
                    "test_user", "1q2w3e4r5t");

            System.out.println("Database Connected ..");
            stmt = c.createStatement();
//            CreateSql = "Create Table Test(id int primary key, name varchar, address text) ";
            stmt.executeUpdate(CreateSql);
            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
//        System.out.println("Table Created successfully");
    }
}