import javax.swing.*;
import java.awt.*;

public class Piece //SHIDDART 
{
    // current position:
    private int row;
    private int col;

    // Piece Name:
    private String Name;
    // images:
    private Image img;

    Piece (Point A,boolean isGreen, Dimension frameSize,String pieceName,int counter)
    {
        row = A.x;
        col = A.y;
        String Green;
        ImageIcon imageIcon;
        if (isGreen)
        {
            imageIcon = new ImageIcon("Resources\\green"+pieceName+".PNG");
            Green = "G";
        }
        else
        {
            imageIcon = new ImageIcon("Resources\\"+pieceName+".PNG");
            Green = "R";
        }
        Name = Green + pieceName + counter;
        img = imageIcon.getImage();
        img = img.getScaledInstance(frameSize.width/10, frameSize.height/10,Image.SCALE_SMOOTH);
    }

    public ImageIcon getIcon()
    {
        ImageIcon imgIcon=new ImageIcon();
        imgIcon.setImage(img);
        return imgIcon;
    }
    public int getRow() { return row; }
    public int getCol() { return col; }
    public String getName() { return Name; }

    public void setRow(int R) { this.row = R; }
    public void setCol(int C) { this.col = C; }
    public void setName(String name) { this.Name = name; }
}
