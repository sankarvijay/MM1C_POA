package fr.parisnanterre.miage.rps.model.impl;

import fr.parisnanterre.miage.rps.model.api.RPSEnum;
import fr.parisnanterre.miage.rps.model.api.Result;

import static fr.parisnanterre.miage.rps.model.api.Result.LOST;
import static fr.parisnanterre.miage.rps.model.api.Result.TIE;
import static fr.parisnanterre.miage.rps.model.api.Result.WIN;

public class RockPaperScissors {

    public RockPaperScissors() {

    }

    public Result play(RPSEnum p1, RPSEnum p2){
        if(p1==p2){
            return TIE;
        }
        if(p1.equals(RPSEnum.PAPER) && p2.equals(RPSEnum.ROCK)){
            return WIN;
        }
        else if(p1.equals(RPSEnum.ROCK) && p2.equals(RPSEnum.SCISSORS)){
            return WIN;
        }
        else if (p1.equals(RPSEnum.SCISSORS)&& p2.equals(RPSEnum.PAPER)){
            return WIN;
        }
        else {
            return LOST;
        }

    }



}
