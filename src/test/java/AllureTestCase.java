import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AllureTestCase {
    @BeforeClass
    public static void befor(){
        System.out.println("this is test3 before");
    }
    @Test
    public void fun(){
        int value=10/0;
        System.out.println("this is test3");
    }
    @AfterClass
    public static void after(){
        System.out.println("this is test3 after");
    }
}
