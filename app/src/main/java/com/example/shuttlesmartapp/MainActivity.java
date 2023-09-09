package com.example.shuttlesmartapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnManageEmployees = findViewById(R.id.btnManageEmployees);
        Button btnProjects = findViewById(R.id.btnManageProjects);


        btnManageEmployees.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { openEmployeeManager(); }
        });

//        btnProjects.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) { openCustomerManager(); }
//        });

    }


    public void openEmployeeManager() {
        Intent intent = new Intent(this, EmployeeManager.class);
        startActivity(intent);
    }

//    Create Project Manager class, link it to project manager layout

//    public void openProjectManager() {
//        Intent intent = new Intent(this, ProjectManager.class);
//        startActivity(intent);
//    }
}