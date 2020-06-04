package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void Check_Bai1() {
        int[] array = {1, 2, 1, 3, 1, 4, 4, 5, 1, 8, 9, 2, 5};

        ArrayList<Integer> expected = new ArrayList<Integer>();
        expected.add(3);
        expected.add(8);
        expected.add(9);

        ArrayList<Integer> actual = App.Bai1(array);

        Boolean check = false;
        if (expected.size() == actual.size() && actual.containsAll(expected)) {
            check = true;
        }
    }
    @Test
    public void Check_Bai2()
    {
        int[] input = {1,2,1,2,1,2,4,5,3,2,1,0,5,3,7,8,9,19,0};

        int expected = 5;
        int actual = App.Bai2(input);
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void Check_Bai3()
    {
        int input = 10;

        int[] expected = {2, 3, 5, 7, 11, 13, 17, 19,23,29};
        int[] actual = App.Bai3(input);
        Assert.assertArrayEquals(expected,actual);

    }

    @Test
    public void Check_Bai4()
    {
        int input =32389056;

        int expected = 36;
        int actual = App.Bai4(input);
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void Check_Bai6()
    {
        int input =89;

        ArrayList<Integer> expected = new ArrayList<Integer>();
        expected.add(2);
        expected.add(3);
        expected.add(5);
        expected.add(13);

        ArrayList<Integer> actual = App.Bai6(input);

        Boolean check = false;
        if(expected.size() == actual.size() && actual.containsAll(expected)){
            check =true;
        }

        Assert.assertTrue(check);

    }


}
