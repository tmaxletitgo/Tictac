package com.hillygeeks.tictac;

/**
 * Created by Max Ahirwe on 12/4/2016.
 * this class represents a tic tac game of 3*3
 */
public class TicTacGame {


    public static TicTac3Board Board;
    //receives a boolean that specify who plays first between the human player and the human player

    public TicTacGame() {

        Board = new TicTac3Board();

    }

//    /**
//     * make moves accross on the board
//     */
//    public boolean makemove(int slotnumber, int playerID) {
//        return Board.FillSlot(slotnumber, playerID);
//    }
//
//    /**
//     * make the first pc move if initiated
//     * @return
//     */
//    public int PCmakeFirstmove(){
//       return Board.MakeFirstPCRandomMove();
//    }


}
