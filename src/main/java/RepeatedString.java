public class RepeatedString {

    static long repeatedString(String s, long n) {

        long countAInputString = s.chars().filter(letterA -> letterA == 'a').count();
        long totalCountA;

        //Determines how many complete substrings
        long completeStrings = n / s.length();

        //Determines how many As in the complete substrings
        totalCountA = completeStrings * countAInputString;

        //Determines how many characters in we will analyze towards the end of our n range
        long remainder = n % s.length();

        for(int index = 0; index < remainder; index++)
        {
            if(s.charAt(index) == 'a')
            {
                totalCountA++;
            }
        }

        return totalCountA;
    }

}
