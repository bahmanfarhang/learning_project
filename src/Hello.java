public class Hello {
    public static void main(String[] args) {

        double myFirstValue = 20.00;
        double mySecondValue = 80.00;
        double total = (myFirstValue + mySecondValue)*100;
        double results = total%40;

        System.out.println("total "+ total);
        System.out.println("results " +results);

        boolean isZeroOrNot = (results == 0)? true:false;
        System.out.println(isZeroOrNot);

        if (!isZeroOrNot){
            System.out.println("got some reminders");
        }
        else {
            System.out.println("lol");
        }

        /*
        * calc for shopping cart
        * */
        int bread = 2;
        int coco = 3;
        int drink = 1;
        int organicMilk = 9;
        //add all
        int totalShoppingCart = bread+coco+drink+organicMilk;
        //multiply
        int afterTax = (totalShoppingCart/9) * 100;
        System.out.println(afterTax);

        boolean isHundred = afterTax == 0? true:false;
        System.out.println(isHundred);

        if (!isHundred){
            System.out.println("this is false statement");
        }

        /*
        * a simple game...
        * */
        boolean gameOver = false;
        int bonus = 3;
        int score = 1801;
        int levelFinished = 5;
        int maxLevel = 9;

        if (score < 2000 && score < 1900){
            System.out.println("im super impressed...");
            if (score==1800){
                System.out.println("was exact...");
            }
        }
        else if (score <= 1000 && score >=500) {
            System.out.println("not bad... mate");
        }
        else {
            System.out.println("seems like you got less than 499.... so....lol...");
        }

        if (gameOver == true){
            int finalScore = (score*levelFinished) +bonus;
            System.out.println("well done you are done with a score of: " + finalScore);
            int couldOfScored = (maxLevel*score) +bonus;
            System.out.println("but you could of scored as high as " + couldOfScored);
            int differenceOfScores = couldOfScored-finalScore;
            System.out.println("therefore, a difference of " + differenceOfScores);
        }
        else {
            System.out.println("you lost everything....");
        }
        double playerScore = 99.00d;
        double levels = 4.00d;
        int bonusPerLevel = 21;
        int maxLevels = 8;
        boolean endLevel = true;

        if(endLevel){
            double finalScore = (playerScore*levels) + bonusPerLevel;
            System.out.println("well done, you got " + finalScore + " so far...");
            int maxiScore = (int) ((playerScore*maxLevels) + bonusPerLevel);
            System.out.println("you could of got a max score of " + maxiScore + ", but nvm");
        }

        boolean endGame = (maxLevel ==0)? true:false;

    }
}
