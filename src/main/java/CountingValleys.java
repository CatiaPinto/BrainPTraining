public class CountingValleys {

    public static void main(String[] args) {
        int numberOfSteps = 8;
        String pathDescription = "DDUUUUDD";
        countingValleys(numberOfSteps, pathDescription);
    }


    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) throws IllegalArgumentException {

        String[] stepsArray = s.split("");
        int level = 0;
        int valleysCount = 0;

        for (String step: stepsArray) {
            switch (step) {
                case "D":
                    level--;
                    break;
                case "U":
                    level++;
                    break;
                default:
                    throw new IllegalArgumentException();
            }
            //came UP from sea level so it is a valley
            if (level == 0 && "U".equals(step)){
                valleysCount++;
            }
        }

        return valleysCount;
    }
}