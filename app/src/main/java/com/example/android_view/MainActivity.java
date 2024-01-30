package com.example.android_view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android_view.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = activityMainBinding.getRoot();
        setContentView(view);

//        setContentView(R.layout.activity_main);

        // Bước2: Khai báo và ánh xạ view
        TextView tvTitle = findViewById(R.id.tv_title);  // Khai báo và ánh xạ view
        // Bước3: Xử lý logic và sự kiện
         tvTitle.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Toast.makeText(MainActivity.this, "Tự học lập trình android", Toast.LENGTH_LONG).show();
             }
         });

         activityMainBinding.linearLayout.setOnClickListener(mView -> {
             Intent intent = new Intent(this, LinearLayout.class);
             startActivity(intent);
         });


        activityMainBinding.relativeLayout.setOnClickListener(mView -> {
            Intent intent = new Intent(this, RelativeLayout.class);
            startActivity(intent);
        });

        activityMainBinding.frameLayout.setOnClickListener(mView -> {
            Intent intent = new Intent(this, FrameLayout.class);
            startActivity(intent);
        });

        activityMainBinding.tableLayout.setOnClickListener(mView -> {
            Intent intent = new Intent(this, TableLayout.class);
            startActivity(intent);
        });


    }
}