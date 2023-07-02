import com.codeclan.example.Instruments.Guitar;
import com.codeclan.example.Instruments.GuitarType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {
    private Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar("Fender", "Red", GuitarType.ELECTRIC, 6, 90.00, 150.00);
    }

    @Test
    public void canGetBrand() {
        assertEquals("Fender", guitar.getBrand());
    }

    @Test
    public void canGetColour() {
        assertEquals("Red", guitar.getColour());
    }

    @Test
    public void canGetGuitarType() {
        assertEquals(GuitarType.ELECTRIC, guitar.getGuitarType());
    }

    @Test
    public void canGetNumOfStrings() {
        assertEquals(6, guitar.getNumOfStrings());
    }

    @Test
    public void canGetBuyPrice() {
        assertEquals(90.00, guitar.getBuyPrice(), 0);
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(150.00, guitar.getSellPrice(), 0);
    }

}
