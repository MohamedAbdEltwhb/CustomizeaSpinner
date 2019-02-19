package com.example.mm.customizeaspinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {


    Spinner cusstomSpinner;
    private ArrayList<CustomSpinnerItem> customList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cusstomSpinner = findViewById(R.id.customIconSpinner);

        customList = getCustomList();
        CustomSpinnerAdapter customAdapter=new CustomSpinnerAdapter(this, customList);

        if (cusstomSpinner != null) {
            cusstomSpinner.setAdapter(customAdapter);
            cusstomSpinner.setOnItemSelectedListener(this);
        }

    }

    private ArrayList<CustomSpinnerItem> getCustomList() {
        customList = new ArrayList<>();
        customList.add(new CustomSpinnerItem("lnljnljnljnlj"));
        customList.add(new CustomSpinnerItem("lnljnljnljnlj"));
        customList.add(new CustomSpinnerItem("lnljnljnljnlj"));
        customList.add(new CustomSpinnerItem("lnljnljnljnlj"));
        customList.add(new CustomSpinnerItem("lnljnljnljnlj"));
        customList.add(new CustomSpinnerItem("lnljnljnljnlj"));
        customList.add(new CustomSpinnerItem("lnljnljnljnlj"));
        customList.add(new CustomSpinnerItem("lnljnljnljnlj"));
        return customList;
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        CustomSpinnerItem item = (CustomSpinnerItem)parent.getSelectedItem();
        Toast.makeText(this, item.getSpinnerItemName(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
