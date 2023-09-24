package application;

import boardgame.Position;
import boardgame.Board;

public class Program {
    public static void main(String[] args) throws Exception {
            // Verificação da posição
            Position pos = new Position(3, 5);
            System.out.println(pos);

            // Impletentação do tabuleiro:
            Board board = new Board(8, 8);
    }
}
