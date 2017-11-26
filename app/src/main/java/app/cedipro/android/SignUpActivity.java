package app.cedipro.android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {
    private EditText usuario, contraseña, codigoVerificacion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        getSupportActionBar().hide();

        usuario = findViewById(R.id.SUusuario);
        contraseña = findViewById(R.id.SUcontraseña);
        codigoVerificacion = findViewById(R.id.SUcodigo_verificacion);
    }

    public void crearCuenta(View view) {
        Toast.makeText(this, "Crear cuenta", Toast.LENGTH_SHORT).show();
    }
}
