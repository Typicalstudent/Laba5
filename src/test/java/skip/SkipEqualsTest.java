package skip;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SkipEqualsTest {


    @Test
    public void skipRecurs() {
        ArrayList<Object> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("3");

        ArrayList<Object> test_list = new ArrayList<>();
        test_list.add("1");
        test_list.add("2");
        test_list.add("4");
        test_list.add("3");
        SkipEquals skip = new SkipEquals(list);
        skip.skipRecurs(list);
        Assert.assertEquals(test_list, list);
    }

    @Test
    public void skipNoRecurs() {
        ArrayList<Object> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("3");

        ArrayList<Object> test_list = new ArrayList<>();
        test_list.add("1");
        test_list.add("2");
        test_list.add("4");
        test_list.add("3");
        SkipEquals skip = new SkipEquals(list);
        skip.skipNoRecurs(list);
        Assert.assertEquals(test_list, list);
    }
}