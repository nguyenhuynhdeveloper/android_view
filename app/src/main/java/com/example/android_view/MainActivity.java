package com.example.android_view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Bước2: Khai báo và ánh xạ view
        TextView tvTitle = findViewById(R.id.tv_title);  // Khai báo và ánh xạ view
        // Bước3: Xử lý logic và sự kiện
         tvTitle.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Toast.makeText(MainActivity.this, "Tự học lập trình android", Toast.LENGTH_LONG).show();
             }
         });

    }
}