package fr.parisnanterre.miage.rps.model.impl;

import fr.parisnanterre.miage.rps.model.api.RPSEnum;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static fr.parisnanterre.miage.rps.model.api.Result.LOST;
import static fr.parisnanterre.miage.rps.model.api.Result.TIE;
import static fr.parisnanterre.miage.rps.model.api.Result.WIN;
import static org.testng.Assert.*;

public class RockPaperScissorsTest {
    //setUp et tearDown permet de tester avant et apres l'execution

    RockPaperScissors game;

    @BeforeMethod
    public void setUp()  throws Exception{
        game=new RockPaperScissors();
    }

    @AfterMethod
    public void tearDown() throws Exception {
        game=null;
    }

    @Test
    public void testPlay() throws Exception {
        assertEquals(game.play(RPSEnum.ROCK,RPSEnum.SCISSORS),WIN);

    }


    //@Parameters({ "paper" ,"rock" })
    //@Test

    @Test ( dataProvider = "winData ")
    public void testWinPlay(String p1, String p2){
        assertEquals(game.play(RPSEnum.valueOf(p1), RPSEnum.valueOf(p2)),WIN);
    }

    //@Parameters({ "paper" ,"paper" })
    //@Test
    @Test ( dataProvider = "TieData ")
    public void testTiePlay(String p1, String p2){
        assertEquals(game.play(RPSEnum.valueOf(p1), RPSEnum.valueOf(p2)),TIE);
    }

    //@Parameters({ "paper" ,"scissors" })
    //@Test
    @Test ( dataProvider = "LostData ")
    public void testLostPlay(String p1, String p2){
        assertEquals(game.play(RPSEnum.valueOf(p1), RPSEnum.valueOf(p2)),LOST);
    }
}