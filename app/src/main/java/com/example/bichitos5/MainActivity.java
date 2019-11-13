package com.example.bichitos5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnProducts;
    private Button btnAboUts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnProducts =(Button) findViewById(R.id.btnEnter);
        btnAboUts = (Button) findViewById(R.id.btnAboUts);

        btnProducts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,ProductListActivity.class);
                startActivity(i);
            }
        });
    btnAboUts.setOnClickListener(new View.OnClickListener() {
    public void onClick(View v){
        //Log.i(Settings.INFO,"AbaUts us");
        Intent i = new Intent(MainActivity.this, AbautUsActivity.class);
        startActivity(i);

    }
});
    }
    @Override
  protected void onResume(){
        super.onResume(); //este codigo se ejecuta antes de todos.
        //en este punto la aplicaion ya cargó.
        //this en un activity: es la esencia de un activity (de una pantalla)
        //this es de tipo contexto
        Toast.makeText(this,
                "Aplicacion Iniciada",
                Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onStop(){
        super.onStop();
        Toast.makeText(this,
                "Aplicacion Stopeada",
                Toast.LENGTH_LONG).show();
    }
}
