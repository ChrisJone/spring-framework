import com.runcode.spring.aop.proxyfactorybean.TestAdvisor;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestXmlConfig {

    public static void main(String[] args) {
        FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("classpath:spring-aop.xml");

        ctx.getBean("testAop");
    }
}
