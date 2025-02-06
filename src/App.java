import javax.swing.JFrame;

public class App {
    public static void main(String[] args) {
        int rowCount = 21;
        int columnCount = 19;
        int tileSize = 32;
        int boardWidth = columnCount * tileSize;
        int boardHeight = rowCount * tileSize;

        JFrame frame = new JFrame("Pac-Man");
        frame.setSize(boardWidth, boardHeight);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        PacMan pacmanGame = new PacMan();
        frame.add(pacmanGame);
        frame.pack();  // Ensures proper sizing

        pacmanGame.requestFocusInWindow(); // Requests focus correctly

        frame.setVisible(true);
    }
}
