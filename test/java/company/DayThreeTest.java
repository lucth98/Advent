package company;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DayThreeTest {
    public static int submarine(List<String> input){
        int result=0;
        for (int i=1;i<input.size()-2;i++){
            int currentDep=sumOfTheNextThreeVallues(input,i);
            int previusDep=sumOfTheNextThreeVallues(input,i-1);

            if(currentDep>previusDep){
                result++;
            }

        }
        return result;
    }

    private static int sumOfTheNextThreeVallues(List<String> input,int index){
        return Integer.parseInt(input.get(index))+Integer.parseInt(input.get(index+1))+Integer.parseInt(input.get(index+2));



    }
}