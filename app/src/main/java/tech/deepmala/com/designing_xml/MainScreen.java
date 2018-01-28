package tech.deepmala.com.designing_xml;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import tech.deepmala.com.designing_xml.activity.WorkingInActivity;

public class MainScreen extends AppCompatActivity {

    private Button btnAddMainScreen,btnImageLoad,btnFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

        btnAddMainScreen=(Button)findViewById(R.id.btnAddMainScreen);
        btnImageLoad=(Button)findViewById(R.id.btnImageLoad);
        btnFragment=(Button)findViewById(R.id.btnFragment);
        btnAddMainScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
        btnImageLoad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ImageLoader.class);
                startActivity(intent);

            }
        });

        btnFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),WorkingInActivity.class);
                startActivity(intent);
            }
        });
//        Log.e("MAIN","log for error");//to check how log.e is work just comment startActivity(intent);
        Log.d("tag","oncreat");
//        Log.i("Info","Info of main");
//        Log.v("Verbose","Verbose of main");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d("tag","Error in OnResume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("tag","Verbose in Onstart");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("tag","debuging in onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("tag","warning is OnStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("tag","warning is onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("tag","warning is OnDestory");
    }
}
