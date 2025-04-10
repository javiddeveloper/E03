package ir.javid.satttar.e02

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.switchmaterial.SwitchMaterial

class SettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_settings)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val switchIsDarkMode = findViewById<SwitchMaterial>(R.id.switch_is_dark_mode)
        val txtThemeStatus = findViewById<TextView>(R.id.txt_theme_status)



        // init Preferences
        val sharedPref = this.getPreferences(Context.MODE_PRIVATE)
        // read from Preferences
        val isDark = sharedPref.getBoolean("isDark", false)

        /// set to ui
        txtThemeStatus.text = if (isDark) {
            "active"

        } else {
            "not active"
        }

        switchIsDarkMode.isChecked = isDark


        switchIsDarkMode.setOnCheckedChangeListener { _, checked ->
            with(sharedPref.edit()) {
                //apply is dark to Preferences
                putBoolean("isDark", checked)
                apply()
            }

            // update ui
            txtThemeStatus.text = if (checked) {
                "active"

            } else {
                "not active"
            }
        }
    }
}