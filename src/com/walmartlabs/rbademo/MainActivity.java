package com.walmartlabs.rbademo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

import rba_sdk.*;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		initializeRBASDK();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

    public void initializeRBASDK() {
    	try{
    	    if(RBA_API.RBA_SDK_Initialize(true)!= ErrorCodes.RESULT_SUCCESS)
    	        return; //SDK initialization error
    	}
    	catch(java.lang.UnsatisfiedLinkError excp){
    	   return;// Exception Occured during initialization
    	}
    }
}
