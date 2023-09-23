package com.example.helloword;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
        final String TAG="MainActivity Lifecycle";
        Button btnSub1,btnSub2,btnCls;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.baitap_2_5);
            btnSub1=findViewById(R.id.manHinhPhu1);
            btnSub2=findViewById(R.id.manHinhPhu2);
            btnCls=findViewById(R.id.dongLai);
            btnCls.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v) {
                    finish();
                }
            });
            btnSub1.setOnClickListener(new View.OnClickListener() {
                                                   @Override
                                                   public void onClick(View v) {
                                                       Intent intent1= new
                                                               Intent(MainActivity.this,SubActivity1.class);
                                                       startActivity(intent1);
                                                   }
                                               });
            btnSub2.setOnClickListener(new
                                               View.OnClickListener() {
                                                   @Override
                                                   public void onClick(View v) {
                                                       Intent intent2= new
                                                               Intent(MainActivity.this,SubActivity2.class);
                                                       startActivity(intent2);
                                                   }
                                               });
        }
        protected void onRestart(){
            super.onRestart();
            Toast.makeText(this,"đang gọi tới MainActivity.onRestart",
                    Toast.LENGTH_SHORT).show();
            Log.d(TAG, "===== onRestart =====");
        }
        @Override
        protected void onStart() {
            super.onStart();
        }
        @Override
        protected void onResume() {
            super.onResume();
        }
        @Override
        protected void onPause() {
            super.onPause();
        }
        @Override
        protected void onStop() {
            super.onStop(); }
        @Override
        protected void onDestroy() {
            super.onDestroy();
        }
    }

//    Button button;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.baitap_2_5);
//
//        // Referencing and Initializing the button
//        button = (Button) findViewById(R.id.manHinhPhu1);
//
//        // Setting onClick behavior to the button
//        button.setOnClickListener(new View.OnClickListener() {
//            @SuppressLint("ResourceType")
//            @Override
//            public void onClick(View view) {
//                // Initializing the popup menu and giving the reference as current context
//                PopupMenu popupMenu = new PopupMenu(MainActivity.this, button);
//
//                // Inflating popup menu from popup_menu.xml file
//                popupMenu.getMenuInflater().inflate(R.layout.popupmanhinh, popupMenu.getMenu());
//                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
//                    @Override
//                    public boolean onMenuItemClick(MenuItem menuItem) {
//                        // Toast message on menu item clicked
//                        Toast.makeText(MainActivity.this, "You Clicked " + menuItem.getTitle(), Toast.LENGTH_SHORT).show();
//                        return true;
//                    }
//                });
//                // Showing the popup menu
//                popupMenu.show();
//            }
//        });
//    }
}