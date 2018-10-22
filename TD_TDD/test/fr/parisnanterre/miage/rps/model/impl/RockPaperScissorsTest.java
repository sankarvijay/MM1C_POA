package fr.parisnanterre.miage.rps.model.impl;

import fr.parisnanterre.miage.rps.model.api.RPSEnum;
import org.testng.annotations.*;

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

    @DataProvider(name="winData")
    public Object[][] createWinData() {

        return new Object[][]{{RPSEnum.PAPER, RPSEnum.ROCK},
                {RPSEnum.ROCK, RPSEnum.SCISSORS},{
            RPSEnum.SCISSORS,RPSEnum.PAPER
        }};
    }
    @Test ( dataProvider = "winData")
    public void testWinPlay(RPSEnum p1, RPSEnum p2){
        assertEquals(game.play(p1,p2),WIN);
    }

    //@Parameters({ "paper" ,"paper" })
    //@Test
    @DataProvider(name="tieData")
    public Object[][] createTieData() {

        return new Object[][]{{RPSEnum.ROCK, RPSEnum.ROCK},{RPSEnum.SCISSORS,RPSEnum.SCISSORS},{RPSEnum.PAPER,RPSEnum.PAPER}};
    }
    @Test ( dataProvider = "tieData")
    public void testTiePlay(RPSEnum p1, RPSEnum p2){
        assertEquals(game.play(p1,p2),TIE);
    }

    //@Parameters({ "paper" ,"scissors" })
    //@Test

    @DataProvider(name="lostData")
    public Object[][] createLostData() {
        return new Object[][]{{RPSEnum.SCISSORS, RPSEnum.ROCK},{RPSEnum.ROCK,RPSEnum.PAPER},{RPSEnum.PAPER,RPSEnum.SCISSORS}};
    }
    @Test ( dataProvider = "lostData")
    public void testLostPlay(RPSEnum p1, RPSEnum p2){
        assertEquals(game.play(p1, p2),LOST);
    }
}