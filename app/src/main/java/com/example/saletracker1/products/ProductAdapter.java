package com.example.saletracker1.products;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.saletracker1.R;

import java.util.ArrayList;

public class ProductAdapter extends ArrayAdapter<Products> implements View.OnClickListener {

    private ArrayList<Products> products;
    Context mContext;

    // View lookup cache
    private static class ViewHolder {

        TextView productId;
        TextView productName;
        TextView productRate;
        TextView productQuantity;
        TextView productOwner;
    }

    public ProductAdapter(ArrayList<Products> data, Context context) {
        super(context, R.layout.product_list_row, data);
        this.products = data;
        this.mContext=context;

    }
    @Override
    public void onClick(View v) {

        int position=(Integer) v.getTag();
        Object object= getItem(position);
        Products dataModel=(Products) object;

        switch (v.getId())
        {
//            case R.id.item_info:
//                Snackbar.make(v, "Release date " +dataModel.getFeature(), Snackbar.LENGTH_LONG)
//                        .setAction("No action", null).show();
//                break;
        }
    }

    private int lastPosition = -1;

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Products product = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        ViewHolder viewHolder; // view lookup cache stored in tag

        final View result;

        if (convertView == null) {

            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.product_list_row, parent, false);

            viewHolder.productId = (TextView) convertView.findViewById(R.id.product_id);
            viewHolder.productName = (TextView) convertView.findViewById(R.id.product_name);
            viewHolder.productRate = (TextView) convertView.findViewById(R.id.product_rate);
            viewHolder.productQuantity = (TextView) convertView.findViewById(R.id.product_quantity);
            viewHolder.productOwner = (TextView) convertView.findViewById(R.id.product_manufacturer);

            result=convertView;

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
            result=convertView;
        }

        Animation animation = AnimationUtils.loadAnimation(mContext, (position > lastPosition) ? R.anim.up_from_bottom : R.anim.down_from_top);
        result.startAnimation(animation);
        lastPosition = position;

        viewHolder.productId.setText(String.format("%d", product.getId()));
        viewHolder.productName.setText(product.getProductName());
        viewHolder.productRate.setText(String.format("%d", product.getRate()));
        viewHolder.productQuantity.setText(String.format("%d",product.getQuantity()));
        viewHolder.productOwner.setText(product.getManufacturer());
//        viewHolder.info.setOnClickListener(this);
//        viewHolder.info.setTag(position);
        // Return the completed view to render on screen
        return convertView;
    }

}
