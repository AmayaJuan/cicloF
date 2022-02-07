package com.nextu.android.ejercicio.ui.main;

import androidx.lifecycle.ViewModelProvider;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.nextu.android.ejercicio.R;

public class MainFragment extends Fragment {

    private MainViewModel mViewModel;

    public static MainFragment newInstance() {
        return new MainFragment();
    }

    private static final String TAG = "CycleLifeCycle";

    private void toastAndLog(String message) {
        //Displaying Toast Calling omCallback message
        Toast.makeText(getActivity().getApplicationContext(), message, Toast.LENGTH_SHORT).show();
        Log.i(TAG, message);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        toastAndLog("onCreate");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        toastAndLog("onCreateView");
        return inflater.inflate(R.layout.main_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(MainViewModel.class);
        // TODO: Use the ViewModel
    }

    /**
     * Called when a fragment is first attached to its context.
     * {@link #onCreate(Bundle)} will be called after this.
     *
     * @param context
     */
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        toastAndLog("onAttach");
    }

    /**
     * Called when the Fragment is visible to the user. This is generally
     * tied to {@link Activity#onStart() Activity.onStart} of the containing
     * Activity's lifecycle
     */
    @Override
    public void onStart() {
        super.onStart();
        toastAndLog("onStart");
    }

    /**
     * Called when the fragment is visible to the user and actively running.
     * This is generally
     * tied to {@link Activity#onResume() Activity.onResume} of the containing
     * Activity's lifecycle
     */
    @Override
    public void onResume() {
        super.onResume();
        toastAndLog("onResume");
    }

    /**
     * Called when thw Fragment is no longer resumed. This is generally
     * tied to {@link Activity#onPause() Activity.onPause} of the containing
     * Activity's lifecycle.
     */
    @Override
    public void onPause() {
        super.onPause();
        toastAndLog("onPause");
    }

    /**
     * Called when the Fragment is no longer started. This is generally
     * tied to {@link Activity#onStop() Activity.onStop} of the containing
     * Activity's lifecycle.
     */
    @Override
    public void onStop() {
        super.onStop();
        toastAndLog("onStop");
    }

    /**
     * Called when the view previously created by {@link #onCreateView} has
     * been detached from the fragment. The next time the fragment needs
     * to be displayed, a new view will be created. This is called
     * after {@link #onStop()} and before {@link #OnDestroy()}. It is called
     * <em>regardless</em> of whether {@link #onCreateView} returned a
     * non-null view. Internally it is called after the view's state has
     * been saved but before it has been removed from its parent.
     */
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        toastAndLog("onDestroyView");
    }

    /**
     * Called when the fragment is no longer in use. This is called
     * after {@link #onStop()} and before {@link #onDestroy()}
     */
    @Override
    public void onDestroy() {
        super.onDestroy();
        toastAndLog("onDestroy");
    }
}