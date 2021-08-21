import com.yao.pojo.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Person person=context.getBean("person",Person.class);
        System.out.println(person.getName());
        System.out.println(person.getMyCat().getCatName());
        System.out.println(person.getMyDog().getDogName());
        person.getMyCat().shout();
        person.getMyDog().shout();
    }
}
