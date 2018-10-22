package fr.parisnanterre.miage.rps.model.impl;

import fr.parisnanterre.miage.rps.model.api.RPSEnum;
import fr.parisnanterre.miage.rps.model.api.Result;

public class RockPaperScissors {

    public RockPaperScissors() {

    }

    public Result play(RPSEnum p1, RPSEnum p2){

        if(p1.equals(RPSEnum.ROCK) && p2.equals(RPSEnum.SCISSORS)){
            return Result.WIN;
        }else if(p1.equals(RPSEnum.ROCK) && p2.equals(RPSEnum.ROCK)){
            return Result.TIE;
        }else if(p1.equals(RPSEnum.SCISSORS) && p2.equals(RPSEnum.ROCK)){
            return Result.LOST;
        }

        return Result.WIN;

    }


}
