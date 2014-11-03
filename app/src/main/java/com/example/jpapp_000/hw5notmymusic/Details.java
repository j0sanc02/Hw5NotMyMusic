package com.example.jpapp_000.hw5notmymusic;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.view.Window;
import android.widget.TextView;



public class Details extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
        setContentView(R.layout.activity_details);
        ActionBar actionBar = getActionBar();
        actionBar.show();
        /*
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        for (int i=1; i<=3; i++){
            ActionBar.Tab tab = actionBar.newTab();
            tab.setText("Tab" + i);
            tab.setTabListener((ActionBar.TabListener) this);
            actionBar.addTab(tab);

        }*/




        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        ActionBar.Tab tab1 = actionBar.newTab().setText("Details");
        tab1.setTabListener ((ActionBar.TabListener) new MyTabListener());
        actionBar.addTab(tab1);

        ActionBar.Tab tab2 = actionBar.newTab().setText("More Music");
        tab2.setTabListener((ActionBar.TabListener)new MyTabListener());
        actionBar.addTab(tab2);

        ActionBar.Tab tab3 = actionBar.newTab().setText("Events");
        tab3.setTabListener((ActionBar.TabListener)new MyTabListener());
        actionBar.addTab(tab3);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.details, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_details, container, false);
            return rootView;
        }
    }
}
