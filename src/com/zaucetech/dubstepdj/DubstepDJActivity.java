package com.zaucetech.dubstepdj;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

public class DubstepDJActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        

    
        
        
    }
    
//	TOUCH
    public boolean onTouch(View v, MotionEvent event) 
    {   
    	
        switch (event.getAction()) 
        {

        case MotionEvent.ACTION_DOWN:
        {
//        	mp = MediaPlayer.create(this, R.raw.hornsound);            
//            mp.start();
//            horn.setBackgroundResource(R.drawable.hornpressed);
        }

        break;
        case MotionEvent.ACTION_UP:
        {
//            mp.reset();
//            horn.setBackgroundResource(R.drawable.horn);
        }
        break;
    }
    return true;
    }
}