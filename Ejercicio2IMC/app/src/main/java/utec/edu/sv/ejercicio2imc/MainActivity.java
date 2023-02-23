package utec.edu.sv.ejercicio2imc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv1;
    EditText edt1,edt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt1 = findViewById(R.id.edtPeso);
        edt2 = findViewById(R.id.edtAltura);
        tv1 = findViewById(R.id.tvMensaje);
    }

    public void calcular(View view){
        String peso = edt1.getText().toString();
        String altura = edt2.getText().toString();

        double v1 = Double.parseDouble(peso);
        double v2 = Double.parseDouble(altura);

        String resu ="";

        double operacion = (v1/(v2*v2));

        if(operacion < 10.5){
            resu = "Críticamente Bajo de Peso";
        }else if(operacion > 10.5 && operacion< 15.9){
            resu = "Severamente Bajo de Peso";
        }else if(operacion >= 15.9 && operacion < 18.5){
            resu = "Bajo de Peso";
        }else if(operacion >= 18.5 && operacion < 25){
            resu = "Normal (peso saludable)";
        }else if(operacion >= 25 && operacion < 30){
            resu = "Sobrepeso";
        }else if(operacion >= 30 && operacion < 35){
            resu = "Obesidad Clase 1 - Moderadamente Obeso";
        }else if(operacion >= 35 && operacion < 40){
            resu = "Obesidad Clase 2 - Severamente Obeso";
        }else if(operacion > 50){
            resu = "Obesidad Clase 3 - Críticamente Obeso";
        }
        tv1.setText(resu);
    }
}