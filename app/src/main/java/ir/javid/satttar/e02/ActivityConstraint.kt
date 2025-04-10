package ir.javid.satttar.e02

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class ActivityConstraint : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_constraint)

        val btn = findViewById<MaterialButton>(R.id.bt_show_toast)
        btn.setOnClickListener { _ ->
            Toast.makeText(this,"Salam",Toast.LENGTH_LONG).show()
        }
        val intentMessage = intent.getIntExtra("message",0)
        val txtShowMessage = findViewById<TextView>(R.id.txt_show_message)
        txtShowMessage.text = "Intent value is : ${intentMessage}"


    }
}