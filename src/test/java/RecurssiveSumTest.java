import com.hackerrank.algorithms.warmup.RecursiveSum;
import org.junit.Test;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class RecurssiveSumTest {

    @Test
    public void testRecurssiveSum(){
        assertEquals(2, RecursiveSum.superDigit("9875",1));
        assertEquals(8, RecursiveSum.superDigit("100000000000000"+"0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001",5440000));
        assertEquals(3, RecursiveSum.superDigit("3",1));
        assertEquals(3, RecursiveSum.superDigit("148",3));
       assertEquals(5, RecursiveSum.superDigit("3546630947312051453014172159647935984478824945973141333062252613718025688716704470547449723886626736", 100000));
    }

    @Test
    public void testSum() throws IOException {
        FileReader fr =
                new FileReader("test.txt");
        Scanner sc = new Scanner(fr);
       assertEquals(4, RecursiveSum.superDigit(new String(sc.nextLine()),100000));
    }

}
