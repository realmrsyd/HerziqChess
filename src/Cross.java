import java.awt.*;

public class Cross extends Piece implements chessUtils // RIFAE 
{
    private static int counter=1;
    Cross(Point A, boolean isGreen, Dimension frameSize)
    {
        super(A,isGreen,frameSize,"Cross",counter);
        counter++;
    }
    @Override
    public boolean isValidMove(int i, int j)
    {
        int rowMove = Math.abs(i - this.getRow());
        int colMove = Math.abs(j - this.getCol());

        if (rowMove == colMove)
        {
            return true;
        }
        else
            return false;
    }
}
