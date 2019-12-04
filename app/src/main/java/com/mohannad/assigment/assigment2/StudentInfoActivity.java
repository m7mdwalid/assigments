package com.mohannad.assigment.assigment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.mohannad.assigment.R;

public class StudentInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_info);
        TextView name_student = findViewById(R.id.name_student);
        TextView age_student = findViewById(R.id.age_student);
        TextView degree_student = findViewById(R.id.degree_student);
        TextView level_student = findViewById(R.id.level_student);
        String name = getIntent().getStringExtra("name");
        String level = getIntent().getStringExtra("level");
        String age = getIntent().getStringExtra("age");
        String degree = getIntent().getStringExtra("degree");

        name_student.append(name);
        age_student.append(age);
        degree_student.append(degree);
        level_student.append(level);
    }
}
