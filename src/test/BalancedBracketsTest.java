package test;

import org.junit.Test;
import main.BalancedBrackets;
import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
   @Test
    public void emptyTest() {
       assertEquals(true,true);
    }


    @Test
    public void onlyBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void twoBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][]"));
    }

    @Test
    public void bracketsWithinBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }


    @Test
    public void bracketsOfBracketWithinBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]][]"));
    }

    @Test
    public void tripleBracketWithinBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[]]]"));
    }

    @Test
    public void twotripleBracketWithinBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[][]]]"));
    }

    @Test
    public void emptyStringReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void bracketsWithPizzaStringReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[pizza]"));
    }

    @Test
    public void onlyOpenBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void onlyCloseBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void mismatchedBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void unEqualBracketsWithPizzaReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[pizza[]"));
    }

}


















