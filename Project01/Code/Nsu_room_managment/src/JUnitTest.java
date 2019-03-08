import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;



public class JUnitTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	
		
	}

	@After
	public void tearDown() throws Exception {
	}
// test caser
	//1.(username=null and password=admin)
	//2.(username=admin and password=null)
	//3.(username=null and password=null)
	//4.(username=admin and password=wrong)
	//5.(username=wrong and password=admin)
	//6.(username=wrong and password=wrong)
	//7.(username=null and password=wrong)
	//8.(username=wrong and password=null)
	
	@Test
	public void test() {
		
		LoginBox log = new LoginBox();
		if(log.userField.equals(null) )
		{
			if (log.equals(log.passField.equals("admin"))) {
				System.out.println("Test1 executed");
			}
		}
		
		
		if(log.userField.equals("admin") )
		{
			if (log.equals(log.passField.equals(null))) {
				System.out.println("Test2 executed");
			}
		}
		
		
		if(log.userField.equals(null) )
		{
			if (log.equals(log.passField.equals(null))) {
				System.out.println("Test3 executed");
			}
		}
		
		
	}

}
