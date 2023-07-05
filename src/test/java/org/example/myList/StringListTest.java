package org.example.myList;

import junit.framework.TestCase;
import org.junit.Assert;

public class StringListTest extends TestCase {
    public void testAdd() {

        String[] testData = {"aaa", "bbb", "ccc"};
        MyList expected = new StringList();
        expected.makeStringListForTests(testData, expected);

        MyList actual = new StringList();
        actual.add("aaa");
        actual.add("bbb");
        actual.add("ccc");

        Assert.assertEquals(expected, actual);


    }

    public void testTestAdd() {
        String[] testData = {"aaa", "ddd", "bbb", "ccc"};
        MyList expected = new StringList();
        expected.makeStringListForTests(testData, expected);

        MyList actual = new StringList();
        actual.add("aaa");
        actual.add("bbb");
        actual.add("ccc");
        actual.add(1, "ddd");

        Assert.assertEquals(expected, actual);
    }

    public void testSet() {
        String[] testData = {"aaa", "ddd", "ccc"};
        MyList expected = new StringList();
        expected.makeStringListForTests(testData, expected);

        MyList actual = new StringList();
        actual.add("aaa");
        actual.add("bbb");
        actual.add("ccc");
        actual.set(1, "ddd");

        Assert.assertEquals(expected, actual);
    }

    public void testRemove() {
        String[] testData = {"aaa", "ccc"};
        MyList expected = new StringList();
        expected.makeStringListForTests(testData, expected);

        MyList actual = new StringList();
        actual.add("aaa");
        actual.add("bbb");
        actual.add("ccc");
        actual.remove("bbb");

        Assert.assertEquals(expected, actual);
    }

    public void testTestRemove() {
        String[] testData = {"aaa", "ccc"};
        MyList expected = new StringList();
        expected.makeStringListForTests(testData, expected);

        MyList actual = new StringList();
        actual.add("aaa");
        actual.add("bbb");
        actual.add("ccc");
        actual.remove(1);

        Assert.assertEquals(expected, actual);
    }

    public void testContains() {
        String[] testData = {"aaa", "bbb"};
        MyList expected = new StringList();
        expected.makeStringListForTests(testData, expected);

        MyList actual = new StringList();
        actual.add("aaa");
        actual.add("bbb");

        Boolean expectedBool = expected.contains("ddd");
        Boolean actualBool = expected.contains("ddd");

        Assert.assertEquals(expectedBool, actualBool);
    }

    public void testIndexOf() {
        String[] testData = {"aaa", "bbb"};
        MyList expected = new StringList();
        expected.makeStringListForTests(testData, expected);

        MyList actual = new StringList();
        actual.add("aaa");
        actual.add("bbb");

        Assert.assertEquals(expected.indexOf("aaa"), expected.indexOf("aaa"));
    }

    public void testLastIndexOf() {
        String[] testData = {"aaa", "bbb"};
        MyList expected = new StringList();
        expected.makeStringListForTests(testData, expected);

        MyList actual = new StringList();
        actual.add("aaa");
        actual.add("bbb");

        Assert.assertEquals(expected.lastIndexOf("aaa"), expected.lastIndexOf("aaa"));
    }

    public void testGet() {
        String[] testData = {"aaa", "bbb"};
        MyList expected = new StringList();
        expected.makeStringListForTests(testData, expected);

        MyList actual = new StringList();
        actual.add("aaa");
        actual.add("bbb");

        Assert.assertEquals(expected.get(1), expected.get(1));
    }

    public void testSize() {
        String[] testData = {"aaa", "bbb"};
        MyList expected = new StringList();
        expected.makeStringListForTests(testData, expected);

        MyList actual = new StringList();
        actual.add("aaa");
        actual.add("bbb");

        Assert.assertEquals(expected.size(), actual.size());
    }
}