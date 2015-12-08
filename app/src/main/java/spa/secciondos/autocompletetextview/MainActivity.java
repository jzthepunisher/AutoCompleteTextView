package spa.secciondos.autocompletetextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
    String[] presidentes = {
            "José de la Riva Agüero",
            "José Bernardo de Tagle",
            "Mariscal José de la Mar",
            "General Agustín Gamarra",
            "General José Luis de Orbegoso",
            "Felipe Santiago Salaverry",
            "General Andrés Santa Cruz",
            "Agustín Gamarra",
            "Manuel Menéndez",
            "General Francisco Vidal",
            "General Manuel Ignacio de Vivanco"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,presidentes);

        AutoCompleteTextView textView= (AutoCompleteTextView)findViewById(R.id.txtPresidentes);
        textView.setThreshold(3);
        textView.setAdapter(adapter);
    }
}
