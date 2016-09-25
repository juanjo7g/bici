package com.ihdn.bici;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class LoginController extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    /*private TextView info;
    private LoginButton loginButton;
    private CallbackManager callbackManager;


    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        FacebookSdk.sdkInitialize(getApplicationContext());
        callbackManager = CallbackManager.Factory.create();

        setContentView(R.layout.activity_login);
        info = (TextView) findViewById(R.id.info);
        // loginButton = (LoginButton)findViewById(R.id.login_facebook);

        loginButton.registerCallback(callbackManager, new FacebookCallback<LoginResult>() {

            public void onSuccess(LoginResult loginResult) {
                info.setText(
                        "User ID: "
                                + loginResult.getAccessToken().getUserId()
                                + "\n" +
                                "Auth Token: "
                                + loginResult.getAccessToken().getToken()
                );
            }

            public void onCancel() {

                //Toast.makeText(LoginController.this, "", Toast.LENGTH_SHORT).show();
            }

            public void onError(FacebookException e)
            {
                // info.setText("Login attempt failed.");
            }
        });

    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        callbackManager.onActivityResult(requestCode, resultCode, data);
    }*/

}