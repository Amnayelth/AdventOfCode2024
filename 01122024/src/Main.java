import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        // File path for input
        String filePath = "D:/Studium/AOC_2024/AdventOfCode2024/01122024/src/input.txt"; 

        // Read the input file and get the two lists
        List<List<Integer>> lists = InputConvert.readFile(filePath);
        List<Integer> leftList = lists.get(0);
        List<Integer> rightList = lists.get(1);

        // Convert the lists to arrays
        int[] list1 = leftList.stream().mapToInt(i -> i).toArray();
        int[] list2 = rightList.stream().mapToInt(i -> i).toArray();

        // mergesort
        MergeSort.mergeSort(list1, 0, list1.length - 1);
        MergeSort.mergeSort(list2, 0, list2.length - 1);

        // Distances of those two lists
        int[] result = Distance.distanceOf(list1, list2);

        // Sum of the distances
        int distanceSum = Distance.sumOf(result);
        System.out.println("Sum of the distances: \n" + distanceSum);

        // Similarity score of the two lists       
        int similarityScore = Similarity.similarityScore(list1, list2);
        System.out.println("Similarity score of the two lists: \n" + similarityScore);


    

    }
}
