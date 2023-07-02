import com.codeclan.example.Instruments.*;
import com.codeclan.example.Interfaces.ISell;
import com.codeclan.example.OtherSellables.Amplifier;
import com.codeclan.example.OtherSellables.DrumSticks;
import com.codeclan.example.OtherSellables.GuitarPic;
import com.codeclan.example.Shop;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class ShopTest {
    private Guitar guitar;
    private Amplifier amplifier;
    private GuitarPic guitarPic;
    private DrumKit drumKit;
    private DrumSticks drumSticks;
    private Piano piano;
    private Trumpet trumpet;
    private Shop shop;
    private ArrayList<ISell> stock;

    @Before
    public void before() {
        stock = new ArrayList<ISell>();
        trumpet = new Trumpet("Bach", "Gold", 5, 50.00, 110.00);
        stock.add(trumpet);
        guitar = new Guitar("Fender", "Red", GuitarType.ELECTRIC, 6, 90.00, 150.00);
        stock.add(guitar);
        amplifier = new Amplifier();
        stock.add(amplifier);
        guitarPic = new GuitarPic();
        stock.add(guitarPic);
        drumKit = new DrumKit("Ludwig", "Black", 5, 200.00, 550.00);
        stock.add(drumKit);
        drumSticks = new DrumSticks();
        stock.add(drumSticks);
        piano = new Piano("Yamaha", "Blue", 20, 190.00, 310.00);
        shop = new Shop("Ray's Music Exchange", stock);
    }

    @Test
    public void canAddToStock() {
        shop.addToStock(piano);
        assertEquals(7, shop.getStock().size());
    }

    @Test
    public void canRemoveFromStock() {
        shop.removeFromStock(guitar);
        assertEquals(5, shop.getStock().size());
    }

    @Test
    public void canCalculateTotalMarkup() {
        assertEquals(521.3, shop.calculateTotalMarkup());
    }
}
