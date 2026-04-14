package com.learn.tictactoe.model;

public class Bot extends Player{

    private DifficultyLevel difficultyLevel;


    public Bot(Long id, String name, String symbol,PlayerType type, DifficultyLevel difficultyLevel){
        super(symbol,type,name,id);
        this.difficultyLevel=difficultyLevel;
    }

    public DifficultyLevel getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(DifficultyLevel difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }
}