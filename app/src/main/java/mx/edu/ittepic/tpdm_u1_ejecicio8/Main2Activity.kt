package mx.edu.ittepic.tpdm_u1_ejecicio8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class Main2Activity : AppCompatActivity() {
    var botonMostrar : Button ?= null
    var Posicion : EditText ?= null
    var mostrar : TextView ?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        botonMostrar=findViewById(R.id.boton2)
        Posicion=findViewById(R.id.posicion)
        mostrar=findViewById(R.id.mostrar)
        botonMostrar?.setOnClickListener {
            var array = arrayOf(cadena)
            mostrar?.text("Posicion:"+Posicion.toString()+"= "+array[Posicion?.text.toString().toInt()])


        }
    }
}
