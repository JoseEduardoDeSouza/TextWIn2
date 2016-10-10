package moblab.exemplolista;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class ConfigActivity extends AppCompatActivity {
    public String novo_IP="";
    public String novo_name="";
    private MainActivity app = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.config);
    }
    public void config (View view) {
        EditText campoTexto = (EditText) findViewById(R.id.internetprotocol);
        if (campoTexto.getText().toString() != "") {
            novo_IP = "http://" + (campoTexto.getText().toString());

        }
        EditText novo_nome = (EditText) findViewById(R.id.nome_novo);
        if (novo_nome.getText().toString() != "") {
            novo_name= novo_nome.getText().toString();
        }

    }







}

