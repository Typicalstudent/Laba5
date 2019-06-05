package skip;

import java.util.*;

public class SkipEquals {
    private static int index;
    private static int pos;
    private static Object tempObject;

    public SkipEquals(ArrayList<Object> list) {
        index = list.size();
        index--;
        pos = 0;
        tempObject = new Object();
        tempObject = list.get(index);
    }

    public void skipRecurs(ArrayList<Object> list) {
        Operationable operation;
        operation = (x, y) -> {
            if (x.remove(y))
                return true;
            else
                return false;
        };

        if (index > -1) {
            if (operation.calculate(list, tempObject)) {
                index--;
                skipRecurs(list);
            } else {
                list.add(list.size() - pos, tempObject);
                pos++;
                if (index > -1)
                    tempObject = list.get(index);
                skipRecurs(list);
            }
        } else {
            list.add(list.size() - pos, tempObject);
        }

    }

    interface Operationable {
        boolean calculate(ArrayList<Object> list, Object objToRemove);
    }

    public void skipNoRecurs(ArrayList<Object> list) {
        skipData(list);
        Operationable operation;
        operation = (x, y) -> {
            if (x.remove(y))
                return true;
            else
                return false;
        };
        while(index >-1) {
            while(operation.calculate(list, tempObject)) {
                index--;
            }
            list.add(list.size()-pos, tempObject);
            pos++;
            if (index > -1)
                tempObject = list.get(index);
        }
    }

    void skipData(ArrayList<Object> list) {
        index = list.size();
        index--;
        pos = 0;
        tempObject = list.get(index);
    }

}
