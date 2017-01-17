package cn.ben.googletrainingscenesandtransitions;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.transition.Fade;
import android.transition.Scene;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.view.View;
import android.view.ViewGroup;

public class CreateSceneActivity extends AppCompatActivity {
    @SuppressWarnings({"unused", "FieldCanBeLocal"})
    private Scene mAScene;
    @SuppressWarnings({"unused", "FieldCanBeLocal"})
    private Scene mAnotherScene;
    @SuppressWarnings("FieldCanBeLocal")
    private ViewGroup mSceneRoot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_scene);

        // Create the scene root for the scenes in this app
        mSceneRoot = (ViewGroup) findViewById(R.id.scene_root);

        // Create the scenes
        mAScene = Scene.getSceneForLayout(mSceneRoot, R.layout.a_scene, this);
        mAnotherScene =
                Scene.getSceneForLayout(mSceneRoot, R.layout.another_scene, this);

        @SuppressWarnings("UnusedAssignment") Transition mFadeTransitionFromRes =
                TransitionInflater.from(this).
                        inflateTransition(R.transition.fade_transition);

        @SuppressWarnings("UnusedAssignment") Transition mFadeTransition = new Fade();
    }

    public void jump(@SuppressWarnings("UnusedParameters") View view) {
        startActivity(new Intent(this, ApplyingTransitionActivity.class));
    }
}
