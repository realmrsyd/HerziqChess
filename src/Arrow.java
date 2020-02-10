import java.awt.*;

public class Arrow extends Piece implements chessUtils // RIFAE
{
    static int counter=1;
    Arrow(Point A, boolean isGreen, Dimension frameSize)
    {
        super(A,isGreen,frameSize,"Arrow",counter);
        counter++;
    }
    @Override
    public boolean isValidMove(int i, int j)
    {
        int rowMove = Math.abs(i - this.getRow());
        int colMove = Math.abs(j - this.getCol());

        if (((rowMove == 1)||(rowMove == 2)) && (colMove == 0))
        {
            return true;
        }
        else
            return false;
    }
}