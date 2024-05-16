import java.sql.*;

class ConnectDB {
    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "saqib1402");
            System.out.println("Connected");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM student");
            while (rs.next()) {
                System.out.println("id=" + rs.getString(1) + " name=" + rs.getString(2));
            }
            con.close(); // Close the connection when done
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace(); // Print the stack trace for any exceptions
        }
    }
}
