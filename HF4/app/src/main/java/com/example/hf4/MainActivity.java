package com.example.hf4;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    String[] shortCurrencyArray = {
            "EUR",
            "USD",
            "GBP",
            "AUD",
            "CAD",
            "CHF",
            "DKK",
            "HUF"
    };
    String[] currencyArray = {
            "Euro",
            "Dolar american",
            "Lira sterlina",
            "Dolar australian",
            "Dolar canadian",
            "Franc elvetion",
            "Coroana daneza",
            "forint maghiar"
    };
    Integer[] imageFlagsArray = {
            R.drawable.australia,
            R.drawable.canada,
            R.drawable.denmark,
            R.drawable.us,
            R.drawable.uk,
            R.drawable.europe,
            R.drawable.hungary,
            R.drawable.switzerland
    };
    String[] toBuyArray = {
            "4,4100 RON",
            "3,6750 RON",
            "6,1250 RON",
            "2,9600 RON",
            "3,0950 RON",
            "4,2300 RON",
            "0,5850 RON",
            "0,0136 RON"
    };
    String[] toSellArray = {
            "4,5500 RON",
            "4,1450 RON",
            "6,3550 RON",
            "3,0600 RON",
            "3,2650 RON",
            "4,3300 RON",
            "0,6150 RON",
            "0,0146 RON"
,    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ListView list = findViewById(R.id.customListview);
        CustomAdapter adapter = new CustomAdapter(this,shortCurrencyArray,currencyArray,imageFlagsArray,toBuyArray,toSellArray);
        list.setAdapter(adapter);

        list.setOnItemClickListener( new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView textBuy = view.findViewById(R.id.textBuy);
                TextView txtToBuy = view.findViewById(R.id.txtToBuy);
                TextView txtCurrencyShort = view.findViewById(R.id.txtCurrencyShort);
                
                textBuy.setVisibility(View.VISIBLE);
                txtToBuy.setVisibility(View.VISIBLE);
                txtCurrencyShort.setVisibility(View.VISIBLE);
            } } );
    }
}