package tech.deepmala.com.designing_xml;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText etNum1,etNum2;
    private TextView tvResult;
    private Button btnAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        etNum1=(EditText)findViewById(R.id.etNum1);
        etNum2=(EditText)findViewById(R.id.etNum2);
        tvResult=(TextView)findViewById(R.id.tvResult);
        btnAdd=(Button)findViewById(R.id.btnAdd);
       // etNum2.addTextChangedListener(new );

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(etNum1.getText().toString());
                int b = Integer.parseInt(etNum2.getText().toString());
                int c=a+b;
                tvResult.setText(""+Integer.toString(c));
            }
        });


    }

}

