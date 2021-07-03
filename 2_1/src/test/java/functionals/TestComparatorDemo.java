package functionals;

import first.ComparatorDemo;
import first.Product;
import first.ProductComparator;
import first.WeightProduct;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestComparatorDemo {
    @Test
    public void testComparatorDemo() {
        Product product = new Product("Чипсы", "Со вкусом сметаны и зелени");
        Product product1 = new Product("Чипсы", "Со вкусом краба");
        WeightProduct product2 = new WeightProduct("Чипсы", "Со вкусом сыра");
        Product [] prod = {product, product1, product2};
        ProductComparator cmp = new ProductComparator();
        Product[] expected = { product1, product, product2};

        ComparatorDemo.SortGoods(prod,cmp);

        assertEquals(prod, expected);
    }
    @Test
    public void testComparatorDemo1() {
        Product product = new Product("Чипсы", "Со вкусом сметаны и зелени");
        Product [] prod = {};
        ProductComparator cmp = new ProductComparator();
        Product[] expected = {};

        ComparatorDemo.SortGoods(prod,cmp);

        assertEquals(prod, expected);
    }
    @Test
    public void testComparatorDemo3() {
        Product product = new Product("Чипсы", "Со вкусом сметаны и зелени");
        Product product1 = new Product("Чипсы", "Со вкусом краба");
        WeightProduct product2 = new WeightProduct("Чипсы", "Со вкусом сыра");
        Product [] prod = {product, product1, product2, product};
        ProductComparator cmp = new ProductComparator();
        Product[] expected = { product1, product,product, product2};

        ComparatorDemo.SortGoods(prod,cmp);

        assertEquals(prod, expected);
    }
    @Test
    public void testComparatorDemo4() {
        Product product = new Product("Чипсы", "Со вкусом сметаны и зелени");
        Product product1 = new Product("Газировка", "Coca-cola");
        WeightProduct product2 = new WeightProduct("Чипсы", "Со вкусом сыра");
        Product [] prod = {product, product1, product2};
        ProductComparator cmp = new ProductComparator();
        Product[] expected = { product1, product, product2};

        ComparatorDemo.SortGoods(prod,cmp);

        assertEquals(prod, expected);
    }
}
