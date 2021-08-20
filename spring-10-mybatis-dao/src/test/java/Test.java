import com.yao.dao.Impl.UserDaoImpl;
import com.yao.dao.UserDao;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        UserDao userDao= new UserDaoImpl();
        System.out.println(userDao.findAll());
    }
}
