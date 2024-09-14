public class GameLogic {
  private Field field;
  private char currentPlayer;

  public GameLogic(int size) {
      this.field = new Field(size);
      this.currentPlayer = 'X';
  }

  public void playGame() {
      while (true) {
          field.printField();
          System.out.println("Current player: " + currentPlayer);
          int row, col;
          do {
              System.out.print("Enter row (0-2): ");
              row = readInt();
              System.out.print("Enter col (0-2): ");
              col = readInt();
          } while (!field.makeMove(row, col, currentPlayer));
          if (field.getWinner() != '-') {
              field.printField();
              System.out.println("Winner: " + field.getWinner());
              return;
          }
          if (field.isFull()) {
              field.printField();
              System.out.println("It's a tie!");
              return;
          }
          if (currentPlayer == 'X') {
              currentPlayer = 'O';
          } else {
              currentPlayer = 'X';
          }
      }
  }

  private int readInt() {
      return Integer.parseInt(System.console().readLine());
  }
}