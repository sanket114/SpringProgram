package LookUpMethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args)
    {
        ApplicationContext ap= new ClassPathXmlApplicationContext("app.xml");
        Employee e=(Employee) ap.getBean("Employee");
        Address ad=e.getAd();
        System.out.println(ad);
        e.getAd().setCityName("amravati");
        Address ad1=e.getAd();
        System.out.println(ad1);
        System.out.println(ad==ad1);
    }
}
