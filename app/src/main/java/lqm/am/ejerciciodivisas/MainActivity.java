package lqm.am.ejerciciodivisas;
/*¿Cómo se calcula el IMC? Con el sistema métrico, la fórmula para el IMC es el peso en kilogramos dividido por la estatura
 en metros cuadrados. Debido a que la estatura por lo general se mide en centímetros, divida la estatura en centímetros
  por 100 para obtener la estatura en metros.*/

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button calcular;
    EditText cm, kg;
    TextView editResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calcular = findViewById(R.id.btnCaculo);
        cm = findViewById(R.id.editCm);
        kg = findViewById(R.id.editKg);
        editResultado = findViewById(R.id.editResultado);

        calcular.setOnClickListener(this);
        cm.setOnClickListener(this);
        kg.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        double calculoCuadrodao = Double.parseDouble(String.valueOf(cm.getText()));
        double calculoCuadradoPorDos = calculoCuadrodao * 2;
        System.out.println(calculoCuadradoPorDos);
        double calculoKG = Double.parseDouble(String.valueOf(kg.getText()));
        System.out.println(calculoKG);
        double resultado = (int) calculoCuadradoPorDos * calculoKG;
        System.out.println(resultado);

        if (resultado <= 18500) {
        /*    DialogoNuevaNota dialog = new DialogoNuevaNota();
            dialog.show(getSupportFragmentManager(), "nuevo imc");
        */    editResultado.setText("Usted esta en un peso inferior al minimo, deberia de adquirir algunos kg");

        } else if (resultado >= 18500 && resultado <= 24900) {
            editResultado.setText("Usted esta en un peso normal");

        } else if (resultado >= 24900 && resultado <= 29900) {
            editResultado.setText("Usted esta en sobrepeso,deberia de intentar adelgazar");

        } else if (resultado >= 29000 && resultado <= 34000) {
            editResultado.setText("Usted tiene obesidad tipo 1,deberia de intentar adelgazar,consulte con su medico");

        } else if (resultado >= 29000 && resultado <= 34000) {
            editResultado.setText("Usted tiene obesidad tipo 2,deberia de intentar adelgazar,consulte con su medico");

        } else
            editResultado.setText("Usted esta en obesidad tipo 3, deberia de adelgazar, consulte con su medico");

    }

}