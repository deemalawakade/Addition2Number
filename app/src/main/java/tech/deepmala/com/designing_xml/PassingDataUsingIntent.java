package tech.deepmala.com.designing_xml;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class PassingDataUsingIntent extends AppCompatActivity {

    private TextView tvResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passing_data_using_intent);
        Intent i=getIntent();
        String result=i.getStringExtra("result");
        int x=i.getIntExtra("position",99);


        tvResult=(TextView)findViewById(R.id.tvResult);
        tvResult.setText(result);
        /*i.getStringExtra("result");
        i.getIntExtra("position",99);*/
       /* remeber this we get data from activity MainActivity i.e. one string and one integer
                using intent putextraT() we can get data*/
    }


}
