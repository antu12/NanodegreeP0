package com.example.arshad.myappportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void showToast(View view){
        Context context = getApplicationContext();
        CharSequence text="";
        switch (view.getId()){
            case (R.id.b1):
                text="This button will launch my popular movies app!";
                break;
            case (R.id.b2):
                text="This button will launch my stock hawk app!";
                break;
            case (R.id.b3):
                text="This button will launch my build it bigger app!";
                break;
            case (R.id.b4):
                text="This button will launch my make your app material!";
                break;
            case (R.id.b5):
                text="This button will launch my go ubiquitous app!";
                break;
            case (R.id.b6):
                text="This button will launch my capstone app!";
                break;
        }
        int duration = Toast.LENGTH_SHORT;

        Toast.makeText(context, text, duration).show();
    }
}
