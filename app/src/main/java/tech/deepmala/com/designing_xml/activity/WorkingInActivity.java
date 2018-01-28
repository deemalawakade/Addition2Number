package tech.deepmala.com.designing_xml.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import tech.deepmala.com.designing_xml.R;
import tech.deepmala.com.designing_xml.fragment.FirstFragment;
import tech.deepmala.com.designing_xml.fragment.SecondFragment;
import tech.deepmala.com.designing_xml.fragment.ThirdFragment;

public class WorkingInActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_one, btn_two, btn_three;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_working_in_fragment);

        btn_one = (Button) findViewById(R.id.btn_one);
        btn_two = (Button) findViewById(R.id.btn_two);
        btn_three = (Button) findViewById(R.id.btn_three);

        btn_one.setOnClickListener(this);
        btn_two.setOnClickListener(this);
        btn_three.setOnClickListener(this);
        selectFragment("ONE");

    }

    private void selectFragment(String tag) {
        Fragment fragment = null;
        FragmentTransaction fragmentTransaction;
        switch (tag) {
            case "ONE":
                fragment = new FirstFragment();
                break;

            case "TWO":
                fragment = new SecondFragment();
                break;

            case "THREE":
                fragment = new ThirdFragment();
                break;


        }
        if (fragment != null) {
            fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.container, fragment, tag);
            fragmentTransaction.addToBackStack(tag);
            fragmentTransaction.commitAllowingStateLoss();
        }
    }

    @Override
    public void onClick(View view) {


        switch (view.getId()) {

            case R.id.btn_one:
                selectFragment("ONE");
                break;

            case R.id.btn_two:
                selectFragment("TWO");
                break;

            case R.id.btn_three:
                selectFragment("THREE");
                break;


        }

    }
}
