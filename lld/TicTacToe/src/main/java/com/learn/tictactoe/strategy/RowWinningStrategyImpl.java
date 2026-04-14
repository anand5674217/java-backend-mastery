package com.learn.tictactoe.strategy;

import com.learn.tictactoe.model.Board;
import com.learn.tictactoe.model.Move;

public class RowWinningStrategyImpl implements WinningStrategy{
    @Override
    public boolean checkWinner(Board board, Move move) {
        return false;
    }
}
