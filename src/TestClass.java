import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class TestClass {

    NaturalDigits naturalDigits = new NaturalDigits();

    @Test
    public void getNaturalDigitsTest(){
        assertEquals(Arrays.asList(1,2,3,5,7),naturalDigits.getNaturalDigits(10));
        assertEquals(Arrays.asList(1,2,3,5,7,11,13),naturalDigits.getNaturalDigits(15));
        assertEquals(Arrays.asList(1,2,3,5,7,11,13,17,19),naturalDigits.getNaturalDigits(20));
    }
}
