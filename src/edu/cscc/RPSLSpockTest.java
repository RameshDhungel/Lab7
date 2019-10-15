package edu.cscc;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RPSLSpockTest {

    @Test
    public void isValidPick() {
        Assert.assertTrue(RPSLSpock.isValidPick("rock"));
        Assert.assertTrue(RPSLSpock.isValidPick("paper"));
        Assert.assertTrue(RPSLSpock.isValidPick("scissors"));
        Assert.assertTrue(RPSLSpock.isValidPick("lizard"));
        Assert.assertTrue(RPSLSpock.isValidPick("spock"));
        Assert.assertFalse(RPSLSpock.isValidPick("hand"));
    }

    @Test
    public void generatePick() {
        String generatePick;
        for (int i = 0; i < 1000000; i++){
            generatePick = RPSLSpock.generatePick();
            Assert.assertNotNull(generatePick);
            Assert.assertTrue(RPSLSpock.isValidPick(generatePick));
        }
    }

    @Test
    public void isComputerWin() {
        Assert.assertTrue(RPSLSpock.isComputerWin("scissors","paper"));
        Assert.assertTrue(RPSLSpock.isComputerWin("paper","rock"));
        Assert.assertTrue(RPSLSpock.isComputerWin("rock","lizard"));
        Assert.assertTrue(RPSLSpock.isComputerWin("lizard","spock"));
        Assert.assertTrue(RPSLSpock.isComputerWin("scissors","lizard"));
        Assert.assertTrue(RPSLSpock.isComputerWin("lizard","paper"));
        Assert.assertTrue(RPSLSpock.isComputerWin("paper","spock"));
        Assert.assertTrue(RPSLSpock.isComputerWin("spock","rock"));
        Assert.assertTrue(RPSLSpock.isComputerWin("rock","scissors"));
        Assert.assertFalse(RPSLSpock.isComputerWin("paper","scissors"));

    }
}