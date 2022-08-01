import lombok.extern.log4j.Log4j;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;

@Log4j
public class DBconn
{

    @Test
    public void test_1()
    {
        String id = "root";
        String pw = "1234";
        String url = "jdbc:mysql://localhost:3306/";
        
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, id, pw);
            log.info(conn);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }

}
