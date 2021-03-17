package abdulhannanmayo.app.lesson1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var imageView : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val helloButton : Button = findViewById(R.id.hello_button)

        helloButton.setOnClickListener {

            changetext()

        }

        imageView = findViewById(R.id.dice_image)


    }

    private fun changetext() {

        val randomInt =  Random.nextInt(6)+1

        val drawableResource= when(randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        imageView.setImageResource(drawableResource)

    }
}