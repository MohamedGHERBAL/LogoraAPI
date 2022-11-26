package com.monpc.logoraapi.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.monpc.logoraapi.databinding.FragmentTextEditorBinding;

/**
 * A simple {@link Fragment} subclass.
 */
public class TextEditorFragment extends Fragment {

    // For Log.d
    private static final String TAG = TextEditorFragment.class.getSimpleName();

    // For ViewBinding
    private FragmentTextEditorBinding textEditorBinding;

    // For Floating Action Button
    private FloatingActionButton fab;


    // ------------------------------------------------------
    // onCreate
    // ------------------------------------------------------
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "onCreate");

    }

    // ------------------------------------------------------
    // onCreateView
    // ------------------------------------------------------
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.i(TAG, "onCreateView");

        // Inflate the layout with ViewBinding for this fragment
        textEditorBinding = FragmentTextEditorBinding.inflate(getLayoutInflater(), container, false);

        // Configure FloatingActionButton
        configFAB();


        return textEditorBinding.getRoot();
    }

    // For FloatingActionButton
    private void configFAB() {
        textEditorBinding.fabOne.setOnClickListener(view -> {
            Log.i(TAG, "FAB setOnClickListener is clicked !");

            Toast.makeText(getContext(), "TOAST !!!", Toast.LENGTH_LONG).show();
        });
    }
}