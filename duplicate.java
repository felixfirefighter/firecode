// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

// Solution 1
public static String duplicate1(int[] numbers){
  TreeSet treeSet = new TreeSet();
  Set set = new HashSet();
  
  for(int number:numbers) {
      // map.add will return a boolean
      // if it is not successfully added due to duplicate
      // add it to set instead
      if(!set.add(number)) treeSet.add(number);
  }
  
  return treeSet.toString();
}

// Solution 2
public static String duplicate2(int[] numbers){
  Arrays.sort(numbers);

  List<Integer> result = new ArrayList<Integer>();
  for(int i=1;i<numbers.length;i++) {
      if(numbers[i] == numbers[i-1]) {
          result.add(numbers[i]);
      }
  }

  return result.toString();
}