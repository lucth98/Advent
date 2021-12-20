package company;

import java.util.List;

public class DayThree {
    public static int getPower(List<String> intput){


        return getGamma(intput)*getEpsilon(intput);
    }

    private static int getGamma(List<String> intput){
        int result=0;
        String value="";
        for (int i = 0; i <intput.size() ; i++) {
            String row=intput.get(i);
           value+=getMostNumber(row);
        }

        result=Integer.parseInt(value,2);
        return result;
    }

    private static char getMostNumber(String string){
      int countOf1= getCharCount(string,'1');
        int countOf0= getCharCount(string,'0');
      return (countOf0<countOf1)?'1':'0';

    }
    private static char getLeastNumber(String string){
        int countOf1= getCharCount(string,'1');
        int countOf0= getCharCount(string,'0');
        return (countOf0>countOf1)?'1':'0';

    }
    private static int getCharCount(String string, char c){
        int result=0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i)==c){
                result++;
            }
        }
        return result;
    }

    private static int getEpsilon(List<String> intput){
        int result=0;
        String value="";
        for (int i = 0; i <intput.size() ; i++) {
            String row=intput.get(i);
            value+=getLeastNumber(row);
        }

        result=Integer.parseInt(value,2);
        return result;
    }

}
