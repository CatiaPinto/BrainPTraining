public class ShortDistanceWordsArray {
        public static long solution(String[] words, String word1, String word2) {
        int wordAIndex = -1;
        int wordBIndex = -1;

        int minDistance = Integer.MAX_VALUE;

        if(words.length ==0 || word1.equals(word2)) return 0;

        for(int index=0; index<words.length; index++){
            String wordAtIndex = words[index];
            if(word1.equals(wordAtIndex)){
                wordAIndex = index;
                if(wordBIndex!=-1)
                    minDistance = Math.min(minDistance, wordAIndex-wordBIndex);
            }else if(word2.equals(wordAtIndex)){
                wordBIndex = index;
                if(wordAIndex!=-1)
                    minDistance = Math.min(minDistance, wordBIndex-wordAIndex);
            }
        }

        return minDistance;
    }
}
