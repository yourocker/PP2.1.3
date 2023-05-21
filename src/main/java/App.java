import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld bean1 = applicationContext.getBean(HelloWorld.class);
        System.out.println(bean == bean1);

        Cat cat1 = applicationContext.getBean(Cat.class);
        Cat cat2 = applicationContext.getBean(Cat.class);
        System.out.println(cat1 == cat2);
    }
}