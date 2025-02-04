import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;


public class FelineTest {

    @Test
    public void eatMeatTest() throws Exception {
        Feline feline = new Feline();
        List<String> predatorFood = List.of("Животные", "Птицы", "Рыба");
        List<String> actualpredatorFood = feline.eatMeat();
        Assert.assertEquals(predatorFood, actualpredatorFood);
    }

    @Test
    public void getFamilyTest(){
        Feline feline = new Feline();
        String catFamily = feline.getFamily();
        Assert.assertEquals("Кошачьи", catFamily);
    }

    @Test
    public void getKittensTest(){
        Feline feline = new Feline();
        int kittensCount = feline.getKittens();
        Assert.assertEquals(1, kittensCount);
    }

    @Test
    public void getKittensMoreThenOneTest(){
        Feline feline = new Feline();
        int kittensCount = 2;
        int actualkittensCount = feline.getKittens(2);
        Assert.assertEquals(kittensCount, actualkittensCount);
    }
}
