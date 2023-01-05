package bai8;

public class TennisGame {

    public static String getScore(String player1Name, String player2Name, int score1, int score2) {

        boolean isDraw = score1 == score2;
        boolean isEnd = score1 >= 4 || score2 >= 4;
        if (isDraw) return getGameDrawCalledScore(score1);
        if (isEnd) return getGameEndCalledScore(score1, score2);

        String calledScore = getPlayerCalledScore(score1) + "-" + getPlayerCalledScore(score2);
        return calledScore;
    }

    private static String getGameDrawCalledScore(int drawScore) {
        switch (drawScore) {
            case 0:
                return "Love-All";
            case 1:
                return "Fifteen-All";
            case 2:
                return "Thirty-All";
            case 3:
                return "Forty-All";
            default:
                return "Deuce";
        }
    }

    private static String getGameEndCalledScore(int player1Score, int player2Score) {
        int minusResult = player1Score - player2Score;

        if (minusResult == 1) return "Advantage player1";
        if (minusResult == -1) return "Advantage player2";
        if (minusResult >= 2) return "Win for player1";
        return "Win for player2";
    }

    private static String getPlayerCalledScore(int playerScore) {
        switch (playerScore) {
            case 0:
                return "Love";
            case 1:
                return "Fifteen";
            case 2:
                return "Thirty";
            default:
                return "Forty";
        }

    }
}