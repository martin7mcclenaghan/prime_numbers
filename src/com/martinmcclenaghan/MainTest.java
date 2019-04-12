package com.martinmcclenaghan;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void isPrimeTrue() {

        //Check method returns true properly when the number is in fact a prime

        assertTrue("Number is not a prime number",Main.isPrime(6247));
        assertTrue("Number is not a prime number",Main.isPrime(5563));
        assertTrue("Number is not a prime number",Main.isPrime(7489));

    }

}