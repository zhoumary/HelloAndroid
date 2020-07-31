package com.example.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.navigation.Navigation;

public class DisplayMessageActivity extends AppCompatActivity {

    private static String message = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.textView2);
        textView.setText(message);
    }

    public void goBack(View view) {
        Intent intent = new Intent();
        intent.putExtra("editTextValue", "Welcome back " + message);
        setResult(RESULT_OK, intent);
        finish();

//        // send message back to main page
//        Bundle bundle = new Bundle();
//        bundle.putString("message", "Welcome back " + message);
//        Navigation.findNavController(view).navigate(R.id.editTextTextPersonName2, bundle);
    }

    public void goDraw(View view) {
        Intent intent = new Intent(this, DrawActivity.class);
        startActivity(intent);
    }



}