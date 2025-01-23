package ir.javid.satttar.e02

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    var textViewTitle: TextView? = null
    lateinit var buttonAccept: Button
    lateinit var sampleStr : String
    var age:Int? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        age = 15
        age!!.dec()
        age?.plus(5)


        textViewTitle = findViewById(R.id.textview_title)
        buttonAccept = findViewById(R.id.button_accept)

        textViewTitle?.text = age.toString()
        sampleStr = textViewTitle?.text.toString()

        buttonAccept.setOnClickListener {
            textViewTitle?.text = "خداحافظ دنیا"
        }

    }
}