package com.example.rekisterointi2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UserStorage s = UserStorage.getInstance();

        context = MainActivity.this;
        UserStorage.getInstance().loadUsers(context);
    }

    public void switchToAddUser(View view) {
        Intent intent = new Intent(this, ActivityAskInformation.class);
        startActivity(intent);
    }

    public void switchToListUser(View view) {
        Intent intent = new Intent(this, ActivityListUsers.class);
        startActivity(intent);
    }

}