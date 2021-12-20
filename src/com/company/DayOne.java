package company;

import java.util.List;

public class DayOne {
    public static int submarine(List<String> input){
        int result=0;
        for (int i=1;i<input.size();i++){
            int currentDep=Integer.parseInt(input.get(i));
            int previousDep=Integer.parseInt(input.get(i-1));

            if(currentDep>previousDep){
                result++;
            }

        }
        return result;
    }




}
