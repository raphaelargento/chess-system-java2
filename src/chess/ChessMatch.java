package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.Rook;
import chess.pieces.King;

public class ChessMatch {
    
    // This class contains the Chess Match rules

    private Board board;

    public ChessMatch(){
        // Board has 8 rows x 8 columns
        board = new Board(8,8);
        // Method to start the Chess match (it is on the end of this class)
        initialSetup();
    }

    // Returns chess pieces matrix corresponding to the current match
    public ChessPiece[][] getPieces(){
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        for (int i=0; i<board.getRows(); i++){
            for (int j=0; j<board.getColumns(); j++){
                mat[i][j] = (ChessPiece) board.piece(i,j);
            }
        }
        return mat;
    }

    // Method that initiates a Chess match inserting pieces on the board
    private void initialSetup(){
        board.placePiece(new Rook(board, Color.WHITE), new Position(2,1));
        board.placePiece(new King(board, Color.BLACK), new Position(0,4));
        board.placePiece(new King(board, Color.WHITE), new Position(7,4));
    }
}