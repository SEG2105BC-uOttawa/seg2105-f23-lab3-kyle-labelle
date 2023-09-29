package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private enum Operator {none, add, sub, mul, div};
    private double data1 = 0, data2 = 0;
    private Operator optr = Operator.none;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btn00Click(View view) {
        TextView resultText = findViewById(R.id.resultEdit);
        resultText.setText(resultText.getText() + "0");
    }

    public void btn01Click(View view) {
        TextView resultText = findViewById(R.id.resultEdit);
        resultText.setText(resultText.getText() + "1");
    }

    public void btn02Click(View view) {
        TextView resultText = findViewById(R.id.resultEdit);
        resultText.setText(resultText.getText() + "2");
    }

    public void btn03Click(View view) {
        TextView resultText = findViewById(R.id.resultEdit);
        resultText.setText(resultText.getText() + "3");
    }

    public void btn04Click(View view) {
        TextView resultText = findViewById(R.id.resultEdit);
        resultText.setText(resultText.getText() + "4");
    }

    public void btn05Click(View view) {
        TextView resultText = findViewById(R.id.resultEdit);
        resultText.setText(resultText.getText() + "5");
    }

    public void btn06Click(View view) {
        TextView resultText = findViewById(R.id.resultEdit);
        resultText.setText(resultText.getText() + "6");
    }

    public void btn07Click(View view) {
        TextView resultText = findViewById(R.id.resultEdit);
        resultText.setText(resultText.getText() + "7");
    }

    public void btn08Click(View view) {
        TextView resultText = findViewById(R.id.resultEdit);
        resultText.setText(resultText.getText() + "8");
    }

    public void btn09Click(View view) {
        TextView resultText = findViewById(R.id.resultEdit);
        resultText.setText(resultText.getText() + "9");
    }

    public void btnDecClick(View view) {
        TextView resultText = findViewById(R.id.resultEdit);
        resultText.setText(resultText.getText() + ".");
    }

    public void btnCeClick(View view) {
        TextView resultText = findViewById(R.id.resultEdit);
        resultText.setText("");
    }

    public void btnAddClick(View view) {
        optr = Operator.add;
        TextView resultText = findViewById(R.id.resultEdit);
        data1 = Double.parseDouble(resultText.getText().toString());
        resultText.setText("");
    }

    public void btnSubClick(View view) {
        optr = Operator.sub;
        TextView resultText = findViewById(R.id.resultEdit);
        data1 = Double.parseDouble(resultText.getText().toString());
        resultText.setText("");
    }

    public void btnMulClick(View view) {
        optr = Operator.mul;
        TextView resultText = findViewById(R.id.resultEdit);
        data1 = Double.parseDouble(resultText.getText().toString());
        resultText.setText("");
    }

    public void btnDivClick(View view) {
        optr = Operator.div;
        TextView resultText = findViewById(R.id.resultEdit);
        data1 = Double.parseDouble(resultText.getText().toString());
        resultText.setText("");
    }

    public void btnEqlClick(View view) {
        if (optr != Operator.none) {
            TextView resultText = findViewById(R.id.resultEdit);
            data2 = Double.parseDouble(resultText.getText().toString());
            double result = 0;
            if (optr == Operator.add) {
                result = data1 + data2;
            } else if (optr == Operator.sub) {
                result = data1 - data2;
            } else if (optr == Operator.mul) {
                result = data1 * data2;
            } else if (optr == Operator.div) {
                result = data1 / data2;
            }
            optr = Operator.none;
            data1 = result;

            if((result - (int)result) != 0)
                resultText.setText(String.valueOf(result));
            else
                resultText.setText(String.valueOf((int)result));

            resultText.setText(String.valueOf(result));
        }
    }
}