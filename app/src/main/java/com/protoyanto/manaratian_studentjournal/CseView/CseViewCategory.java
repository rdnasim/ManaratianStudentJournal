package com.protoyanto.manaratian_studentjournal.CseView;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.protoyanto.manaratian_studentjournal.R;

public class CseViewCategory extends AppCompatActivity {

    ImageView facultyBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse_view_category);
    }

    public void onCLickFacultyBtn(View view) {
        Intent intent = new Intent(this, CseTeacherView.class);
        facultyBtn = findViewById(R.id.facultyBtn);
        startActivity(intent);
    }
}
