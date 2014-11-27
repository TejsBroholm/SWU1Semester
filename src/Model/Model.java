
import java.sql.*; // Import required packages

public class Model {
    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String database_name = "De_vilde_fisk";
    static final String DB_URL = "jdbc:mysql://mysql.itu.dk/" + database_name;
    //  Database credentials
    static final String USER = "simon";
    static final String PASS = "fisk123";


    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver()); // Register driver
            connection = DriverManager.getConnection(DB_URL, USER, PASS); // Open connection
            statement = connection.createStatement(); // Create statement
            String sql = "SELECT * FROM Person"; // NB: implicit semi-colon!
            ResultSet rs = statement.executeQuery(sql); // *** EXECUTE QUERY! ***
            // STEP 5: Extract data from result set
            while (rs.next()) { // Retrieve data by column name
                String idPerson = rs.getString("idPerson");
                String Personcol = rs.getString("Personcol");
                // int id  = rs.getInt("id");
                System.out.println("id: '" + idPerson + "', person: '" + Personcol + "'"); // Display data
            }
            rs.close(); // close query
            connection.close(); // close connection
        } catch(Exception e) {
            e.printStackTrace(); // handle errors
        } }
}