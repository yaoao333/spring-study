import com.yao.config.SpringConfiguration;
import com.yao.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringConfiguration.class})
public class MyTest {

    // 传统test方式
    /*public static void main(String[] args) throws PropertyVetoException, SQLException {
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(SpringConfiguration.class);
        DataSource dataSource = (DataSource) applicationContext.getBean("dataSource");
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }*/

    @Autowired
    private DataSource dataSource;

    @Autowired
    private User user;

    //测试一个已注入的DataSource类
    @Test
    public void test1() throws SQLException {
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }

    //测试一个未注入的User类
    @Test
    public void test2(){
        System.out.println(user);
    }
}
