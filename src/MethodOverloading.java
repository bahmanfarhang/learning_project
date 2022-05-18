public class MethodOverloading {
    public static void main(String[] args) {
        highScores("bob", 12);
        int i = highScores("tom",10);
        System.out.println("wow nice score " + i);

        int s = highScores(100);

        String sName = highScores("stacy");
        System.out.println("well done "+ sName + " you got " + s);
    }

    public static int highScores(int score){
        System.out.println("well done you got " + score);
        return score * 10;
    }
    public static String highScores(String name){
        System.out.println("well done " + name);
        return name;
    }
    public static int highScores(String name, int score){
        System.out.println("well done " + name + " you got " + score);
        return score * 20;
    }
}
