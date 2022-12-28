import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Practice01 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","014589Sd.");
        Statement st = con.createStatement();

        //2 tamsayı parametresi kullanan ve tamsayıların toplamını döndüren bir işlev oluşturun
        con.close();
        st.close();


    }
}
