package company;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DayThreeTest {
    @Test
    void testExemple(){
        String path="resources/day3Test.txt";
        List<String> input=TestUtils.readFileIntoList(path);

        int result=DayThree.getPower(input);

        System.out.println(result);
        assertEquals(198,result);



    }

    @Test
    void testExemple2(){
        String path="resources/day1.txt";
        List<String> input=TestUtils.readFileIntoList(path);

        int result=DayTow.submarine(input);

        System.out.println(result);
        //  assertEquals(7,result);



    }
}