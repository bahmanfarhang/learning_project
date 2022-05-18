public class anotherClass {
    //main method (needed for any java app)
    public static void main(String[] args) {
        //calling the method name here just to execute it - i can RE-USE my method name many times but with different values
        CalcScore(20, true,12,2);
        CalcScore(3453,false,342,453);

        //i can assign my method to a variable
        int lookAtMyScore = CalcScore(20, true,12,2);
        System.out.println("i did really good "+ lookAtMyScore);
        System.out.println("I did fantastic " + CalcScore(12,false,3,2));

        //my other method
        BodyScoreFat(5,5,4);
        BodyScoreFat(2,4,6);
    }

    //my own created method - inner workings
    public static int CalcScore(int score, boolean isOver, int levels, int bonusLevel){
        //this is the stomach and the "inner workings" of the method which can be RE-USED
        if(!isOver){
            int myFinalScore = (score*levels);
            System.out.println("my final score is : " + myFinalScore);
            int maxScore = myFinalScore*bonusLevel;
            System.out.println("my max score can be " + maxScore);
            return myFinalScore;
        }
        return -1;
    }

    //my second method and i ONLY have 1 place to modify the inner workings of the class
    public static void BodyScoreFat(double height, double width, double areaMass){

        if ((height*width)*areaMass==100){
            int clothesSize = 23;
            System.out.println("you are FAT, please use clothe size " + clothesSize);
        }
        else {
            System.out.println("not too fat..");
        }
    }
}
