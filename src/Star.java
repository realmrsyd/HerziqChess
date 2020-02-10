import javax.swing.*;
import java.awt.*;

public class Star extends Piece implements chessUtils // SHIDDART + RIFAE 
{
    private static int counter=1;
    Star(Point A, boolean isGreen, Dimension frameSize)
    {
        super(A,isGreen,frameSize,"Star",counter);
        counter++;
    }

    @Override
    public boolean isValidMove(int i, int j)
    {
        int rowMove = Math.abs(i - this.getRow());
        int colMove = Math.abs(j - this.getCol());

        if ((rowMove == 1) || (colMove == 1))
        {
            return true;
        }
        else if ((rowMove == 2) || (colMove == 2))
        {
            return true;
        }
        else
            return false;
    }
}