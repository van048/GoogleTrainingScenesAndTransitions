package cn.ben.googletrainingscenesandtransitions;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.transition.Fade;
import android.transition.TransitionManager;
import android.view.ViewGroup;
import android.widget.TextView;

import static android.transition.Fade.IN;

@SuppressWarnings("FieldCanBeLocal")
public class ApplyingTransitionActivity extends AppCompatActivity {

    private TextView mLabelText;
    private Fade mFade;
    private ViewGroup mRootView;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_applying_transition);

        // Create a new TextView and set some View properties
        mLabelText = new TextView(this);
        mLabelText.setText("Label");
//        mLabelText.setId("1");

        // Get the root view and create a transition
        mRootView = (ViewGroup) findViewById(R.id.mainLayout);
        mFade = new Fade(IN);

        // TODO: 2017/1/17 Start recording changes to the view hierarchy
        TransitionManager.beginDelayedTransition(mRootView, mFade);

        // Add the new TextView to the view hierarchy
        mRootView.addView(mLabelText);

        // TODO: 2017/1/17
        // When the system redraws the screen to show this update,
        // the framework will animate the addition as a fade in
    }
}
