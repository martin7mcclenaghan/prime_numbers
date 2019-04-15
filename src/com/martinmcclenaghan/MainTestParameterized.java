package com.martinmcclenaghan;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)

public class MainTestParameterized {

    // Will use assertEquals as if continue to use style of assert true / false will need to write
    // two parameterized test classes which is needless duplication

    // set up member variables for parameterized test class
    private int number;
    private boolean response;

    // simple constructor for parameterized test class
    public MainTestParameterized (int number, boolean response){
        this.number = number;
        this.response = response;
    }


    // use collection for data that will be used in test
    @Parameterized.Parameters
    public static Collection<Object> testConditions () {
        return Arrays.asList(new Object [][]{

                {6247, true},
                {5563, true},
                {7489, true},
                {5687, false},
                {2523, false},
                {3641, false},


        });


    }

    @org.junit.Test
    public void isPrimeEqual () {
        assertEquals(Main.isPrime(number),response);

    }


}
