package com.protoyanto.manaratian_studentjournal.Categorys;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.protoyanto.manaratian_studentjournal.CseView.CseViewCategory;
import com.protoyanto.manaratian_studentjournal.R;

public class DepartmentActivity extends AppCompatActivity {

    private Button cseViewBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_department);
    }

    public void onCLickCSE(View view) {

        Intent intent = new Intent(this, CseViewCategory.class);
        cseViewBtn = findViewById(R.id.cseViewBtn);
        startActivity(intent);
    }
}
