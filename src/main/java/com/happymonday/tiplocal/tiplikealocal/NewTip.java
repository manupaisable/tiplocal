package com.happymonday.tiplocal.tiplikealocal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.net.Uri;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class NewTip extends Activity {

    private final String TAG = "TipLocal";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // Restore any saved instance state
        super.onCreate(savedInstanceState);

        // Set content view
        setContentView(R.layout.activity_new_tip);

        // Initialize UI elements
        final EditText totalAmountText = (EditText) findViewById(R.id.totalAmountText);
        final Button enterTotalAmountButton = (Button) findViewById(R.id.enterTotalAmountButton);

        // Link UI elements to actions in code
        enterTotalAmountButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {

                    String totalAmount = totalAmountText.getText().toString();

                    Intent tipIntent = new Intent(NewTip.this, CalculateTip.class);
                    tipIntent.putExtra("totalAmount", totalAmount);
                    startActivity(tipIntent);

                } catch (Exception e) {
                    Log.e(TAG, e.toString());
                }
            }
        });
    }



/*    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_new_tip, menu);
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
