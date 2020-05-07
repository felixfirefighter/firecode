// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static int[] bubbleSortArray(int[] arr){
    if(arr == null) return arr;
    
    for(int i=0;i<arr.length;i++) {
        for(int j=i+1;j<arr.length;j++) {
            if(arr[i] > arr[j]) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }

    return arr;
}