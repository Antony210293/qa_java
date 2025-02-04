import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline;

    @Test
    public void getSoundTest(){
        Cat cat = new Cat(feline);
        String sound = cat.getSound();
        Assert.assertEquals("Мяу", sound);
    }

    @Test
    public void getFoodTest() throws Exception {
        Cat cat = new Cat(feline);
        List<String> catFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(catFood);
        List<String> catFoodActual = cat.getFood();
        Assert.assertEquals(catFood, catFoodActual);
    }
}
