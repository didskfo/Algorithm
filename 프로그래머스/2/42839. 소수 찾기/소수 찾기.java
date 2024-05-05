import java.util.*;

class Solution {
    public int solution(String numbers) {
        int answer = 0;
        List<String> combinations = generateCombinations(numbers);
        List<String> result = new ArrayList<>();

        for (String combination : combinations) {
            result.add(combination); 
            if (combination.length() > 1) {
                result.addAll(generatePermutations(combination)); 
            }
        }
        List<Integer> intResult = toIntegerList(result); 
        Set<Integer> uniqueSet = new HashSet<>(intResult);
        List<Integer> uniqueList = new ArrayList<>(uniqueSet);
        System.out.println(uniqueList);
        for (int i : uniqueList) {
            if (i != 0 && i != 1 && isPrime(i) == 1) answer++;
        }
        return answer;
    }
    
    public int isPrime(int n) {
        for (int i = 2; i<=(int)Math.sqrt(n); i++) {
          if (n % i == 0) {
              return 0;
          }
        }
        return 1;
    }

    public static List<String> generateCombinations(String str) {
        List<String> combinations = new ArrayList<>();
        int n = str.length();

        for (int i = 1; i < (1 << n); i++) {
            StringBuilder combination = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) { 
                    combination.append(str.charAt(j));
                }
            }
            combinations.add(combination.toString());
        }

        return combinations;
    }

    public static List<String> generatePermutations(String str) {
        List<String> permutations = new ArrayList<>();
        permute(str.toCharArray(), 0, permutations);
        return permutations;
    }

    private static void permute(char[] arr, int index, List<String> permutations) {
        if (index == arr.length - 1) {
            permutations.add(new String(arr));
            return;
        }
        
        for (int i = index; i < arr.length; i++) {
            swap(arr, index, i);
            permute(arr, index + 1, permutations);
            swap(arr, index, i); 
        }
    }

    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    } 
    
    public static List<Integer> toIntegerList(List<String> strList) {
        List<Integer> intList = new ArrayList<>();
        for (String str : strList) {
            intList.add(Integer.parseInt(str)); 
        }
        return intList;
    }
}