package com.happymonday.tiplocal.tiplikealocal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class CalculateTip extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // Restore any saved instance state
        super.onCreate(savedInstanceState);

        // Set content view
        setContentView(R.layout.activity_calculate_tip);

        // Initialize UI elements
        final TextView totalAmountText = (TextView) findViewById(R.id.totalAmountText);
        final TextView totalAmountValue = (TextView) findViewById(R.id.totalAmountValue);
        final TextView tipAmountText = (TextView) findViewById(R.id.tipAmountText);
        final TextView tipAmountValue = (TextView) findViewById(R.id.tipAmountValue);

        Intent callerIntent = getIntent();
        String totalAmount = callerIntent.getStringExtra("totalAmount");

        totalAmountValue.setText(totalAmount);

        double tipAmount = calculateTip(totalAmount);
        tipAmountValue.setText(String.valueOf(tipAmount));
    }

    private double calculateTip(String amount) {
        return Float.valueOf(amount) * 0.15;
    }

/*    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_calculate_tip, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }*/
}
