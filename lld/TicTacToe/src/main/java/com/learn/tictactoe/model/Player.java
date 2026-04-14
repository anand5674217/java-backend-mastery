package com.learn.tictactoe.model;

import java.util.Scanner;

public class Player{
    private String symbol;
    private String name;
    private Long id;
    private PlayerType playerType;
    private Scanner scanner;

    public Player(String symbol, PlayerType playerType, String name, Long id) {
        this.symbol = symbol;
        this.playerType = playerType;
        this.name = name;
        this.id = id;
        this.scanner= new Scanner(System.in);
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }

    public Move getInputAndMakeMove(Board board){
        return null;
    }
}