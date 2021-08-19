import com.yao.dao.UserDaoImpl_1;
import com.yao.service.UserService;
import com.yao.service.UserServiceImpl;

public class MyTest {
    public static void main(String[] args) {
        //用户只需要调用业务层，而不需要接触dao层
        UserService userService=new UserServiceImpl();
        ((UserServiceImpl)userService).setUserDao(new UserDaoImpl_1());//用户自由选择dao层实现方式，而不需要在业务层中进行修改

        userService.getUser();
    }
}
