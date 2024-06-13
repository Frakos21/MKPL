
import org.example.Mesin_Hitung;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MesinHitungTest {

    @Test
    public void testPenjumlahan() {
        assertEquals(5.0, Mesin_Hitung.penjumlahan(2.0, 3.0), 0.001);
        assertEquals(-1.0, Mesin_Hitung.penjumlahan(-2.0, 1.0), 0.001);
    }

    @Test
    public void testPengurangan() {
        assertEquals(1.0, Mesin_Hitung.pengurangan(3.0, 2.0), 0.001);
        assertEquals(-3.0, Mesin_Hitung.pengurangan(-1.0, 2.0), 0.001);
    }

    @Test
    public void testPerkalian() {
        assertEquals(6.0, Mesin_Hitung.perkalian(2.0, 3.0), 0.001);
        assertEquals(-4.0, Mesin_Hitung.perkalian(-2.0, 2.0), 0.001);
    }

    @Test
    public void testPembagian() {
        assertEquals(2.0, Mesin_Hitung.pembagian(6.0, 3.0), 0.001);
        assertEquals(-2.5, Mesin_Hitung.pembagian(-5.0, 2.0), 0.001);
    }

    @Test(expected = ArithmeticException.class)
    public void testPembagianDenganNol() {
        Mesin_Hitung.pembagian(1.0, 0.0);
    }
}
