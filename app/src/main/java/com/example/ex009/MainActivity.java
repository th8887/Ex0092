package com.example.ex009;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button btn,b,e,s,c;
    int n1,n2,count,sum0,t,sum;
    TextView tv1,tv2,tv3,tv4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=(Button) findViewById(R.id.btn);
        b=(Button) findViewById(R.id.button4);
        b.setText(">");
        e=(Button) findViewById(R.id.button3);
        e.setText("=");
        s=(Button) findViewById(R.id.button2);
        s.setText("<");
        c=(Button) findViewById(R.id.button5);

        tv1=(TextView) findViewById(R.id.tv1);
        tv2=(TextView) findViewById(R.id.tv2);
        tv3=(TextView) findViewById(R.id.tv3);
        tv4=(TextView) findViewById(R.id. tv4);

    }
    public static Random r=new Random();
    public void press(View view) {
        n1=r.nextInt(101);
        n2=r.nextInt(101);
        tv1.setText("number"+n1);
        tv2.setText("number"+n2);
        sum0++;
        t=0;
    }

    public void checkb(View view) {
        if ((n1>n2)){
            tv4.setText("true");
        }
        else {
            tv4.setText("false");
            if(t<1) {
                t++;
                count++;
            }
        }
        sum=Math.abs(((sum0-count)*100)/sum0);
        if(sum==0)
            tv3.setText("100%");
        else
            tv3.setText(Math.abs(((sum0-count)*100)/sum0)+"%");
    }

    public void checke(View view) {
        if(n1==n2){
            tv4.setText("true");
        }
        else {
            tv4.setText("false");
            if(t<1) {
                t++;
                count++;
            }
        }
        sum=Math.abs(((sum0-count)*100)/sum0);
        if(sum==0)
            tv3.setText("100%");
        else
            tv3.setText(Math.abs(((sum0-count)*100)/sum0)+"%");
    }

    public void checks(View view) {
        if (n1 < n2) {
            tv4.setText("true");
        }
        else{
            tv4.setText("false");
            if(t<1) {
                t++;
                count++;
            }
        }
        sum=Math.abs(((sum0-count)*100)/sum0);
        if(sum==0)
            tv3.setText("100%");
        else
            tv3.setText(Math.abs(((sum0-count)*100)/sum0)+"%");
    }

    public void clear(View view) {
        tv3.setText(" ");
        tv4.setText("0%");
        tv1.setText("0");
        tv2.setText("0");
        count=0;
        sum0=0;
    }
}

