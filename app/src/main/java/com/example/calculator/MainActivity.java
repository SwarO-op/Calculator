package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bp,bs,bm,bd,dot,be;
    Double var1,var2;
    Boolean add=false,sub=false,mul=false,div=false,lu=false;
    TextView tx;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b0=(Button)findViewById(R.id.b0);
        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
        b3=(Button)findViewById(R.id.b3);
        b4=(Button)findViewById(R.id.b4);
        b5=(Button)findViewById(R.id.b5);
        b6=(Button)findViewById(R.id.b6);
        b7=(Button)findViewById(R.id.b7);
        b8=(Button)findViewById(R.id.b8);
        b9=(Button)findViewById(R.id.b9);
        bp=(Button)findViewById(R.id.bp);
        bs=(Button)findViewById(R.id.bs);
        bm=(Button)findViewById(R.id.bm);
        bd=(Button)findViewById(R.id.bd);
        dot=(Button)findViewById(R.id.dot);
        be=(Button)findViewById(R.id.be);
        tx=(TextView)findViewById(R.id.tx);

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(lu==true)
                    tx.setText(null);
                tx.setText(tx.getText()+"0");
                lu=false;
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(lu==true)
                    tx.setText(null);
                tx.setText(tx.getText()+"1");
                lu=false;
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(lu==true)
                    tx.setText(null);
                tx.setText(tx.getText()+"2");
                lu=false;
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(lu==true)
                    tx.setText(null);
                tx.setText(tx.getText()+"3");
                lu=false;
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(lu==true)
                    tx.setText(null);
                tx.setText(tx.getText()+"4");
                lu=false;
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(lu==true)
                    tx.setText(null);
                tx.setText(tx.getText()+"5");
                lu=false;
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(lu==true)
                    tx.setText(null);
                tx.setText(tx.getText()+"6");
                lu=false;
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(lu==true)
                    tx.setText(null);
                tx.setText(tx.getText()+"7");
                lu=false;
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(lu==true)
                    tx.setText(null);
                tx.setText(tx.getText()+"8");
                lu=false;
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(lu==true)
                    tx.setText(null);
                tx.setText(tx.getText()+"9");
                lu=false;
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(lu==true)
                    tx.setText(null);
                tx.setText(tx.getText()+".");
                lu=false;
            }
        });
        bp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var1=Double.parseDouble(tx.getText()+"");
                add=true;
                lu=true;
                tx.setText(null);
                tx.setText(tx.getText()+"+");
            }
        });
        bs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var1=Double.parseDouble(tx.getText()+"");
                sub=true;
                lu=true;
                tx.setText(null);
                tx.setText(tx.getText()+"-");
            }
        });
        bm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var1=Double.parseDouble(tx.getText()+"");
                mul=true;
                lu=true;
                tx.setText(null);
                tx.setText(tx.getText()+"*");
            }
        });
        bd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var1=Double.parseDouble(tx.getText()+"");
                div=true;
                lu=true;
                tx.setText(null);
                tx.setText(tx.getText()+"/");
            }
        });


        be.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var2=Double.parseDouble(tx.getText()+"");
                if(add==true)
                {
                    tx.setText(var1+var2+"");
                    add=false;
                }
                if(sub==true)
                {
                    tx.setText(var1-var2+"");
                    sub=false;
                }
                if(mul==true)
                {
                    tx.setText(var1*var2+"");
                    mul=false;
                }
                if(div==true)
                {
                    tx.setText(var1/var2+"");
                    div=false;
                }
                lu=true;
            }
        });



    }
}
