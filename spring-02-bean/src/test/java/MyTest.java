import com.yao.pojo.HelloSpring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        //获取Spring的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        HelloSpring helloSpring=(HelloSpring) context.getBean("helloSpring");
        System.out.println(helloSpring);
    }
}

