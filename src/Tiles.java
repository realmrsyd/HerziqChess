 import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tiles extends JFrame
{
    // components:
    private JButton[][] squares = new JButton[8][5]; // RIFAE 
    // colors:
    private Color cGray = Color.lightGray;

    private Dimension FrameDimensions = new Dimension(600,600);

    private boolean isRedTurn = true;
    private String name1,name2;
    private JLabel TEXTplayerTurn;

    private Star Rstar1 = new Star(new Point(7,0),false,FrameDimensions); // SHIDDART 
    private Star Rstar2 = new Star(new Point(7,4),false,FrameDimensions);
    private Cross Rcross1 = new Cross(new Point(7,1),false,FrameDimensions);
    private Cross Rcross2 = new Cross(new Point(7,3),false,FrameDimensions);
    private Heart Rheart = new Heart(new Point(7,2),false,FrameDimensions);
    private Arrow Rarrow1 = new Arrow(new Point(6,1),false,FrameDimensions);
    private Arrow Rarrow2 = new Arrow(new Point(6,2),false,FrameDimensions);
    private Arrow Rarrow3 = new Arrow(new Point(6,3),false,FrameDimensions);

    private Star Gstar1 = new Star(new Point(0,0),true,FrameDimensions);
    private Star Gstar2 = new Star(new Point(0,4),true,FrameDimensions);
    private Cross Gcross1 = new Cross(new Point(0,1),true,FrameDimensions);
    private Cross Gcross2 = new Cross(new Point(0,3),true,FrameDimensions);
    private Heart Gheart = new Heart(new Point(0,2),true,FrameDimensions);
    private Arrow Garrow1 = new Arrow(new Point(1,1),true,FrameDimensions);
    private Arrow Garrow2 = new Arrow(new Point(1,2),true,FrameDimensions);
    private Arrow Garrow3 = new Arrow(new Point(1,3),true,FrameDimensions);

    public Tiles() // SHIDDART 
    {
        // set the size and Display Window
        super("Herzing Chess");
        String playerName;
        name1 = JOptionPane.showInputDialog("Welcome to Herzing Chess Game!!\nPlease Enter player1 name:","Guest1");
        name2 = JOptionPane.showInputDialog("Welcome to Herzing Chess Game!!\nPlease Enter player2 name:","Guest2");
        if (name1 == null || name1.isEmpty())
            name1 = "Guest1";
        if (name2 == null || name2.isEmpty())
            name2 = "Guest2";
        setResizable(true);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel jp = new JPanel(new BorderLayout(10,0));
        JPanel southPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        setContentPane(jp);
        jp.setPreferredSize(FrameDimensions);
        setMinimumSize(new Dimension(400,500));
        jp.setBackground(Color.black);
        JPanel contents = new JPanel(new GridLayout(8,5));


        // create event handlers:
        ButtonHandler buttonHandler = new ButtonHandler();

        // create and add board components:
        for (int i=0; i<8; i++) //SHIDDART 
        {
            for(int j=0; j<5; j++)
            {
                squares[i][j] = new JButton();
                if ((i+j)%2 != 0)
                {
                    squares[i][j].setBackground(cGray);
                }
                else
                {
                    squares[i][j].setBackground(Color.white);
                }
                contents.add(squares[i][j]);
                squares[i][j].addActionListener(buttonHandler);
            }
        }

        // ------------------------------
        squares[Rstar1.getRow()][Rstar1.getCol()].setIcon(Rstar1.getIcon()); // RIFAE 
        squares[Rstar1.getRow()][Rstar1.getCol()].setName(Rstar1.getName());

        squares[Rstar2.getRow()][Rstar2.getCol()].setIcon(Rstar2.getIcon());
        squares[Rstar2.getRow()][Rstar2.getCol()].setName(Rstar2.getName());

        squares[Rcross1.getRow()][Rcross1.getCol()].setIcon(Rcross1.getIcon());
        squares[Rcross1.getRow()][Rcross1.getCol()].setName(Rcross1.getName());

        squares[Rcross2.getRow()][Rcross2.getCol()].setIcon(Rcross2.getIcon());
        squares[Rcross2.getRow()][Rcross2.getCol()].setName(Rcross2.getName());

        squares[Rheart.getRow()][Rheart.getCol()].setIcon(Rheart.getIcon());
        squares[Rheart.getRow()][Rheart.getCol()].setName(Rheart.getName());

        squares[Rarrow1.getRow()][Rarrow1.getCol()].setIcon(Rarrow1.getIcon());
        squares[Rarrow1.getRow()][Rarrow1.getCol()].setName(Rarrow1.getName());

        squares[Rarrow2.getRow()][Rarrow2.getCol()].setIcon(Rarrow2.getIcon());
        squares[Rarrow2.getRow()][Rarrow2.getCol()].setName(Rarrow2.getName());

        squares[Rarrow3.getRow()][Rarrow3.getCol()].setIcon(Rarrow3.getIcon());
        squares[Rarrow3.getRow()][Rarrow3.getCol()].setName(Rarrow3.getName());
        // -----------------------------
        squares[Gstar1.getRow()][Gstar1.getCol()].setIcon(Gstar1.getIcon());
        squares[Gstar1.getRow()][Gstar1.getCol()].setName(Gstar1.getName());

        squares[Gstar2.getRow()][Gstar2.getCol()].setIcon(Gstar2.getIcon());
        squares[Gstar2.getRow()][Gstar2.getCol()].setName(Gstar2.getName());

        squares[Gcross1.getRow()][Gcross1.getCol()].setIcon(Gcross1.getIcon());
        squares[Gcross1.getRow()][Gcross1.getCol()].setName(Gcross1.getName());

        squares[Gcross2.getRow()][Gcross2.getCol()].setIcon(Gcross2.getIcon());
        squares[Gcross2.getRow()][Gcross2.getCol()].setName(Gcross2.getName());

        squares[Gheart.getRow()][Gheart.getCol()].setIcon(Gheart.getIcon());
        squares[Gheart.getRow()][Gheart.getCol()].setName(Gheart.getName());

        squares[Garrow1.getRow()][Garrow1.getCol()].setIcon(Garrow1.getIcon());
        squares[Garrow1.getRow()][Garrow1.getCol()].setName(Garrow1.getName());

        squares[Garrow2.getRow()][Garrow2.getCol()].setIcon(Garrow2.getIcon());
        squares[Garrow2.getRow()][Garrow2.getCol()].setName(Garrow2.getName());

        squares[Garrow3.getRow()][Garrow3.getCol()].setIcon(Garrow3.getIcon());
        squares[Garrow3.getRow()][Garrow3.getCol()].setName(Garrow3.getName());
        // ----------------------------------



        TEXTplayerTurn = new JLabel("Player Turn => "+name1); // RIFAE 
        Font txtFont = new Font("New Times Roman",Font.BOLD,25);
        TEXTplayerTurn.setFont(txtFont);
        TEXTplayerTurn.setForeground(Color.white);
        southPanel.setBackground(Color.black);
        southPanel.add(TEXTplayerTurn);
        jp.add(southPanel,BorderLayout.SOUTH);
        jp.add(contents,BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }

    private int clickedTile=0;
    private boolean validMove,isEnemy;

    private class ButtonHandler implements ActionListener // SHIDDART 
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            Object source = e.getSource();
            if (clickedTile==0)
            {
                for (int i=0; i<8; i++)
                    for (int j=0; j<5; j++)
                    {
                        if (source == squares[i][j])
                        {
                            if (squares[i][j].getIcon()!=null)
                            {
                                if (isRedTurn)
                                {
                                    if (squares[i][j].getName().equals(Rstar1.getName()))
                                        clickedTile=1;
                                    else if (squares[i][j].getName().equals(Rstar2.getName()))
                                        clickedTile=2;
                                    else if (squares[i][j].getName().equals(Rcross1.getName()))
                                        clickedTile=3;
                                    else if (squares[i][j].getName().equals(Rcross2.getName()))
                                        clickedTile=4;
                                    else if (squares[i][j].getName().equals(Rheart.getName()))
                                        clickedTile=5;
                                    else if (squares[i][j].getName().equals(Rarrow1.getName()))
                                        clickedTile=6;
                                    else if (squares[i][j].getName().equals(Rarrow2.getName()))
                                        clickedTile=7;
                                    else
                                        clickedTile=8; //Rarrow3

                                }
                                else
                                {
                                    if (squares[i][j].getName().equals(Gstar1.getName()))
                                        clickedTile=11;
                                    else if (squares[i][j].getName().equals(Gstar2.getName()))
                                        clickedTile=22;
                                    else if (squares[i][j].getName().equals(Gcross1.getName()))
                                        clickedTile=33;
                                    else if (squares[i][j].getName().equals(Gcross2.getName()))
                                        clickedTile=44;
                                    else if (squares[i][j].getName().equals(Gheart.getName()))
                                        clickedTile=55;
                                    else if (squares[i][j].getName().equals(Garrow1.getName()))
                                        clickedTile=66;
                                    else if (squares[i][j].getName().equals(Garrow2.getName()))
                                        clickedTile=77;
                                    else
                                        clickedTile=88; //Garrow3
                                }

                            }
                            return;
                        }
                    }
            }
            else
            {
                for (int i=0; i<8; i++)
                    for (int j=0; j<5; j++)
                    {
                        if (source == squares[i][j])
                        {
                            if (isRedTurn)
                            {
                                switch (clickedTile) // RIFAE 
                                {
                                    case 1:{
                                        validMove = Rstar1.isValidMove(i,j);
                                        isEnemy = isEnemy(Rstar1.getName(),i,j);
                                        Point point = processClick(i,j,new Point(Rstar1.getRow(),Rstar1.getCol()),Rstar1.getIcon(),Rstar1.getName());
                                        Rstar1.setRow(point.x);
                                        Rstar1.setCol(point.y);
                                        break;
                                    }
                                    case 2:{
                                        validMove = Rstar2.isValidMove(i,j);
                                        isEnemy = isEnemy(Rstar2.getName(),i,j);
                                        Point point = processClick(i,j,new Point(Rstar2.getRow(),Rstar2.getCol()),Rstar2.getIcon(),Rstar2.getName());
                                        Rstar2.setRow(point.x);
                                        Rstar2.setCol(point.y);
                                        break;
                                    }
                                    case 3:{
                                        validMove = Rcross1.isValidMove(i,j);
                                        isEnemy = isEnemy(Rcross1.getName(),i,j);
                                        Point point = processClick(i,j,new Point(Rcross1.getRow(),Rcross1.getCol()),Rcross1.getIcon(),Rcross1.getName());
                                        Rcross1.setRow(point.x);
                                        Rcross1.setCol(point.y);
                                        break;
                                    }
                                    case 4:{
                                        validMove = Rcross2.isValidMove(i,j);
                                        isEnemy = isEnemy(Rcross2.getName(),i,j);
                                        Point point = processClick(i,j,new Point(Rcross2.getRow(),Rcross2.getCol()),Rcross2.getIcon(),Rcross2.getName());
                                        Rcross2.setRow(point.x);
                                        Rcross2.setCol(point.y);
                                        break;
                                    }
                                    case 5:{
                                        validMove = Rheart.isValidMove(i,j);
                                        isEnemy = isEnemy(Rheart.getName(),i,j);
                                        Point point = processClick(i,j,new Point(Rheart.getRow(),Rheart.getCol()),Rheart.getIcon(),Rheart.getName());
                                        Rheart.setRow(point.x);
                                        Rheart.setCol(point.y);
                                        break;
                                    }
                                    case 6:{
                                        validMove = Rarrow1.isValidMove(i,j);
                                        isEnemy = isEnemy(Rarrow1.getName(),i,j);
                                        Point point = processClick(i,j,new Point(Rarrow1.getRow(),Rarrow1.getCol()),Rarrow1.getIcon(),Rarrow1.getName());
                                        Rarrow1.setRow(point.x);
                                        Rarrow1.setCol(point.y);
                                        break;
                                    }
                                    case 7:{
                                        validMove = Rarrow2.isValidMove(i,j);
                                        isEnemy = isEnemy(Rarrow2.getName(),i,j);
                                        Point point = processClick(i,j,new Point(Rarrow2.getRow(),Rarrow2.getCol()),Rarrow2.getIcon(),Rarrow2.getName());
                                        Rarrow2.setRow(point.x);
                                        Rarrow2.setCol(point.y);
                                        break;
                                    }
                                    case 8:{
                                        validMove = Rarrow3.isValidMove(i,j);
                                        isEnemy = isEnemy(Rarrow3.getName(),i,j);
                                        Point point = processClick(i,j,new Point(Rarrow3.getRow(),Rarrow3.getCol()),Rarrow3.getIcon(),Rarrow3.getName());
                                        Rarrow3.setRow(point.x);
                                        Rarrow3.setCol(point.y);
                                        break;
                                    }
                                }
                            }
                            else
                            {
                                switch (clickedTile) // RIFAE 
                                {
                                    case 11:{
                                        validMove = Gstar1.isValidMove(i,j);
                                        isEnemy = isEnemy(Gstar1.getName(),i,j);
                                        Point point = processClick(i,j,new Point(Gstar1.getRow(),Gstar1.getCol()),Gstar1.getIcon(),Gstar1.getName());
                                        Gstar1.setRow(point.x);
                                        Gstar1.setCol(point.y);
                                        break;
                                    }
                                    case 22:{
                                        validMove = Gstar2.isValidMove(i,j);
                                        isEnemy = isEnemy(Gstar2.getName(),i,j);
                                        Point point = processClick(i,j,new Point(Gstar2.getRow(),Gstar2.getCol()),Gstar2.getIcon(),Gstar2.getName());
                                        Gstar2.setRow(point.x);
                                        Gstar2.setCol(point.y);
                                        break;
                                    }
                                    case 33:{
                                        validMove = Gcross1.isValidMove(i,j);
                                        isEnemy = isEnemy(Gcross1.getName(),i,j);
                                        Point point = processClick(i,j,new Point(Gcross1.getRow(),Gcross1.getCol()),Gcross1.getIcon(),Gcross1.getName());
                                        Gcross1.setRow(point.x);
                                        Gcross1.setCol(point.y);
                                        break;
                                    }
                                    case 44:{
                                        validMove = Gcross2.isValidMove(i,j);
                                        isEnemy = isEnemy(Gcross2.getName(),i,j);
                                        Point point = processClick(i,j,new Point(Gcross2.getRow(),Gcross2.getCol()),Gcross2.getIcon(),Gcross2.getName());
                                        Gcross2.setRow(point.x);
                                        Gcross2.setCol(point.y);
                                        break;
                                    }
                                    case 55:{
                                        validMove = Gheart.isValidMove(i,j);
                                        isEnemy = isEnemy(Gheart.getName(),i,j);
                                        Point point = processClick(i,j,new Point(Gheart.getRow(),Gheart.getCol()),Gheart.getIcon(),Gheart.getName());
                                        Gheart.setRow(point.x);
                                        Gheart.setCol(point.y);
                                        break;
                                    }
                                    case 6:{
                                        validMove = Garrow1.isValidMove(i,j);
                                        isEnemy = isEnemy(Garrow1.getName(),i,j);
                                        Point point = processClick(i,j,new Point(Garrow1.getRow(),Garrow1.getCol()),Garrow1.getIcon(),Garrow1.getName());
                                        Garrow1.setRow(point.x);
                                        Garrow1.setCol(point.y);
                                        break;
                                    }
                                    case 77:{
                                        validMove = Garrow2.isValidMove(i,j);
                                        isEnemy = isEnemy(Garrow2.getName(),i,j);
                                        Point point = processClick(i,j,new Point(Garrow2.getRow(),Garrow2.getCol()),Garrow2.getIcon(),Garrow2.getName());
                                        Garrow2.setRow(point.x);
                                        Garrow2.setCol(point.y);
                                        break;
                                    }
                                    case 88:{
                                        validMove = Garrow3.isValidMove(i,j);
                                        isEnemy = isEnemy(Garrow3.getName(),i,j);
                                        Point point = processClick(i,j,new Point(Garrow3.getRow(),Garrow3.getCol()),Garrow3.getIcon(),Garrow3.getName());
                                        Garrow3.setRow(point.x);
                                        Garrow3.setCol(point.y);
                                        break;
                                    }
                                }
                            }
                            ////
                            return;
                        }
                    }
            }
        }
    }


    public Point processClick(int i, int j,Point P,ImageIcon icon,String name) // SHIDDART 
    {
        clickedTile=0;
        if (validMove && isEnemy)
        {
            squares[P.x][P.y].setIcon(null); // Point P is the current location of the Piece
            squares[P.x][P.y].setName(null);
            squares[i][j].setIcon(icon); // i and j are the coordinates of the new desired location
            squares[i][j].setName(name);
            if (isRedTurn)
            {
                isRedTurn = false;
                TEXTplayerTurn.setText("Player Turn => "+name2);
            }
            else
            {
                isRedTurn = true;
                TEXTplayerTurn.setText("Player Turn => "+name1);
            }
            return new Point(i,j);
        }
        return P;
    }

    public boolean isEnemy(String tileName,int i,int j) // SHIDDART 
    {
        if (squares[i][j].getName()!=null)
            if ((tileName.startsWith("G") == squares[i][j].getName().startsWith("G"))||(tileName.startsWith("R") == squares[i][j].getName().startsWith("R")))
                return false;
        return true;
    }


    public static void main (String arg[]) // SHIDDART 
    {
        JFrame nframe = new Tiles();
    }
}