public class JumpingOnClouds {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        int numberOfJumps = 0;

        for (int index = 0; index < c.length -3; index++) {
            if (c[index+2] ==0 ) {
                numberOfJumps += 1;
                index++;
            } else {
                numberOfJumps +=1;
            }
        }
        numberOfJumps ++; // this is the last jump
        return numberOfJumps;
    }
}