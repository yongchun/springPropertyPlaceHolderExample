import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: ahhqcheng
 * Date: 11/30/13
 * Time: 11:59 AM
 * To change this template use File | Settings | File Templates.
 */
public class App {

    @SuppressWarnings("resource")
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        HelloWorld hello = (HelloWorld) context.getBean("helloWorldBean");

        hello.sayHello();

        hello.sayGoodbye();
    }
}