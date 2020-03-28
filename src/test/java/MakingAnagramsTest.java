import com.hackerrank.algorithms.warmup.MakingAnagrams;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MakingAnagramsTest {

    @Test
    public void testMakingAnagrams(){
        assertEquals(4, MakingAnagrams.makingAnagrams("abc","cde"));
        assertEquals(19, MakingAnagrams.makingAnagrams("absdjkvuahdakejfnfauhdsaavasdlkj","djfladfhiawasdkjvalskufhafablsdkashlahdfa"));


    }
}
