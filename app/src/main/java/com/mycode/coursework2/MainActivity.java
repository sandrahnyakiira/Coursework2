package com.mycode.coursework2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText fname = (EditText)findViewById(R.id.editText);
        final EditText lname = (EditText)findViewById(R.id.editText2);
        final TextView txt1 = (TextView)findViewById(R.id.textView3);
        Button btn1=(Button)findViewById(R.id.display);
        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String fn=fname.getText().toString();
                String ln = lname.getText().toString();

                String outpt ="Hey your name is " +fn+" "+ln;
                txt1.setText(outpt);



            }
        });
    }
}
