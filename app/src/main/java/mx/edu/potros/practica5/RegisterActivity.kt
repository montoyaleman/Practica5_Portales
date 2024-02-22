package mx.edu.potros.practica5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val button: Button = findViewById(R.id.btn_sign_in)

        val name: TextView = findViewById(R.id.name_input)
        val last_name: TextView = findViewById(R.id.last_name_input)
        val password: TextView = findViewById(R.id.password_input)
        val email: TextView = findViewById(R.id.email_input)

        val checkbox: CheckBox = findViewById(R.id.checkBox)

        button.setOnClickListener{
            /*
            //si los campos de textos no estan llenos, no se puede pasar a la siguiente pagina
            if (name.text.isBlank()) return@setOnClickListener
            if (last_name.text.isBlank()) return@setOnClickListener
            if (password.text.isBlank()) return@setOnClickListener
            if (email.text.isBlank()) return@setOnClickListener

            //tambien con el checkbox
            if (!checkbox.isActivated) return@setOnClickListener
            */

            var intent: Intent = Intent(this,MenuActivity::class.java)
            startActivity(intent)
        }
    }
}