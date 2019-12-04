package com.mohannad.assigment.assigment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.mohannad.assigment.R;

import java.util.ArrayList;
import java.util.List;

public class StudentListActivity extends AppCompatActivity {
    List<Student> studentList = new ArrayList<>();
    RecyclerView students_rv;
    StudentAdapter studentsAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_list);

        initData();

        students_rv = findViewById(R.id.students_rv);
        students_rv.setLayoutManager(new LinearLayoutManager(this));
        studentsAdapter = new StudentAdapter(this , studentList);
        students_rv.setAdapter(studentsAdapter);
    }

    private void initData() {
        studentList.add(new Student("Mohannad","4" , "21" , "B.A."));
        studentList.add(new Student("Khaled","2" , "19" , "B.A."));
        studentList.add(new Student("Omar","1" , "18" , "B.A."));
        studentList.add(new Student("Amin","2" , "19" , "B.A."));

    }
}
