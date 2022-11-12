import com.siit.course.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class MyFirstTestNGTest {
    Calculator c;
    int count;

    @BeforeClass
    public void setUp() {
        c = new Calculator();
        System.out.println("SetUp on before class");
    }

    @BeforeTest
    public void setUpTest() {
        count = 0;
        System.out.println("SetUp on before test");
    }

    @BeforeMethod
    public void setUpMethod() {
        System.out.println("SetUp on before method");
    }

    @Test(description = "This is first test", groups = {"Smoke", "Regression"})
    public void test1() {
        System.out.println("I am Test1");
    }

    @Test(enabled = true, groups = "Regression")
    public void test2() {
        System.out.println("I am Test2");
    }

    private void test3() {
        System.out.println("I am Test3");
    }

    @Test
    public void verifyCalculatorTest() {
        System.out.println("Compute assert");
        Assert.assertEquals(5, c.compute(2, 3, "+"), 0);
    }

    @Test(invocationCount = 10)
    public void testMe() {
        count++;
        System.out.println("Current value for count:" + count);
    }

    @Test(groups = {"Smoke","Regression"})
    public void login() {
        System.out.println("Login with user");
        Assert.assertTrue(false);
    }

    @Test(dependsOnMethods = {"aLogout"},
            alwaysRun = true, groups = {"Smoke","Regression"})
    public void closeTabAtEnd() {
        System.out.println("close at end");
    }

    @Test(priority = 1, dependsOnMethods = {"login"}, groups = {"Smoke","Regression"})
    public void aLogout() {
        System.out.println("log out");
    }
}
