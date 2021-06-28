package Task09;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Solodovnykov M.S.
 * @version 1.0
 */

public class Main {

    public static void main(String[] args) {
        //Выполнение задания 1
        ArrayList<String> list = new ArrayList<>();
        list.add("Iva");
        list.add("L2");
        list.add("Oladh");
        list.add("Ivan");
        list.add("An");

        System.out.println(exercise1(list));

    }

    static ArrayList<String> exercise1 (ArrayList<String> list){
        ArrayList<String> newList = new ArrayList<>();

        for (String str : list) {
            Pattern p = Pattern.compile("\\d+");
            Matcher m = p.matcher(str);
            if (str.length() < 4 && !m.find()) {
                newList.add(str);
            }
        }
        return newList;
    }



}
