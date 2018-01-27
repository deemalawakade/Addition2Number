package tech.deepmala.com.designing_xml;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etNum1, etNum2;
    private TextView tvResult;
    private Button btnAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        etNum1 = (EditText) findViewById(R.id.etNum1);
        etNum2 = (EditText) findViewById(R.id.etNum2);
        tvResult = (TextView) findViewById(R.id.tvResult);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        // etNum2.addTextChangedListener(new );

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String num1 = etNum1.getText().toString();
                String num2 = etNum2.getText().toString();

                boolean result = validation(num1, num2);

                if(result){

                }else{

                    int a = Integer.parseInt(etNum1.getText().toString());
                    int b = Integer.parseInt(etNum2.getText().toString());
                    int c = a + b;
                    tvResult.setText("" + Integer.toString(c));

                    Intent intent = new Intent(MainActivity.this, PassingDataUsingIntent.class);
                    intent.putExtra("result", tvResult.getText().toString());
                    intent.putExtra("position", 1);
                    startActivity(intent);
                }

            }
        });


    }

    private boolean validation(String num1, String num2) {

        if (num1 == null || num1.trim().equals("")) {
            etNum1.setError("Please enter 1st number");
            Toast.makeText(getApplicationContext(), "Please Enter Value for num1", Toast.LENGTH_LONG).show();
            return true;
        }
        if (num2 == null || num2.trim().equals("")) {
            etNum2.setError("Please enter 2st number");

            Toast.makeText(getApplicationContext(), "Please Enter Value for num2", Toast.LENGTH_SHORT).show();
            return true;
        }
        return false;
    }

}

