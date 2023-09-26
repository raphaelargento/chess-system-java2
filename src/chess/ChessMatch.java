package chess;

import boardgame.Board;
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


    // Operation to insert pieces using chess match coordinates, not the matrix positions
    private void placeNewPiece (char column, int row, ChessPiece piece){
        board.placePiece(piece,new ChessPosition(column, row).toPosition());
    }

    // Method that initiates a Chess match inserting pieces on the board
    private void initialSetup(){
        placeNewPiece('b', 6, new Rook(board, Color.WHITE));
        placeNewPiece('e', 8, new King(board, Color.BLACK));
        placeNewPiece('e', 1, new King(board, Color.WHITE));
    }
}