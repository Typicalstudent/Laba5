package skip;


import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Skip {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>(10);
        ArrayList<Object> list2 = new ArrayList<>();

        Scanner in = new Scanner(System.in);
        System.out.println("Enter strings");
        try {
            for (int i = 0; i < 10; i++) {
                String buff = in.next();
                list.add(buff);
            }
        } catch (Exception ex) {
            System.out.println("Incorrect input");
        }

        for(Object i:list) {
            list2.add(i);
        }
        SkipEquals skip = new SkipEquals(list);
        skip.skipRecurs(list);

        System.out.println("Result after recursive skip: ");
        for (Object i : list) {
            System.out.print(i.toString() + " ");
        }
        System.out.println();

        skip.skipNoRecurs(list2);
        System.out.println("Result after non recursive skip: ");
        for (Object i : list2) {
            System.out.print(i.toString() + " ");
        }
    }

}
