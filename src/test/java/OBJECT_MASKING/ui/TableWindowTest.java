package OBJECT_MASKING.ui;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;

public class TableWindowTest{
    ArrayList<Double> array = new ArrayList<>();

    @Test
    public void maximizeTest(){
        array.add(1.0);
        array.add(2.0);
        ArrayList<Double> arrayTest = new ArrayList<>();
        arrayTest.add(1.0);
        arrayTest.add(-1/2.0);
        System.out.println(arrayTest);
        System.out.println(TableWindow.maximize(array, 1));
    }


}