package com.monpc.logoraapi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.monpc.logoraapi.databinding.ActivityMainBinding;
import com.monpc.logoraapi.fragment.ListHistoryFragment;
import com.monpc.logoraapi.fragment.TextEditorFragment;

public class MainActivity extends AppCompatActivity {

    // For Log.d
    private static final String TAG = MainActivity.class.getSimpleName();

    // For ViewBinding
    private ActivityMainBinding mainBinding;


    // ------------------------------------------------------
    // onCreate
    // ------------------------------------------------------
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "onCreate");

        // Inflate the view with ViewBinding
        mainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = mainBinding.getRoot();
        setContentView(view);

        // Config. BottomNavigationView
        this.configureBtnNavView();

        // Show First Fragment
        getFragment(new TextEditorFragment());
    }


    // ------------------------------------------------------
    // CONFIGURATION
    // ------------------------------------------------------

    // Configure Bottom Navigation View
    private void configureBtnNavView() {
        Log.d(TAG, "configureBtnNavView");

        /////////////////////////////////////////////////////////////
        // !!! NEED TO UPDATE setOnNavigationItemSelectedListener !!!
        /////////////////////////////////////////////////////////////
        mainBinding.activityMainBottomNavigation.setOnNavigationItemSelectedListener(item -> {
            if (item.getItemId() == R.id.texteditor) {
                item.setChecked(true);
                //setTitle(R.string.text_editor_fragment); // Change title when fragment is selected
                getFragment(new TextEditorFragment());
            }

            else if (item.getItemId() == R.id.listhistory) {
                item.setChecked(true);
                //setTitle(R.string.list_history_fragment); // Change title when fragment is selected
                getFragment(new ListHistoryFragment());
            }

            return false;
        });
    }


    //------------------------------------------------------
    // FRAGMENTS
    //------------------------------------------------------

    // Show Fragment
    private void getFragment(Fragment fragment) {
        Log.d(TAG, "getFragment");

        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = manager.beginTransaction();
        fragmentTransaction.replace(R.id.container, fragment);
        fragmentTransaction.commit();
    }

}
