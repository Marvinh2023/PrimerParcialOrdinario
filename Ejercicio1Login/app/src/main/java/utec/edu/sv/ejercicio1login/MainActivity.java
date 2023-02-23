package utec.edu.sv.ejercicio1login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText user, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = findViewById(R.id.edtUser);
        pass = findViewById(R.id.edtPassword);

    }

    public void login(View v){

        String usr = user.getText().toString();
        String passw = pass.getText().toString();

        if(usr.equals("parcialETps1") && passw.equals("p4rC14l#tp$")){
            Intent intento=new Intent(getApplicationContext(),Principal.class);
            startActivity(intento);
        }else{
            Toast toastP = new Toast(getApplicationContext());
            LayoutInflater inflater =getLayoutInflater();
            View layout=inflater.inflate(R.layout.mensaje,(ViewGroup) findViewById(R.id.lytMensaje));

            TextView txtMensaje=(TextView) layout.findViewById(R.id.textView3);
            txtMensaje.setText("contraseña y usuario no son correctos");

            toastP.setDuration(Toast.LENGTH_LONG);
            toastP.setView(layout);
            toastP.show();
        }
    }
}