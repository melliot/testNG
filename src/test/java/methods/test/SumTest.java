package methods.test;

import com.levelup.Sum;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class SumTest {

    @DataProvider(name = "dataSum")
    public Object[][] db(){
        return new Object[][]{
            {4, 3, 7},
            {11, 5, 16},
            {55, -88, -33},
            {-99999999, 99999999, 0},
        };
    }

    @Test(dataProvider = "dataSum")
    public void testSum(int num1, int num2, int res) {
        assertEquals(new Sum().sumer(num1, num2), res);
    }

    @DataProvider(name = "dataMultiplay")
    public Object[][] data(){
        return new Object[][]{
                {1, 2, 4, 6},
                {5, 4, 5, 45},
                {5, 4, 5, 45}
        };
    }

    @Test(dataProvider = "dataMultiplay",  dependsOnMethods = "testSum", alwaysRun = true)
    public void testMultipl(int m, int sum1, int sum2, int result){
        assertEquals(new Sum().multiplication(m, sum1, sum2), result);
    }

}
