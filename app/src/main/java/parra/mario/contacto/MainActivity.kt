package parra.mario.contacto

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        botonEditar.setOnClickListener{
            val intent = Intent(this,DatosContacto::class.java)
            intent.putExtra("nombre", txt_nombre.text.toString())
            intent.putExtra("telefono", txt_telefono.text.toString())
            intent.putExtra("correo", txt_correo.text.toString())

            startActivityForResult(intent,123)

        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (data != null){
            val nombre: String = data.getStringExtra("nombre")
            val telefono: String = data.getStringExtra("telefono")
            val correo: String = data.getStringExtra("correo")

            txt_correo.text = correo
            txt_telefono.text = telefono
            txt_nombre.text = nombre
        }
    }
}
