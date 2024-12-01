public class Similarity {
    // iterate through the first list and compare each element with the second list
    public static int[] similarityOf(int[] list1, int[] list2) {
        int[] result = new int[list1.length]; // 
        for (int i = 0; i < list1.length; i++) {
            int count = 0;
            for (int j = 0; j < list2.length; j++) {
                if (list1[i] == list2[j]) {
                    count++;
                }
            }
            result[i] = count;                          
        }
        return result;
    }

    // similarityScore is the A[i] * how often A[i] is found in B
    public static int similarityScore(int[] list1, int[] list2) {
        int[] similarity = similarityOf(list1, list2);
        int sum = 0;
        for (int i = 0; i < similarity.length; i++) {
            sum += list1[i] * similarity[i];
        }
        return sum;
    }
}
