package com.learn.tictactoe.model;

import com.learn.tictactoe.strategy.ColumnWinningStrategyImpl;
import com.learn.tictactoe.strategy.DiagonalWinningStrategyImpl;
import com.learn.tictactoe.strategy.RowWinningStrategyImpl;
import com.learn.tictactoe.strategy.WinningStrategy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Game{

    private List<Player> players;
    private Board board;
    private List<Move> moves;
    private Player winner;
    private GameState gameState;
    private int nextMovePlayerIndex;
    private List<WinningStrategy> winningStrategies;


    public Game(int dimension, List<Player> players){
        this.board= new Board(dimension);
        this.players=players;
        this.winningStrategies= Arrays.asList(new RowWinningStrategyImpl(), new ColumnWinningStrategyImpl(), new DiagonalWinningStrategyImpl());
        this.moves=new ArrayList();
        this.winner=null;
        this.gameState=GameState.IN_PROGRESS;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public int getNextMovePlayerIndex() {
        return nextMovePlayerIndex;
    }

    public void setNextMovePlayerIndex(int nextMovePlayerIndex) {
        this.nextMovePlayerIndex = nextMovePlayerIndex;
    }

    public List<WinningStrategy> getWinningStrategies() {
        return winningStrategies;
    }

    public void setWinningStrategies(List<WinningStrategy> winningStrategies) {
        this.winningStrategies = winningStrategies;
    }
}