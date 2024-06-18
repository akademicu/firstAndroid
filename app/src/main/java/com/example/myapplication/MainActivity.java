package com.example.myapplication;


import android.annotation.SuppressLint;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button addBut, subBut, divBut, multiBut;
    EditText editText1, editText2;
    TextView textView;
    int num1, num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addBut = findViewById(R.id.add_Btn);
        subBut = findViewById(R.id.sub_Btn);
        divBut = findViewById(R.id.div_Btn);
        multiBut = findViewById(R.id.multiply_Btn);
        editText1 = findViewById(R.id.number_1);
        editText2 = findViewById(R.id.number_2);
        textView = findViewById(R.id.answer);

        addBut.setOnClickListener(this);
        subBut.setOnClickListener(this);
        divBut.setOnClickListener(this);
        multiBut.setOnClickListener(this);
    }

    private int getNUmber(EditText editText){
        if(editText.getText().toString().isEmpty()){
            Toast.makeText(this,"Insert a number",Toast.LENGTH_SHORT).show();
            return 0;
        }
        return Integer.parseInt(editText.getText().toString());
    }

    @SuppressLint({"SetTextI18n", "NonConstantResourceId"})
    @Override
    public void onClick(View v) {
        num1 = getNUmber(editText1);
        num2 = getNUmber(editText2);
        switch (v.getId()){
            case R.id.add_Btn:
                textView.setText("Answer = "+(num1+num2));
                break;
            case R.id.sub_Btn:
                textView.setText("Answer = "+(num1-num2));
                break;
            case R.id.multiply_Btn:
                textView.setText("Answer = "+(num1*num2));
                break;
            case R.id.div_Btn:
                textView.setText("Answer = "+((float)num1/(float) num2));
                break;
            default:
        }

    }
}