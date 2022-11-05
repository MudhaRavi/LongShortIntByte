public class Method {

    public static void main(String[] args) {
        int highScoreTable =calculateHighScorePosition(2000);
        displayHighScorePosition("Tim", highScoreTable);

    }

    public static void displayHighScorePosition(String playerName, int highScoreTable) {
        System.out.println(playerName + " Managed to get in position " +
                ""
                +  highScoreTable  +  " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore > 1000) {
            return 1;
        } else if (playerScore > 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore > 100 && playerScore < 500) {
            return 3;
        } else {
            return 4;
        }
    }
}