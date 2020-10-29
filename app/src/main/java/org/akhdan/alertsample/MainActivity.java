package org.akhdan.alertsample;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickShowAlert(View view) {
        AlertDialog.Builder myAlertBuilder = new
                AlertDialog.Builder(MainActivity.this);
        //set the dialog title.
        myAlertBuilder.setTitle(R.string.alert_title);
        //set the dialog message.
        myAlertBuilder.setMessage(R.string.alert_message);
        //add the buttons.
        myAlertBuilder.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //user clicked OK button.
                Toast.makeText(getApplicationContext(),R.string.pressed_ok,
                        Toast.LENGTH_SHORT).show();
            }
        });
        myAlertBuilder.setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //user cancelled the dialog.
                Toast.makeText(getApplicationContext(),R.string.pressed_cancel,
                        Toast.LENGTH_SHORT).show();
            }
        });
        //create and show the AlertDialog.
        myAlertBuilder.show();
    }
}