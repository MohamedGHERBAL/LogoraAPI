package com.monpc.logoraapi.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.monpc.logoraapi.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ListHistoryFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ListHistoryFragment extends Fragment {

    // For Log.d
    private static final String TAG = ListHistoryFragment.class.getSimpleName();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "onCreate");

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list_history, container, false);
    }
}