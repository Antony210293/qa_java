import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void getKittensTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        int kittensCount = 2;
        Mockito.when(feline.getKittens()).thenReturn(2);
        int actualKittensCount = lion.getKittens();
        assertEquals(kittensCount, actualKittensCount);
    }

    @Test
    public void getFoodTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        List<String> lionFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actualLionFood = lion.getFood();
        assertEquals(lionFood, actualLionFood);
    }

    @Test
    public void doesHaveManeTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        boolean haveMane = true;
        boolean actualHaveMane = lion.doesHaveMane();
        assertEquals(actualHaveMane, haveMane);
    }

    @Test
    public void doesNotHaveManeTest() throws Exception {
        Lion lion = new Lion("Самка", feline);
        boolean haveMane = false;
        boolean actualHaveMane = lion.doesHaveMane();
        assertEquals(actualHaveMane, haveMane);
    }

    @Test
    public void doesHaveManeThrowsExceptionTest() {
        Exception exception = assertThrows(Exception.class, () -> {
            new Lion("Собака", feline);
        });
        assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
    }
}
