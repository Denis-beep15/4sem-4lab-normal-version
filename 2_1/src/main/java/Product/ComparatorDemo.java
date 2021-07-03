package Product;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorDemo {
    public static void SortGoods(Product [] array, Comparator<Product> cmp){
        Arrays.sort(array, cmp);
    }
}
