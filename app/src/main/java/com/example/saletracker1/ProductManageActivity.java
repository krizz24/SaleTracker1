package com.example.saletracker1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.saletracker1.products.ProductAdapter;
import com.example.saletracker1.products.Products;

import java.util.ArrayList;

public class ProductManageActivity extends AppCompatActivity {

    ArrayList<Products> products;
    ListView listView;
    private static ProductAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_manage);

        listView=(ListView)findViewById(R.id.products_listview);

        products = new ArrayList<>();


        products.add(new Products(1, "Product1", 100, 5, "Owner1"));
        products.add(new Products(2, "Product2", 100, 5, "Owner2"));
        products.add(new Products(3, "Product3", 100, 5, "Owner3"));
        products.add(new Products(4, "Product4", 100, 5, "Owner4"));
        products.add(new Products(5, "Product5", 100, 5, "Owner5"));
        products.add(new Products(6, "Product6", 100, 5, "Owner6"));
        products.add(new Products(7, "Product7", 100, 5, "Owner7"));
        products.add(new Products(8, "Product8", 100, 5, "Owner8"));
        products.add(new Products(9, "Product9", 100, 5, "Owner9"));
        products.add(new Products(10, "Product10", 100, 5, "Owner10"));
        products.add(new Products(11, "Product11", 100, 5, "Owner11"));
        products.add(new Products(12, "Product12", 100, 5, "Owner12"));
        products.add(new Products(13, "Product13", 100, 5, "Owner13"));
        products.add(new Products(14, "Product14", 100, 5, "Owner14"));
        products.add(new Products(15, "Product15", 100, 5, "Owner15"));
        products.add(new Products(16, "Product16", 100, 5, "Owner16"));
        products.add(new Products(17, "Product17", 100, 5, "Owner17"));
        products.add(new Products(18, "Product18", 100, 5, "Owner18"));

        adapter= new ProductAdapter(products,getApplicationContext());

        listView.setAdapter(adapter);


        ImageView plusButton=findViewById(R.id.cart_plus_img);
        ImageView minusButton=findViewById(R.id.cart_minus_img);

    }
}
