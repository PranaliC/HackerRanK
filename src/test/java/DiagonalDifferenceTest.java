import com.hackerrank.algorithms.warmup.DiagonalDifference;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class DiagonalDifferenceTest {

    @Test
    public void testDiagonalDifference() {
        List<List<Integer>> input = new ArrayList<List<Integer>>(3);
        List<Integer> firstRow = new ArrayList<Integer>(3) {{
            add(11);
            add(2);
            add(4);
        }};
        List<Integer> secondRow = new ArrayList<Integer>(3) {{
            add(4);
            add(5);
            add(6);
        }};
        List<Integer> thirdRow = new ArrayList<Integer>(3) {{
            add(10);
            add(8);
            add(-12);
        }};
        input.add(firstRow);
        input.add(secondRow);
        input.add(thirdRow);
        assertEquals(15, DiagonalDifference.diagonalDifference(input));
    }
}
