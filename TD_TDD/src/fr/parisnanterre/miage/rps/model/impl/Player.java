package fr.parisnanterre.miage.rps.model.impl;

import fr.parisnanterre.miage.rps.model.api.RPSEnum;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static fr.parisnanterre.miage.rps.model.api.RPSEnum.PAPER;
import static fr.parisnanterre.miage.rps.model.api.RPSEnum.ROCK;
import static fr.parisnanterre.miage.rps.model.api.RPSEnum.SCISSORS;

public class Player {

    private String nom;
    private int score;
    private List<RPSEnum> liste;
    private int x;
    private RPSEnum mouv;

    public Player(String nom, List<RPSEnum> liste) {
        this.nom = nom;
        this.liste = liste;
    }

    public Player(String nom) {
        this.nom = nom;
        this.liste = new ArrayList<RPSEnum>();
        Random rand = new Random();
        x=rand.nextInt(3-0);

        if(x==0){
            mouv=ROCK;
        }else if(x==1){
            mouv=PAPER;
        }else{
            mouv=SCISSORS;
        }
        liste.add(mouv);
    }

    public String getNom() {
        return nom;
    }

    public int getScore() {
        return score;
    }


    public void setScore(int score) {
        this.score = score;
    }
}
