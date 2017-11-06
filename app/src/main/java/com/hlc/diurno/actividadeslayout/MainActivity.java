package com.hlc.diurno.actividadeslayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirRelativeLayout(View v){
        Intent relative = new Intent(this, RelativeLayout.class);
        startActivity(relative);
    }

    public void abrirTabletLayout(View v){
        Intent tablet = new Intent(this, TableLayout.class);
        startActivity(tablet);
    }

}
