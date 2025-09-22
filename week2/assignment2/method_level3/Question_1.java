import java.util.*;

public class Question_1 {
  public static int[] generateRandomHeights(int size) {
    int[] heights = new int[size];
    for (int i = 0; i < size; i++) {
      heights[i] = 150 + (int) (Math.random() * 101);
    }
    return heights;
  }

  public static int findSum(int[] heights) {
    int sum = 0;
    for (int height : heights) {
      sum += height;
    }
    return sum;
  }

  public static double findMeanHeight(int[] heights) {
    int sum = findSum(heights);
    return (double) sum / heights.length;
  }

  public static int findShortestHeight(int[] heights) {
    int min = heights[0];
    for (int height : heights) {
      min = Math.min(min, height);
    }
    return min;
  }

  public static int findTallestHeight(int[] heights) {
    int max = heights[0];
    for (int height : heights) {
      max = Math.max(max, height);
    }
    return max;
  }

  public static void main(String[] args) {
    int[] heights = generateRandomHeights(11);

    System.out.println("Player heights (in cm): " + Arrays.toString(heights));
    System.out.println("Shortest height: " + findShortestHeight(heights) + " cm");
    System.out.println("Tallest height: " + findTallestHeight(heights) + " cm");
    System.out.println("Mean height: " + findMeanHeight(heights) + " cm");
  }
}
