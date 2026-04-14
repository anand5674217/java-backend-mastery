package com.learn.tictactoe.model;

public class Cell{

    private int row;
    private int col;
    private CellState cellState;
    private Player player;

    public Cell( int col, int row) {
        this.player = null;
        this.cellState = CellState.EMPTY;
        this.col = col;
        this.row = row;
    }


    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public CellState getCellState() {
        return cellState;
    }

    public void setCellState(CellState cellState) {
        this.cellState = cellState;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }


    public void display(){
        if(this.player==null){
            System.out.println("| - |");
        }else{
            System.out.println("| "+player.getSymbol()+" |");
        }
    }
}