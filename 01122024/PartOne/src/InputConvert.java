import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class InputConvert {

    // Method to read input file and return two lists: leftList and rightList
    public static List<List<Integer>> readFile(String filePath) {
        List<Integer> leftList = new ArrayList<>();
        List<Integer> rightList = new ArrayList<>();

        try {
            List<String> lines = Files.readAllLines(Paths.get(filePath));
            for (String line : lines) {
                String[] numbers = line.trim().split("\\s+");
                if (numbers.length == 2) { 
                    leftList.add(Integer.valueOf(numbers[0]));
                    rightList.add(Integer.valueOf(numbers[1]));
                    // // output to console for debugging
                    // System.out.println("Left: " + numbers[0] + " Right: " + numbers[1]);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

        List<List<Integer>> result = new ArrayList<>();
        result.add(leftList);
        result.add(rightList);
        return result;
    }
}