package za.co.tamagotchiappfinal

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity4 : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val btnFeed = findViewById<Button>(R.id.btnFeed)
        val btnClean = findViewById<Button>(R.id.btnClean)
        val btnPlay = findViewById<Button>(R.id.btnPlay)
        val image = findViewById<ImageView>(R.id.imageView2)

        val tvHunger = findViewById<TextView>(R.id.tvHunger)
        val tvClean = findViewById<TextView>(R.id.tvClean)
        val tvHappy = findViewById<TextView>(R.id.tvHappy)

        var feedCounter = 0
        var cleanCounter = 0
        var playCounter = 0


        btnFeed.setOnClickListener {

            // Method created by Mmoloki Kgoloosego =)
            // Type shii
            if(feedCounter != 10){
                feedCounter++
            }

            tvHunger.text= feedCounter.toString()
            tvClean.text= cleanCounter.toString()
            tvHappy.text= playCounter.toString()


            image.setImageResource(R.drawable.eating)


        }
        btnClean.setOnClickListener {

            if(cleanCounter != 0){
                cleanCounter--
            }

            tvHunger.text= feedCounter.toString()
            tvClean.text= cleanCounter.toString()
            tvHappy.text= playCounter.toString()


            image.setImageResource(R.drawable.clean)


        }
        btnPlay.setOnClickListener {

            if(playCounter != 10){
                playCounter++
            }
            tvHunger.text= feedCounter.toString()
            tvClean.text= cleanCounter.toString()
            tvHappy.text= playCounter.toString()


            image.setImageResource(R.drawable.playingone)

        }


    }
}