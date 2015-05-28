import java.util.Arrays;

/**
 * Created by alex on 28.05.15.
 */
public class App00 {
    public static void main(String[] args) {
        int[] array1D = {0, 1, 2, 3, 4};
        int[][] array2D = {{1, 2}, {2, 3}, {4, 7}};

        System.out.println(Arrays.toString(array1D));
        System.out.println(Arrays.deepToString(array2D));
        System.out.println(Arrays.toString(args));

    }

}
