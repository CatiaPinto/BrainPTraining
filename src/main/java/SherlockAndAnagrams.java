import java.util.ArrayList;
import java.util.Arrays;

public class SherlockAndAnagrams {

    static int sherlockAndAnagrams(String s) {

        char[] allCharInAnagram = s.toCharArray();
        int matches = 0;
        ArrayList<String> subStringList = new ArrayList<>();

        for (int index = 0; index <= allCharInAnagram.length; index++) {
            for (int index2 = index +1; index2 <= allCharInAnagram.length; index2++) {
                String tempString = s.substring(index, index2);
                subStringList.add(tempString);
            }
        }
        subStringList.sort((a1, a2) -> a2.length() - a1.length());

        for (int i = 0; i < subStringList.size() - 1; i++) {
            for (int j = i+1; j < subStringList.size(); j++) {
                char[] word1 = subStringList.get(i).toCharArray();
                char[] word2 = subStringList.get(j).toCharArray();
                if (word1.length != word2.length) {
                    break;
                }
                Arrays.sort(word1);
                Arrays.sort(word2);
                if (Arrays.equals(word1, word2)) {
                    matches += 1;
                }
            }
        }

        return matches;
    }


//        static int sherlockAndAnagrams(String s) {

//            char[] allCharInAnagram = s.toCharArray();
//            int matches = 0;
//
//            for (int index = 0; index <= allCharInAnagram.length -1; index++) {
//
//                Map<String, Integer> subStringList = new HashMap<>();
//
//                for (int index2 = 1; index2 <= allCharInAnagram.length - index; index2++) {
//                    System.out.println("Bla" + "index = " + index + "index2 = " + index2  );
//                    String tempString = s.substring(index, index2);
//                    System.out.println(tempString);
//                    Arrays.sort(tempString.toCharArray());
//                    if (!subStringList.containsKey(tempString)) {
//                        subStringList.putIfAbsent(tempString, 1);
//                    } else {
//                        subStringList.put(tempString, subStringList.get(tempString) + 1);
//                    }
//
//                }
//
//                System.out.println(subStringList);
//
//                Collection<Integer> values = subStringList.values();
//                List<Integer> collect = values.stream().filter(v -> v > 1).collect(Collectors.toList());
//
//                for (Integer item : collect) {
//                    matches += item * (item - 1) / 2;
//                }
//            }
//
//            return matches;
//        }
}
