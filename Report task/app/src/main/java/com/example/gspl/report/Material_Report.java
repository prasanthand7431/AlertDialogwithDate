package com.example.gspl.report;

import android.app.DatePickerDialog;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class Material_Report extends AppCompatActivity {

    DatePickerDialog datePickerDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.materialfloating);

    }

    public void flt(View view) {

        AlertDialog.Builder builder = new AlertDialog.Builder(Material_Report.this);

       LayoutInflater inflater = getLayoutInflater();
       View dialogView = inflater.inflate(R.layout.material_report, null);

        builder.setCancelable(true);

        builder.setView(dialogView);


        final Button btn_positive1 = (Button) dialogView.findViewById(R.id.bt2);


        final EditText et_name = (EditText) dialogView.findViewById(R.id.edit1);



        final AlertDialog dialog = builder.create();

        btn_positive1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final Calendar c = Calendar.getInstance();
                int mYear = c.get(Calendar.YEAR);
                int mMonth = c.get(Calendar.MONTH);
                int mDay = c.get(Calendar.DAY_OF_MONTH);

                datePickerDialog = new DatePickerDialog(Material_Report.this,
                        new DatePickerDialog.OnDateSetListener() {

                            @Override
                            public void onDateSet(DatePicker view, int year,
                                                  int monthOfYear, int dayOfMonth) {

                                btn_positive1.setText(dayOfMonth + "/"
                                        + (monthOfYear + 1) + "/" + year);

                            }
                        }, mYear, mMonth, mDay);
                datePickerDialog.show();



            }
        });




        final Button btn_positive5 = (Button) dialogView.findViewById(R.id.bt3);

        btn_positive5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Material_Report.this, "Success", Toast.LENGTH_SHORT).show();

            }
        });

        dialog.show();


        }


}

