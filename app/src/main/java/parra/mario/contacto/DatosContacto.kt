package parra.mario.contacto

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_datos_contacto.*

class DatosContacto : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_datos_contacto)

            val nombre: String = intent.getStringExtra("nombre")
            campo_nombre.setText(nombre)

            val correo: String = intent.getStringExtra("correo")
            campo_correo.setText(correo)

            val tel: String = intent.getStringExtra("telefono")
            campo_telefono.setText(tel)

    }

    fun aceptar(view: View){
        val resultIntent = Intent()

        resultIntent.putExtra("nombre", campo_nombre.text.toString())
        resultIntent.putExtra("telefono", campo_telefono.text.toString())
        resultIntent.putExtra("correo", campo_correo.text.toString())

        setResult(Activity.RESULT_OK, resultIntent)

        finish()

    }

    fun cancelar(view: View){
        finish()
    }
}
