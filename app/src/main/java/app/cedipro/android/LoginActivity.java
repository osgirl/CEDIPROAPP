package app.cedipro.android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private EditText usuario, contraseña;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();

        usuario = findViewById(R.id.usuario);
        contraseña = findViewById(R.id.contraseña);

    }

    public void signup(View view) {
        Toast.makeText(this, "Sign up", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, SignUpActivity.class);
        startActivity(intent);
    }

    public void login(View view) {
        Toast.makeText(this, "Login", Toast.LENGTH_SHORT).show();
    }
}
