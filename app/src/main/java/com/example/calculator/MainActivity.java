package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView expn = (TextView) findViewById(R.id.txtExp);
    }

    public void Add0(View view) {
        TextView expn = (TextView) findViewById(R.id.txtExp);
        expn.setText(expn.getText().toString()+"0");
    }
    public void Add1(View view) {
        TextView expn = (TextView) findViewById(R.id.txtExp);
        expn.setText(expn.getText().toString()+"1");
    }
    public void Add2(View view) {
        TextView expn = (TextView) findViewById(R.id.txtExp);
        expn.setText(expn.getText().toString()+"2");
    }
    public void Add3(View view) {
        TextView expn = (TextView) findViewById(R.id.txtExp);
        expn.setText(expn.getText().toString()+"3");
    }
    public void Add4(View view) {
        TextView expn = (TextView) findViewById(R.id.txtExp);
        expn.setText(expn.getText().toString()+"4");
    }
    public void Add5(View view) {
        TextView expn = (TextView) findViewById(R.id.txtExp);
        expn.setText(expn.getText().toString()+"5");
    }
    public void Add6(View view) {
        TextView expn = (TextView) findViewById(R.id.txtExp);
        expn.setText(expn.getText().toString()+"6");
    }
    public void Add7(View view) {
        TextView expn = (TextView) findViewById(R.id.txtExp);
        expn.setText(expn.getText().toString()+"7");
    }
    public void Add8(View view) {
        TextView expn = (TextView) findViewById(R.id.txtExp);
        expn.setText(expn.getText().toString()+"8");
    }
    public void Add9(View view) {
        TextView expn = (TextView) findViewById(R.id.txtExp);
        expn.setText(expn.getText().toString()+"9");
    }
    public void Addition(View view) {
        TextView expn = (TextView) findViewById(R.id.txtExp);
        String str = expn.getText().toString();
        if(findIndexOpr(str) == -1 ){
            expn.setText(str+"+");
        }
    }
    public void Subtraction(View view) {
        TextView expn = (TextView) findViewById(R.id.txtExp);
        String str = expn.getText().toString();
        if(findIndexOpr(str) == -1 ){
            expn.setText(str+"-");
        }
    }
    public void Multiplication(View view) {
        TextView expn = (TextView) findViewById(R.id.txtExp);
        String str = expn.getText().toString();
        if(findIndexOpr(str) == -1 ){
            expn.setText(str+"*");
        }
    }
    public void Division(View view) {
        TextView expn = (TextView) findViewById(R.id.txtExp);
        String str = expn.getText().toString();
        if(findIndexOpr(str) == -1 ){
            expn.setText(str+"/");
        }
    }

    public void ShowResult(View view) {
        double result = 0;
        String str;
        TextView expn = (TextView) findViewById(R.id.txtExp);
        TextView restxt = (TextView) findViewById(R.id.txtRes);
        String exp = expn.getText().toString();
        int n = exp.length() - 1;
        int i = findIndexOpr(exp);
        if((i!=-1) || (i!=n)){
            char opr = exp.charAt(i);
            String a = exp.substring(0,i);
            //int x = Integer.parseInt(a);
            double x = Double.parseDouble(a);
            String b = exp.substring(i+1);
            //int y = Integer.parseInt(b);
            double y = Double.parseDouble(b);

            switch (opr) {
                case '+':
                    result = x + y;
                    break;
                case '-':
                    result = x - y;
                    break;
                case '*':
                    result = x * y;
                    break;
                case '/':
                    result = x / y;
                    break;
            }
            str = Double.toString(result);
        }else if(i==n){
            str =exp.substring(0,i);
        }else {
            str = exp;
        }
        restxt.setText(str);
    }

    public void ClearText(View view) {
        TextView expn = (TextView) findViewById(R.id.txtExp);
        expn.setText("");
    }

    public int findIndexOpr(String str){
        if(str.contains("+")){
            return str.indexOf("+");
        }
        else if(str.contains("-")){
            return  str.indexOf("-");
        }
        else if(str.contains("*")){
            return str.indexOf("*");
        }
        else if(str.contains("/")){
            return str.indexOf("/");
        }
        else {
            return -1;
        }
    }
}