import com.yao.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
        UserService userService=applicationContext.getBean("userService",UserService.class);
        userService.add();
        userService.delete();
    }
}
