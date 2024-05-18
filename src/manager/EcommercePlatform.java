package manager;

import entity.Product;
import service.Order;
import service.PaymentMethod;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EcommercePlatform implements Order, PaymentMethod {


   static List<Product> orderList = new ArrayList<>();

   static{
       orderList.add(new Product(1,"Koynek",30));
       orderList.add(new Product(2,"Komputer",2000));
       orderList.add(new Product(3,"Canta",50));
       orderList.add(new Product(4,"Ayaqqabi",80));
       orderList.add(new Product(5,"Soyuducu",2500));
       orderList.add(new Product(6,"Telefon",1200));
   }


    @Override
    public void addProduct(Product product) {
        orderList.add(product);
    }

    @Override
    public void deleteProduct(int id) {
        orderList.remove(id);
    }

    @Override
    public List<Product> totalProducts() {
        return orderList;
    }

    @Override
    public Product getProduct(int id) {
         return orderList.get(id);
    }

    @Override
    public double processPayment() {
        double sum = 0;
        for(Product product : orderList){
            sum += product.getProductPrice();
        }
        return sum;
    }

    public void helloWorld() {

    }
}
