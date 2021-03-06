package app.cedipro.android;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class SignUpActivity extends AppCompatActivity {
    private EditText usuario, contraseña, codigoVerificacion;
    private FirebaseAuth firebaseAuth;
    private FirebaseAuth.AuthStateListener authStateListener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        //getSupportActionBar().hide();

        usuario = findViewById(R.id.SUusuario);
        contraseña = findViewById(R.id.SUcontraseña);
        codigoVerificacion = findViewById(R.id.SUcodigo_verificacion);

        firebaseAuth = FirebaseAuth.getInstance();

        authStateListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser user = firebaseAuth.getCurrentUser();
                if (user != null){
                    Toast.makeText(SignUpActivity.this, "La cuenta fue creada con éxito", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(SignUpActivity.this, "El usuario salio de la sesion", Toast.LENGTH_SHORT).show();
                }


            }
        };
    }

    @Override
    protected void onStart() {
        super.onStart();
        firebaseAuth.addAuthStateListener(authStateListener);
    }

    @Override
    protected void onStop() {
        super.onStop();
        if(authStateListener != null){
            firebaseAuth.removeAuthStateListener(authStateListener);
        }
    }

    public void crearCuenta(View view) {
        String username = usuario.getText().toString();
        String passoword = contraseña.getText().toString();
        if (! (username.equals("") && passoword.equals("")) ){
            firebaseAuth.createUserWithEmailAndPassword(username, passoword).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if (!task.isSuccessful()){
                        //task.getResult().toString()
                        Toast.makeText(SignUpActivity.this, "Error al crear cuenta", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }else {
            Toast.makeText(this, "Campos vacíos", Toast.LENGTH_SHORT).show();
        }
    }
}
