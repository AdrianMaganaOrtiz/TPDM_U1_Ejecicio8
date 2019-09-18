package mx.edu.ittepic.tpdm_u1_ejecicio8

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    var boton : Button ?= null
    var cadena : EditText ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        boton= findViewById(R.id.boton)
        cadena= findViewById(R.id.cadena)
        boton?.setOnClickListener {
            var otroActivity= Intent(this,Main2Activity::class.java)
            otroActivity.putExtra("cadena",cadena?.text.toString())
            startActivity(otroActivity)
        }
    }
}
