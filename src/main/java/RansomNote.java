import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RansomNote {

    static String checkMagazine(String[] magazine, String[] note) {

        //doesn't work when magazine contains repeated words.
//        boolean doesItMatch = Arrays.asList(magazine).containsAll(Arrays.asList(note));

        Map<String, Long> magazineMap = Arrays.stream(magazine).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Map<String, Long> noteMap = Arrays.stream(note).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        boolean doesItMatch = noteMap
                .entrySet()
                .stream()
                .noneMatch(i -> (!magazineMap.containsKey(i.getKey()) || magazineMap.get(i.getKey()) < i.getValue()));

        System.out.println(doesItMatch? "Yes" : "No");
        return doesItMatch? "Yes" : "No";
    }
}
