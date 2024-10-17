package com.example.hf4;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class CustomAdapter extends ArrayAdapter {
    private Activity context;
    private Integer[] imageFlagsArray;
    private String[] shortCurrencyArray;
    private String[] currencyArray;
    private String[] toBuyArray;
    private String[] toSellArray;

    public CustomAdapter(@NonNull Activity context, String[] currencies, String[] shortCurrencies, Integer[] images,String[] buys,String[] sells) {
        super(context, R.layout.listview_row,currencies);
        this.context=context;
        this.shortCurrencyArray = currencies;
        this.currencyArray = shortCurrencies;
        this.imageFlagsArray=images;
        this.toBuyArray=buys;
        this.toSellArray=sells;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View view = inflater.inflate(R.layout.listview_row,null,true);
        TextView name=view.findViewById(R.id.txtCurrencyShort);
        TextView info=view.findViewById(R.id.txtCurrency);
        ImageView image=view.findViewById(R.id.imageFlag);
        TextView buy=view.findViewById(R.id.txtToBuy);
        TextView sell=view.findViewById(R.id.txtToSell);
        name.setText(shortCurrencyArray[position]);
        info.setText(currencyArray[position]);
        image.setImageResource(imageFlagsArray[position]);
        buy.setText(toBuyArray[position]);
        sell.setText(toSellArray[position]);
        return view;
    }

}
