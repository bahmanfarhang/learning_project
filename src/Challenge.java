public class Challenge {

    public static void displayHighScorePosition(String playerName, int position){
            System.out.println(playerName + " managed to get a position of " + position);
    }

    //method 2
    public static int calcHighScorePosition(int playerScore){
//        if(playerScore >=1000){
//            return 1;
//        }
//        else if (playerScore>=500) {
//            return 2;
//        }
//        else if (playerScore>=100) {
//            return 3;
//        }
//        else {
//            return 4;
//        }
        //another way of doing it
        int position = 4;
        if (playerScore >= 1000){
            position=1;
        } else if (playerScore>=500) {
            position =2;
        } else if (playerScore >=100) {
            position=3;
        }
        return position;
    }

    public static void main(String[] args) {

        int highestScores = calcHighScorePosition(1400);
        displayHighScorePosition("john", highestScores);

        highestScores = calcHighScorePosition(999);
        displayHighScorePosition("tom", highestScores);

        highestScores = calcHighScorePosition(400);
        displayHighScorePosition("stacy", highestScores);

        highestScores = calcHighScorePosition(10);
        displayHighScorePosition("rebeca", highestScores);

    }
}
