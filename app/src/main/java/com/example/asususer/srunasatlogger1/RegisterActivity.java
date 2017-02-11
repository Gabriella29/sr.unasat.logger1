package com.example.asususer.srunasatlogger1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

public void Register(View view){

    EditText usernameET = (EditText) findViewById(R.id.UserName);
    EditText passwordET = (EditText) findViewById(R.id.password);
    EditText confirmPasswordET = (EditText) findViewById(R.id.ConfirmPassword);
    EditText firstnameET = (EditText) findViewById(R.id.FirstName);
    EditText lastnameET = (EditText) findViewById(R.id.LastName);
    EditText emailET = (EditText) findViewById(R.id.Email);
    EditText genderET = (EditText) findViewById(R.id.Gender);
    EditText kantoorET = (EditText) findViewById(R.id.Kantoor);
    EditText adresET = (EditText) findViewById(R.id.Adres);
    EditText phoneET = (EditText) findViewById(R.id.Phone);
    Button registerUser = (Button) findViewById(R.id.registerButton);

if(usernameET.equals("")||passwordET.equals("")||confirmPasswordET.equals("")||firstnameET.equals("")
        ||lastnameET.equals("")||lastnameET.equals("")||emailET.equals("")||genderET.equals("")||kantoorET.equals("")
        ||phoneET.equals(""))
{
Toast.makeText(getApplicationContext(),"Verplicht invullen", Toast.LENGTH_SHORT).show();
    return;
}
  if (!passwordET.equals(confirmPasswordET)) {
      Toast.makeText(getApplicationContext(), "Wachtwoorden komen niet overeen", Toast.LENGTH_SHORT).show();
      return;
  }
          else

      {
          startActivity(new Intent(this, LoginActivity.class));
          Toast.makeText(getApplicationContext(), "De Registratie was succesvol", Toast.LENGTH_SHORT).show();
      }

}

}