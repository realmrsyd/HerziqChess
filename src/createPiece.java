import java.awt.*;

public class createPiece {  // SHIDDART
    private String pieceType;
    private boolean isGreen;
    private Point point;
    private Dimension frameDimensions;
    createPiece(String type, char color, Point coordinates, Dimension frame)
    {
        pieceType = type;
        if (color == 'g')
            this.isGreen = true;
        else
            this.isGreen = false;
        point = coordinates;
        frameDimensions = frame;
    }

}
