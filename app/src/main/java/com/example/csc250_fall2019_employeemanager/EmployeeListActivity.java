package com.example.csc250_fall2019_employeemanager;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class EmployeeListActivity extends AppCompatActivity {

    ListView employeeList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout linearLayout = new LinearLayout(this);


        this.employeeList = this.findViewById(R.id.employeeLV);





        if (Core.theEmployees.size() > 0)





        {


           Core.generateNameList();
           ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Core.theEmployeeNames);
           this.employeeList.setAdapter(adapter);


        }
    }
}