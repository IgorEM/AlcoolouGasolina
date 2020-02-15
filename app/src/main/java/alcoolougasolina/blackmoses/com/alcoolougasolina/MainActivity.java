package alcoolougasolina.blackmoses.com.alcoolougasolina;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText precoAlcool;
    private EditText precoGasolina;
    private Button botaoVerificar;
    private TextView resultadoVerificar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        precoAlcool = (EditText) findViewById(R.id.precoAlcoolId);
        precoGasolina = (EditText) findViewById(R.id.precoGasolinaId);
        botaoVerificar = (Button) findViewById(R.id.botaoVerificarId);
        resultadoVerificar = (TextView) findViewById(R.id.textoResultadoId);

        botaoVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //recupera valores digitados
                String precoAlcoolDigitado = precoAlcool.getText().toString();
                String precoGasolinaDigitado = precoGasolina.getText().toString();

                //converter valores string para numeros
                Double valorAlcool = Double.parseDouble(precoAlcoolDigitado);
                Double valorGasolina = Double.parseDouble(precoGasolinaDigitado);

                // alcool / gasolina
                double resultado = valorAlcool / valorGasolina;

                if (resultado >= 0.7){
                    resultadoVerificar.setText("É Melhor Utilizar a Gasolina");
                }else{
                    resultadoVerificar.setText("É Melhor Utilizar o Álcool");
                }
            }
        });
    }
}
