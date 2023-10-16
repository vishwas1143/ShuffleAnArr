import java.util.Random;

public class ShuffleCards {

  public static void shuffleNumbers(int[] arr) {
    Random randomObject = new Random(); //random object

    for (int i = 0; i < arr.length; i++) {

      // Generating a random index between 0 and the array length
      int randomValue = randomObject.nextInt(arr.length);

      // Swapping the current element with the element at the random index
      int currentValue = arr[i];
      arr[i] = arr[randomValue];
      arr[randomValue] = currentValue;
    }

    // Print the shuffled array
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }

    System.out.println();
  }

  public static void main(String[] args) {
    int arr[] =  {1, 2, 3, 4, 5, 6, 7};

    for (int i = 0; i < 10; i++) { // performming suffle 10 times
      shuffleNumbers(arr);
    }
  }
}
