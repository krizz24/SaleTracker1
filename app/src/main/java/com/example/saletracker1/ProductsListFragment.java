package com.example.saletracker1;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

public class ProductsListFragment extends Fragment {

    private ListView listview;
    ProductActivity productActivity;
    private String productCategory;

    //ProgressDialog progessDialog;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        productActivity = (ProductActivity) getActivity();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater
                .inflate(R.layout.product_list_row, container, false);
        productCategory = productActivity.getProducts_category();

        //listview = (ListView) rootView.findViewById(R.id.products_listview);

        //ProductActivity.getSupportActionBar().setTitle(productCategory);
        // selecting single ListView item
        ListView lv = listview;
        // listening to single listitem click
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
            }
        });
        return rootView;
    }

    private boolean isProductlistRetrieved = false;

    public boolean isProductlistRetrieved() {
        return isProductlistRetrieved;
    }

    public void setProductlistRetrieved(boolean isProductlistRetrieved) {
        this.isProductlistRetrieved = isProductlistRetrieved;
    }


}
