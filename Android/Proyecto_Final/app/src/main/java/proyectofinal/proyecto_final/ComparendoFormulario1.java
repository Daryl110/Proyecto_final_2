package proyectofinal.proyecto_final;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ComparendoFormulario1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comparendo_formulario1);
    }
    public void ingresar(View view){
        startActivity(new Intent(this,Menu.class));

    }
}