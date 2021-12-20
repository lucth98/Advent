package company;

import java.util.List;

public class DayTow {

    public static int submarine(List<String> input) {
        int result = 0;
        for (int i = 1; i < input.size() - 2; i++) {
            int currentDep = sumOfTheNextThreeVallues(input, i);
            int previusDep = sumOfTheNextThreeVallues(input, i - 1);

            if (currentDep > previusDep) {
                result++;
            }

        }
        return result;
    }

    private static int sumOfTheNextThreeVallues(List<String> input, int index) {
        return Integer.parseInt(input.get(index)) + Integer.parseInt(input.get(index + 1)) + Integer.parseInt(input.get(index + 2));


    }

    private int depth = 0;
    private int position = 0;

    public void move(List<String> movment) {
        for (String string : movment) {
            getCommand(string);
        }
    }
    public int getResult(){
        return  depth*position;
    }

    private void getCommand(String string) {
        int movment = 0;
        char firstCharInString = string.charAt(0);
        for (int i = 0; i < string.length(); i++) {
            char number = string.charAt(i);
            if (number >= '0' && number <= '9') {

                movment = Character.getNumericValue(number);
            }
        }

        switch (firstCharInString) {
            case 'f':
                position += movment;
                break;

            case 'd':
                depth += movment;
                break;

            case 'u':
                depth -= movment;
                break;
        }

    }


}
