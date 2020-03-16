import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterbottle;

    @Before
    public void before() {
        waterbottle = new WaterBottle(100);
    }


    @Test
    public void hasVolume() {
        assertEquals(100, waterbottle.getVolume());
    }

    @Test
    public void drinkTaken() {
        assertEquals( 90, waterbottle.takeDrink());
    }

    @Test
    public void drankAll() {
        assertEquals( 0, waterbottle.drinkAll());
    }

    @Test
    public void bottleFilled(){
        assertEquals( 100, waterbottle.fill());
    }
}
