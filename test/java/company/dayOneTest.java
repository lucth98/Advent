package company;

import org.junit.jupiter.api.Test;

import java.lang.annotation.Target;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class dayOneTest {

    @Test
    void testExemple(){
        String path="resources/day2Test.txt";
        List<String> input=TestUtils.readFileIntoList(path);

        int result=DayOne.submarine(input);

        System.out.println(result);
        assertEquals(7,result);



    }

    @Test
    void testExemple2(){
        String path="resources/day1.txt";
        List<String> input=TestUtils.readFileIntoList(path);

        int result=DayOne.submarine(input);

        System.out.println(result);
      //  assertEquals(7,result);



    }


}