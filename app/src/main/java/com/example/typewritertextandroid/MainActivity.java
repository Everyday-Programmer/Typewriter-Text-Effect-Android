package com.example.typewritertextandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.nitish.typewriterview.TypeWriterView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TypeWriterView typeWriterView = findViewById(R.id.typeWriter);
        TextInputEditText editText = findViewById(R.id.et);
        MaterialButton animate = findViewById(R.id.animate);

        animate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                typeWriterView.animateText(editText.getText().toString());
                editText.setText("");
            }
        });
    }
}