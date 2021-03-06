package Task09;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
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

        //Выполнение задания 2
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Iva");
        list2.add("Iva");
        list2.add("Iva");
        list2.add("Ivan");
        list2.add("Ivan");
        list2.add("Ivan");
        list2.add("An");


        System.out.println(exercise2noSet(list2));
        System.out.println(exercise2Set(list2));
    }

    static ArrayList<String> exercise1(ArrayList<String> list) {
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

    static ArrayList<String> exercise2noSet(ArrayList<String> list) {
        ArrayList<String> newList = new ArrayList<>();

        for (String str : list) {
            if (!newList.contains(str)) {
                newList.add(str);
            }
        }
        return newList;
    }

    static Set<String> exercise2Set(ArrayList<String> list) {
        Set<String> set = new HashSet<>(list);

        return set;
    }


}
