package com.example.calci;
//author: Aakash Solanki
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity {

    ImageButton btnbackspace;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnC, btnplus, btnminus, btnmultiply, btndivide, btnequals, btnpercentage, btndecimal, btnbracket;
    TextView tvinput, tvoutput;
    String process;
    boolean checkbracket=true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0=(Button) findViewById(R.id.btn_Zero);
        btn1=(Button) findViewById(R.id.btn_One);
        btn2=(Button) findViewById(R.id.btn_Two);
        btn3=(Button) findViewById(R.id.btn_Three);
        btn4=(Button) findViewById(R.id.btn_Four);
        btn5=(Button) findViewById(R.id.btn_Five);
        btn6=(Button) findViewById(R.id.btn_Six);
        btn7=(Button) findViewById(R.id.btn_Seven);
        btn8=(Button) findViewById(R.id.btn_Eight);
        btn9=(Button) findViewById(R.id.btn_Nine);
        btnplus=(Button) findViewById(R.id.btn_Plus);
        btnminus=(Button) findViewById(R.id.btn_Minus);
        btnmultiply=(Button) findViewById(R.id.btn_Multiply);
        btndivide=(Button) findViewById(R.id.btn_Divide);
        btnequals=(Button) findViewById(R.id.btn_Equal);
        btnC=(Button) findViewById(R.id.btn_Clear);
        btnpercentage=(Button) findViewById(R.id.btn_Percentage);
        btnbackspace=(ImageButton) findViewById(R.id.btn_Backspace);
        btndecimal=(Button) findViewById(R.id.btn_Decimal);
        btnbracket=(Button) findViewById(R.id.btn_Brackets);
        tvinput=(TextView) findViewById(R.id.tv_userInput);
        tvoutput=(TextView) findViewById(R.id.tv_userResult);

        btnequals.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        process=tvinput.getText().toString();

                        process=process.replaceAll("%", "/100");
                        Context rhino= Context.enter();
                        rhino.setOptimizationLevel(-1);
                        String ans="";
                        try{
                            Scriptable Scriptable = rhino.initStandardObjects();
                            ans= rhino.evaluateString(Scriptable ,process, "javascript", 1, null).toString();
                        }catch (Exception e){
                            ans="Invalid input";
                        }
                        tvoutput.setText(ans);
                    }

                }
        );
        btnC.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v){
                        tvinput.setText("");
                        tvoutput.setText("");
                        checkbracket=true;
                    }
                });

        btn0.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        process=tvinput.getText().toString();
                        tvinput.setText(process+"0");
                    }
                }
        );
        btn1.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        process=tvinput.getText().toString();
                        tvinput.setText(process+"1");
                    }
                }
        );
        btn2.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        process=tvinput.getText().toString();
                        tvinput.setText(process+"2");
                    }
                }
        );
        btn3.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        process=tvinput.getText().toString();
                        tvinput.setText(process+"3");
                    }
                }
        );
        btn4.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        process=tvinput.getText().toString();
                        tvinput.setText(process+"4");
                    }
                }
        );
        btn5.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        process=tvinput.getText().toString();
                        tvinput.setText(process+"5");
                    }
                }
        );
        btn6.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        process=tvinput.getText().toString();
                        tvinput.setText(process+"6");
                    }
                }
        );
        btn7.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        process=tvinput.getText().toString();
                        tvinput.setText(process+"7");
                    }
                }
        );
        btn8.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        process=tvinput.getText().toString();
                        tvinput.setText(process+"8");
                    }
                }
        );
        btn9.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        process=tvinput.getText().toString();
                        tvinput.setText(process+"9");
                    }
                }
        );
        btnplus.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        process=tvinput.getText().toString();
                        tvinput.setText(process+"+");
                    }
                }
        );
        btnminus.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        process=tvinput.getText().toString();
                        tvinput.setText(process+"-");
                    }
                }
        );
        btnmultiply.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        process=tvinput.getText().toString();
                        tvinput.setText(process+"*");
                    }
                }
        );
        btndivide.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        process=tvinput.getText().toString();
                        tvinput.setText(process+"/");
                    }
                }
        );
        btndecimal.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        process=tvinput.getText().toString();
                        tvinput.setText(process+".");
                    }
                }
        );
        btnpercentage.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        process=tvinput.getText().toString();
                        tvinput.setText(process+"%");
                    }
                }
        );
        btnbackspace.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        process=tvinput.getText().toString();
                        if(process.length()>0) {
                            String p = process.substring(0, process.length() - 1);
                            process = p;
                        }
                        tvinput.setText(process);
                    }
                }
        );
        btnbracket.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        if(checkbracket){
                            process=tvinput.getText().toString();
                            tvinput.setText(process+"(");
                            checkbracket=false;
                        }
                        else{
                            process=tvinput.getText().toString();
                            tvinput.setText(process+")");
                            checkbracket=true;
                        }
                    }
                }
        );

    }
}