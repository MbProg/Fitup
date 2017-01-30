package com.example.mb7.sportappbp.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.TextView;

import com.example.mb7.sportappbp.R;
import com.example.mb7.sportappbp.UI_Controls.StimmungListview;
import com.example.mb7.sportappbp.Adapters.StimmungsViewAdapter;

public class ActivityStimmungsAbgabe extends AppCompatActivity {
    StimmungsViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stimmung);

        this.InitializeControlls();
        this.SetControlCaptions();

         super.onStart();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        //set an other menu xml
        inflater.inflate(R.menu.menu_save, menu);

        return super.onCreateOptionsMenu(menu);
    }

    private void InitializeControlls(){

        // set the listivew
        // first create the adapter
        adapter = new StimmungsViewAdapter(this);
        StimmungListview lst = (StimmungListview)findViewById( R.id.lvAngespannt);
        StimmungListview lstTraurig = (StimmungListview)findViewById( R.id.lvTraurig);
        StimmungListview lstTatkraeftig = (StimmungListview)findViewById( R.id.lvTatkraeftig);
        StimmungListview  lstZerstreut= (StimmungListview)findViewById( R.id.lvZerstreut);
        StimmungListview lstWuetend = (StimmungListview)findViewById( R.id.lvWuetend);
        StimmungListview lstMuede = (StimmungListview)findViewById( R.id.lvMuede);
        StimmungListview lstSelbstsicher = (StimmungListview)findViewById( R.id.lvSelbstsicher);
        StimmungListview lstMittelsam = (StimmungListview)findViewById( R.id.lvMitteilsam);

        lst.setAdapter(adapter);
        lstTraurig.setAdapter(adapter);
        lstTatkraeftig.setAdapter(adapter);
        lstZerstreut.setAdapter(adapter);
        lstWuetend.setAdapter(adapter);
        lstMuede.setAdapter(adapter);
        lstSelbstsicher.setAdapter(adapter);
        lstMittelsam.setAdapter(adapter);

        // set the onTouch Event to disable scrolling
        lst.Initialize();
        lstTraurig.Initialize();
        lstTatkraeftig.Initialize();
        lstZerstreut.Initialize();
        lstWuetend.Initialize();
        lstMuede.Initialize();
        lstSelbstsicher.Initialize();
        lstMittelsam.Initialize();
    }

    private void SetControlCaptions(){
        ((TextView)findViewById(R.id.txtMainQuestion)).setText("Bitte geben Sie an, wie Sie sich jetzt d.h. in diesem Moment fühlen");
        ((TextView)findViewById(R.id.txtAngespannt)).setText("Angespannt");
        ((TextView)findViewById(R.id.txtTraurig)).setText("Traurig");


    }
}
