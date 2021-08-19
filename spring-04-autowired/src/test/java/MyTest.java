import com.yao.pojo.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Person person=context.getBean("person",Person.class);
        person.getMyCat().shout();
        person.getMyDog().shout();
        if(null==person.getMyCat().getCatName())
            System.out.println("yes");
    }
}
