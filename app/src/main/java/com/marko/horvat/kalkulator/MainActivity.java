package com.marko.horvat.kalkulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9,btn_0,btn_Add,btn_Sub,btn_Mul,btn_Div,btn_calc,btn_dec,btn_clear,button_back,
            button_sqrt, button_pow;
    EditText ed1;
    TextView text1,text2;

    double Value1, Value2;
    double res ;
   char op;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_0 = (Button) findViewById(R.id.btn_0);
        btn_1 = (Button) findViewById(R.id.btn_1);
        btn_2 = (Button) findViewById(R.id.btn_2);
        btn_3 = (Button) findViewById(R.id.btn_3);
        btn_4 = (Button) findViewById(R.id.btn_4);
        btn_5 = (Button) findViewById(R.id.btn_5);
        btn_6 = (Button) findViewById(R.id.btn_6);
        btn_7 = (Button) findViewById(R.id.btn_7);
        btn_8 = (Button) findViewById(R.id.btn_8);
        btn_9 = (Button) findViewById(R.id.btn_9);
        btn_Add = (Button) findViewById(R.id.btn_Add);
        btn_Div = (Button) findViewById(R.id.btn_Div);
        btn_Sub = (Button) findViewById(R.id.btn_Sub);
        btn_Mul = (Button) findViewById(R.id.btn_Mul);
        btn_calc = (Button) findViewById(R.id.btn_calc);
        btn_dec = (Button) findViewById(R.id.btn_dec);
        btn_clear = (Button) findViewById(R.id.btn_clear);
        button_back =(Button) findViewById(R.id.button_back);
        button_sqrt= (Button ) findViewById(R.id.button_sqrt);
        button_pow= (Button) findViewById(R.id.button_pow);
       ed1 = (EditText) findViewById(R.id.edText1);
        text1 = (TextView) findViewById(R.id.tvText1);
        text2 = (TextView) findViewById(R.id.tvText2);






        button_sqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              Value1= Double.parseDouble(ed1.getText().toString());
                 res = Math.sqrt(Value1);
                 ed1.setText(res+"");
                text2.setText(ed1.getText().toString());


            }
        });

        button_pow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               double Value1=Double.parseDouble(ed1.getText().toString());
                ed1.setText( (Value1 * Value1 + ""));
                text2.setText(ed1.getText().toString());


            }
        });





        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             if (   !ed1.getText().toString().equals("") )

                {
                    String value=ed1.getText().toString();
                if (value.length()>0)
                {value=value.substring(0,value.length()-1);
                ed1.setText(value);

                }
                }

            }
        });



        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"0");

                text2.setText(ed1.getText().toString());

            }
        });

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"1");
                text2.setText(ed1.getText().toString());

            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"2");
                text2.setText(ed1.getText().toString());
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"3");
                text2.setText(ed1.getText().toString());
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"4");
                text2.setText(ed1.getText().toString());
            }
        });

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"5");
                text2.setText(ed1.getText().toString());
            }
        });

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"6");
                text2.setText(ed1.getText().toString());
            }
        });

        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"7");
                text2.setText(ed1.getText().toString());
            }
        });

        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"8");
                text2.setText(ed1.getText().toString());
            }
        });

        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"9");
                text2.setText(ed1.getText().toString());
            }
        });

        btn_dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+".");

            }
        });

        btn_Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                    Value1 = Double.parseDouble(ed1.getText().toString());
                    op= '+';
                    text1.setText( ed1.getText().toString() + " + ");



                    ed1.setText("");

            }
        });

        btn_Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Value1 = Double.parseDouble(ed1.getText().toString());
                op= '-';
                text1.setText( ed1.getText().toString() + " - ");

                ed1.setText("");
            }
        });

        btn_Mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Value1 = Double.parseDouble(ed1.getText().toString());
                op= '*';
                text1.setText( ed1.getText().toString() + " * ");

                ed1.setText("");


                

            }
        });

        btn_Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Value1 = Double.parseDouble(ed1.getText().toString());
                op= '/';
                text1.setText( ed1.getText().toString() + " / ");

                ed1.setText("");

            }
        });

        btn_calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Value2 =Double.parseDouble(ed1.getText().toString() );

             switch (op) {
                 case '+':
                     res = Value1 + Value2;
                     ed1.setText(res + "");
                     break;
                 case '-':
                     res = Value1 - Value2;
                     ed1.setText(res + "");
                     break;
                 case '*':
                     res = Value1 * Value2;
                     ed1.setText(res + "");
                     break;

                 case '/':
                     res = Value1 / Value2;
                     ed1.setText(res + "");
                     break;



             }
            }
        });

        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                ed1.setText("0");
            }
        });
    }

}