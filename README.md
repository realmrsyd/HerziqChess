# Herzig Chess
A Herzig Chess game as a GUI-based Java Application. There is no computer player, it can just be a two human player game.

The Arrow Box can only move forward, 1 or 2 steps. If it reaches the end of the board, it turns around and starts heading back the other way. 
The Star can move one or two steps in any direction. 
The Cross can only move diagonally, but can go any distance. 
The Heart can move only one step in any direction. The game ends when the heart is captured by the other side. 

After 4 turns, a Star will turn into a Cross, and a Cross will turn into a Star. (This makes Herzig chess different from all other chess games, because the pieces will transform like that.) 

DESIGN PATTERN 
 
1. The entire program uses the MVC design pattern which are Model (Piece), Controller (createPiece,ButtonHandler) and View (Tiles). While Tiles.java is the main function.  
2. First, the Herzig chess program applied the Singleton design pattern which means only one instance is created. Additionally, ButtonHandler class controls each particular piece in the chess board. It is interacted with mouse listener react to the user’s click on it especially for the movement of each piece of chess. To summarize, it acts like a brain for the game to operate. 
3. The Piece class is a parent class which are inherited by Heart, Cross, Star and Arrow. This class mostly use for setting the state of each piece.  
4. The Tiles class is responsible for the view of the board, for example, current player turn, which chess is selected and others. It also is a place for the user to enter both player’s name. 
5. The createPiece Class spawn the chess pieces and the equal number of both red and green colour pieces. 
 
 
