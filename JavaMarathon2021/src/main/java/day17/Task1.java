package day17;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

        ChessPiece[] chessPiece = ChessPiece.values();
        ChessPiece[] chessPiece1 = new ChessPiece[8];

        for (int i = 0; i < chessPiece1.length; i++) {
            if ((i < (chessPiece1.length) / 2)) {
                chessPiece1[i] = chessPiece[ChessPiece.PAWN_WHITE.ordinal()];
            } else {
                chessPiece1[i] = chessPiece[ChessPiece.ROOK_BLACK.ordinal()];
            }
        }

        for (ChessPiece d : chessPiece1) {
            System.out.print(d.getStringDesignation());
        }

    }


}