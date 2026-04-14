package com.learn.tictactoe.strategy;

import com.learn.tictactoe.model.Board;
import com.learn.tictactoe.model.Move;

public interface WinningStrategy {

   public boolean checkWinner(Board board, Move move);
}
