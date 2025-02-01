import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

@RunWith(Parameterized.class)
public class LionParamettization {

    @Mock
    Feline feline;
    private String sex;
    private boolean hasMane;

        public LionParamettization(String sex, boolean hasMane){
            this.sex = sex;
            this.hasMane = hasMane;
        }

    @Parameterized.Parameters
    public static Object[][] getLionMane() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }

    @Test
    public void haveMane() throws Exception {
        Lion lion = new Lion(sex, feline);
        Assert.assertEquals(hasMane, lion.doesHaveMane());
    }
}
