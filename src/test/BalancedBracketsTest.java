package test;

import org.junit.Test;
import main.BalancedBrackets;
import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    //Test 1
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
    //Test 2
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    //Test 3
    @Test
    public void reverseBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }
    //Test 4
    @Test
    public void unevenBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Launch[Code]"));
    }
    //Test 5
    @Test
    public void multipleSquareBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launch][Code]"));
    }
    //Test 6
    @Test
    public void balancedBracketAtStartReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }
    //Test 7
    @Test
    public void onlyOpenBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }
    //Test 8
    @Test
    public void onlyCloseBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("LaunchCode]"));
    }
    //Test 9
    @Test
    public void unorderedBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
    //Test 10
    @Test
    public void bracketsInsideBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launch[Code]]"));
    }
    //Test 11
    @Test
    public void noBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }
    //Test 12
    @Test
    public void balancedBracketInBetweenReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

}
