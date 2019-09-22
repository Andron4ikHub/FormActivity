package edu.temple.formactiviti;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Toast;
import android.text.TextUtils;


public class MainActivity extends AppCompatActivity {
    EditText Login;
    EditText Password;
    EditText RepeatPass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        Login = findViewById(R.id.Login);
        Password = findViewById(R.id.Password);
        RepeatPass = findViewById(R.id.retype);
        final TextView textView=(TextView)findViewById(R.id.textView);
        final Button sup = (Button) findViewById(R.id.signup);



        sup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CheckData();
            }
        });


    }



    boolean isEmpty(EditText text) {
        CharSequence str = text.getText().toString();
        return TextUtils.isEmpty(str);
    }
    void CheckData(){
        String Password1 = Password.getText().toString();
        String RepeatPas1 = RepeatPass.getText().toString();
        String Login1 = Login.getText().toString();

        if(isEmpty(Login)){
            Toast check = Toast.makeText(this, "Please fill up all the fields", Toast.LENGTH_SHORT);
            check.show();
        }
        if(isEmpty(Password)){
            Password.setError("Please fill up all the fields");
        }
        if(isEmpty(RepeatPass)){
            Toast check = Toast.makeText(this, "Please fill up all the fields", Toast.LENGTH_SHORT);
            check.show();

        }
        if(!isEmpty(Login)&&(!isEmpty(Password))&&(Password1.equals(RepeatPas1))){
            Toast check = Toast.makeText(this, "Welcome, " + Login1 + " to the SignUp form App", Toast.LENGTH_SHORT);
            check.show();

        }

    }

}
