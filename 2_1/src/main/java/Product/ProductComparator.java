package Product;
import java.util.Comparator;

public class ProductComparator implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        int comp = o1.getTitle().compareTo(o2.getTitle());
        if (comp == 0) {
            comp = (o1.getDescription().compareTo(o2.getDescription()));
        }
        return comp;
    }
}