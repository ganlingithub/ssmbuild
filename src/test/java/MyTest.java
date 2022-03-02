import com.ganlin.beans.User;
import com.ganlin.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userMapper = (UserService)context.getBean("userServiceImpl");
        for(User user:userMapper.getUserList()){
            System.out.println(user);
        }

    }
}
