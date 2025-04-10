package ir.javid.satttar.e02

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {

    var textViewTitle: TextView? = null
    lateinit var buttonAccept: Button
    lateinit var buttonNextActivity: Button
    lateinit var buttonShowUrl: Button
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
        buttonNextActivity = findViewById(R.id.button_next_activity)
        buttonShowUrl = findViewById(R.id.button_show_url)

        textViewTitle?.text = age.toString()
        sampleStr = textViewTitle?.text.toString()

        buttonAccept.setOnClickListener {
            textViewTitle?.text = "خداحافظ دنیا"
        }

        buttonNextActivity.setOnClickListener {
            val intent  = Intent(this@MainActivity, ActivityConstraint::class.java)
            intent.putExtra("message",123)
            startActivity(intent)
        }

        buttonShowUrl.setOnClickListener {
            val intent  = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.time.ir/"))
            startActivity(intent)
        }

    }

    override fun onStart() {
        super.onStart()
        Log.d("TAG", "onStart: ")
    }

    override fun onResume() {
        super.onResume()
        Log.d("TAG", "onResume: ")
    }

    override fun onPause() {
        super.onPause()
        Log.d("TAG", "onPause: ")
    }

    override fun onStop() {
        super.onStop()
        Log.d("TAG", "onStop: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("TAG", "onDestroy: ")
    }


}