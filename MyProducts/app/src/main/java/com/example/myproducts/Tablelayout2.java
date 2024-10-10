package com.example.myproducts;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class Tablelayout2 extends AppCompatActivity {

    ArrayList<Product> products=new ArrayList<>();
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tablelayout2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        EditText code = findViewById(R.id.edtProductCode);
        EditText name = findViewById(R.id.edtProductName);
        EditText price = findViewById(R.id.edtproductPrice);
        Button btnAddProduct=findViewById(R.id.btnAddProduct);
        btnAddProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                products.add(new Product(code.getText().toString(), name.getText().toString(), price.getText().toString()));
                code.setText("");
                name.setText("");
                price.setText("");
            }
        });
        Button btnCancel = findViewById(R.id.btnCancel);
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                code.setText("");
                name.setText("");
                price.setText("");
            }
        });
        Button btnShowProducts = findViewById(R.id.btnShowProducts);
        TextView txtProducts = findViewById(R.id.txtProducts);
        btnShowProducts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtProducts.setText("");
                for (Product product : products)
                {
                    txtProducts.setText(txtProducts.getText().toString()+"\n"+product);
                }
            }
        });
    }
}