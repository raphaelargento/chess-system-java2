package application;

import chess.ChessPiece;

public class UI {
    
    public static void printBoard(ChessPiece[][] pieces) {
        // Printing the board
        for (int i=0; i<pieces.length; i++){
            System.out.print((8-i) + " ");    // Printing the numbers of the board
            for (int j=0; j<pieces.length; j++){
                printPiece(pieces[i][j]);
            }
            System.out.println();
        }
        // printing the letters of the board
        System.out.println("  a b c d e f g h");
    }

    // method for printing ONE piece
    private static void printPiece(ChessPiece piece){
        if (piece == null){
            System.out.print("-");
        } else {
            System.out.print(piece);
        }
        System.out.print(" ");
    }
}
