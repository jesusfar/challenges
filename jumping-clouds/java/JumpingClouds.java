import java.util.List;

public class JumpingClouds {
    static int ONE_STEP=1;
    static int TWO_STEPS=2;
    public static int jumpingOnClouds(List<Integer> c) {
        int jump=0;
        int nextIndex=0;
        int steps=0;
        int lastIndex = c.size()-1;
        while (true) {
            if (nextIndex+TWO_STEPS <= lastIndex && c.get(nextIndex+TWO_STEPS)!=1) {
                jump=TWO_STEPS;
            } else if (nextIndex+ONE_STEP<=lastIndex && c.get(nextIndex+ONE_STEP)!=1){
                jump=ONE_STEP;
            } else {
                break;
            }
            nextIndex+=jump;
            steps++;
        }
        return steps;
    }
}