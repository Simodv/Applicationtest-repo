package com.example.android.applicationtest;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
/**
 * The Applicationtest is an application that
 * simply displays "Names of The Numbers Of Team Dev Neoxmy2" and
 * Creates a button which can be clicked to go to the new Activity.
 * @return the button, not null
 *
 *
 *
 * @author  Dev Neoxmy2
 * @version 2.0
 * @since   2018-12-26 (the 1 update by "Mohamed Qud")
 *          2018-12-00 (the 2 update "Name of member")
 *          2018-12-00 (the 3 update "Name of member")
 *          2018-12-00 (the 4 update "Name of member")
 *          2018-12-00 (the 5 update "Name of member")
 *          2018-12-00 (the 6 update "Name of member")
 *          2018-12-00 (the 7 update "Name of member")
 *          2018-12-00 (the 8 update "Name of member")
 *          2018-12-00 (the 9 update "Name of member")
 *
 */
public class MainActivity extends AppCompatActivity {
    // button2is added in layout xml file.
   // button7 added in layout xml file.
    private Button button2;
    private Button buttonTahany;
    private Button button7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
        /* Initialise layout and button components. */
        // Initialising button 2
        button2 = (Button) findViewById ( R.id.button2 );
        // Add a OnClickListener object to button2
        button2.setOnClickListener ( new View.OnClickListener () {
        /* This method is called when any of the activity's view components is clicked. */
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        } );

     //////////////////////////////////////////////////////////////////////////
     /*this buttuon is used to open TahanyActivity with Button_id=button3*/
        buttonTahany=(Button)findViewById(R.id.button3);
        ////override the listner of Button3
        buttonTahany.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, TahanyActivity.class);
                startActivity(i); }});
    }
    ////////////////////////////////////////////////////////////////////////////

    public void openActivity2(){
        Intent intent = new Intent ( this, Activity2.class );
        startActivity(intent);
        // perform action for button2
    }

//Brahim bja change
  // convert button7 to object
button7 = (Button) findViewById ( R.id.button7 );
 // Add OnClickListener  to button7
button7.setOnClickListener ( new View.OnClickListener () {
        /*  method  called if clicked on Botton7. */
            @Override
            public void onClick(View v) {
                openActivitybrahim();
            }
 
      } );
}
public void openActivitybrahim(){
        Intent intent = new Intent ( this, Activitybrahim.class );
        startActivity(intent);
        
    }
//fin brahim change
}
