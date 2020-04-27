package algorithmTest;

import algorithm.ExercitiiAlgoritm;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//import static org.junit.jupiter.api.Assertions.*; //pentru a incarca toate Assertions
//import static org.junit.jupiter.api.Assertions.assertFalse;
//import static org.junit.jupiter.api.Assertions.assertTrue;

public class ExercitiiAlgoritmTest {
    //initializam variabila
    private static ExercitiiAlgoritm ex;
    //in versiunea noua (5), @BeforeClass = @BeforeAll si @Before = @BeforeEach, la fel si cu @After
    @BeforeAll
    public static void setup(){
        ex=new ExercitiiAlgoritm();
    }

    @Test
    public void testLastDigit(){
        assertTrue(ex.lastDigit(100,0));
        assertFalse(ex.lastDigit(2,3));
        assertEquals(ex.lastDigit(2,2), true);
    }
    @Test
    public void testEven(){
        assertTrue(ex.even(4));
        assertFalse(ex.even(3));
    }
    @Test
    public void testEqualsFirstLast(){   //ex 87
        assertTrue(ex.equalsFirstLast(new int[]{1}));
        assertTrue(ex.equalsFirstLast(new int[]{1,5,6,2,1}));
        assertFalse(ex.equalsFirstLast(new int[]{}));
        assertFalse(ex.equalsFirstLast(new int[]{1,2}));
    }
    @Test
    public void testRotateArray(){ //ex 88
        assertArrayEquals(ex.rotateArray(new int[]{1,2,3}), new int[]{2,3,1});

    }

    @Test
    public void testRotateBiggerArray(){ //ex 88 modificat
        assertArrayEquals(ex.rotateBiggerArray(new int[]{1,2,3,5,6,7,8}), new int[]{2,3,5,6,7,8,1});
        assertArrayEquals(ex.rotateBiggerArray(new int[]{1,2,3}), new int[]{2,3,1});
    }

    @Test
    public void testSameElements(){ //ex 89
        assertTrue(ex.sameElements(new int[]{1,2,3}, new int[]{1,2}));
        assertTrue(ex.sameElements(new int[]{2,3,4}, new int[]{4}));
    }

    @Test
    public void testSumOfArrayElem(){ //ex 90
        assertEquals(ex.sumOfArrayElem(new int[]{0,1,2,3}), 6);
    }

    @Test
    public void testReverseArray(){ //ex 91
        assertArrayEquals(ex.reverseArray(new int[]{1,2,3,4,5,6}), new int[]{6,5,4,3,2,1});
    }

    @AfterAll
    public static void clear(){

    }
}
