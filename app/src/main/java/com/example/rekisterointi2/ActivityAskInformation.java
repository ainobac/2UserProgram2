package com.example.rekisterointi2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;

import java.util.ArrayList;

public class ActivityAskInformation extends AppCompatActivity {

    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ask_information);

        UserStorage s = UserStorage.getInstance();

        context = ActivityAskInformation.this;
    }

    public void addUser(View view) {

        RadioGroup radioGroup = findViewById(R.id.radioGroup);
        EditText fName = findViewById(R.id.TextFirstName);
        EditText lName = findViewById(R.id.TextLastName);
        EditText email = findViewById(R.id.TextEmailAddress);
        CheckBox kandi = findViewById(R.id.checkBoxKandi);
        CheckBox di = findViewById(R.id.checkBoxDi);
        CheckBox tektoh = findViewById(R.id.checkBoxTektoh);
        CheckBox swim = findViewById(R.id.checkBoxSwim);

        String fName2 = fName.getText().toString();
        String lName2 = lName.getText().toString();
        String email2 = email.getText().toString();
        String kandi2 = kandi.getText().toString();
        String di2 = di.getText().toString();
        String tektoh2 = tektoh.getText().toString();
        String swim2 = swim.getText().toString();

        ArrayList<String> degrees = new ArrayList<>();
        if (kandi.isChecked()) {
            degrees.add(String.valueOf(kandi2));
        } if (di.isChecked()) {
            degrees.add(String.valueOf(di2));
        } if (tektoh.isChecked()) {
            degrees.add(String.valueOf(tektoh2));
        }if (swim.isChecked()) {
            degrees.add(String.valueOf(swim2));
        }

        switch (radioGroup.getCheckedRadioButtonId()) {
            case R.id.RadioButtonTite:
                UserStorage.getInstance().addUser(new User(String.valueOf(fName2),String.valueOf(lName2),String.valueOf(email2),"Tietotekniikka",degrees));
                break;
            case R.id.RadioButtonTuta:
                UserStorage.getInstance().addUser(new User(String.valueOf(fName2),String.valueOf(lName2),String.valueOf(email2),"Tuotantotalous",degrees));
                break;
            case R.id.RadioButtonLate:
                UserStorage.getInstance().addUser(new User(String.valueOf(fName2),String.valueOf(lName2),String.valueOf(email2),"Laskennallinen tekniikka",degrees));
                break;
            case R.id.RadioButtonSate:
                UserStorage.getInstance().addUser(new User(String.valueOf(fName2),String.valueOf(lName2),String.valueOf(email2),"Sähkötekniikka",degrees));
                break;
        }
        UserStorage.getInstance().saveUsers(context);
    }
}