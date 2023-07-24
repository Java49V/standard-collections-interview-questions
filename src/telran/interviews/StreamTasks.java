package telran.interviews;

import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.HashMap;


public class StreamTasks {
      static public void displayOccurrences(String strings[]) {
    	  Arrays.stream(strings)
    	  .collect(Collectors.groupingBy(s -> s, Collectors.counting()))
    	  .entrySet().stream().sorted((e1, e2) -> {
    		  int res = Long.compare(e2.getValue(), e1.getValue());
    		  return res != 0 ? res : e1.getKey().compareTo(e2.getKey());
    	  })
    	  .forEach(e -> System.out.printf("%s -> %s\n", e.getKey(), e.getValue()));
      }
      static public long sumGroups(int [][] groups) {
    	  return Arrays.stream(groups)
    			  .flatMapToInt(g -> Arrays.stream(g)).asLongStream()
    			  .sum();
      }
      static public void displayOddEvenGrouping(int nNumbers) {
    	  new Random().ints(nNumbers, 0, Integer.MAX_VALUE ).boxed()
    	  .collect(Collectors.groupingBy(n -> n % 2 == 0 ? "even" : "odd",
    			  Collectors.summingLong(x -> x)))
    	  .forEach((k, v) -> System.out.printf("%s -> %d\n", k, v));
      }
      
      static public void printDigitStatistics() {
          // Generate 
          Random random = new Random();
          int totalNumbers = 1_000_000;
          int[] numbers = new int[totalNumbers];
          for (int i = 0; i < totalNumbers; i++) {
              numbers[i] = random.nextInt(Integer.MAX_VALUE);
          }

          // Count 
          Map<Character, Long> digitOccurrences = new HashMap<>();
          for (int number : numbers) {
              String numStr = String.valueOf(number);
              for (char digit : numStr.toCharArray()) {
                  digitOccurrences.put(digit, digitOccurrences.getOrDefault(digit, 0L) + 1);
              }
          }

          // Print 
          digitOccurrences.entrySet().stream()
                  .sorted(Map.Entry.comparingByKey())
                  .forEach(entry -> System.out.printf("%c -> %d\n", entry.getKey(), entry.getValue()));
      }
}
