import java.awt.*;

public class Heart extends Piece implements chessUtils // RIFAE
{
    private static int counter=1;
    Heart(Point A, boolean isGreen, Dimension frameSize)
    {
        super(A,isGreen,frameSize,"Heart",counter);
        counter++;
    }
    @Override
    public boolean isValidMove(int i, int j)
    {
        int rowMove = Math.abs(i - this.getRow());
        int colMove = Math.abs(j - this.getCol());

        if ((rowMove == 1) || (colMove == 1))
            return true;
        else
            return false;
    }
}