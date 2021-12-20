package company;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DayTowTest {

    @Test
    void testExemple(){
        String path="resources/day2Test.txt";
        List<String> input=TestUtils.readFileIntoList(path);

        int result=DayTow.submarine(input);

        System.out.println(result);
        assertEquals(5,result);



    }

    @Test
    void testExemple2(){
        String path="resources/day1.txt";
        List<String> input=TestUtils.readFileIntoList(path);

        int result=DayTow.submarine(input);

        System.out.println(result);
        //  assertEquals(7,result);



    }

    @Test
    void testMovement(){
        DayTow dayTow =new DayTow();

        String path="resources/moveTest.txt";
        List<String> input=TestUtils.readFileIntoList(path);

        dayTow.move(input);

        int result=dayTow.getResult();
        System.out.println(result);
        assertEquals(150,result);




    }




    @Test
    void testMovement2(){
        DayTow dayTow =new DayTow();

        String path="resources/move.txt";
        List<String> input=TestUtils.readFileIntoList(path);

        dayTow.move(input);

        int result=dayTow.getResult();
        System.out.println(result);





    }
}