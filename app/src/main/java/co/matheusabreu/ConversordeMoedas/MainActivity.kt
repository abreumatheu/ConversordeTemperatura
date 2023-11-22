package co.matheusabreu.ConversordeMoedas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import co.matheusabreu.conversordemoedas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonConverter.setOnClickListener {
            val fahrenheit = binding.editFahrenheit.text.toString().toDouble()
            val celcius = String.format("%.0f°C",fahrenheit -32 / 1.8)

            binding.textCelsius.text = celcius
        }
    }
}