package com.mycompany;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {

        HashMap<Integer, String> map = new HashMap<Integer, String>(2);

        for (int i : new Integer[]{1, 3, 9, 17}) {
            map.put(i, i + "");
        }

        assertTrue( true );
    }
}
