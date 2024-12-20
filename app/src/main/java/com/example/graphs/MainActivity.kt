package com.example.graphs

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.db.williamchart.view.LineChartView
import com.example.graphs.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lineChart = findViewById<LineChartView>(R.id.linChart)
        lineChart.gradientFillColors = intArrayOf(
            Color.parseColor("#9998DA"),
            Color.TRANSPARENT
        )
        lineChart.labelsColor = Color.parseColor("#00FFFFFF")
        lineChart.labelsSize = 10f
        lineChart.animation.duration =animationDuration
        lineChart.animate(lineset)

    }
    companion object{
        private  val lineset = listOf(
            "Lable1" to 10f,
            "Labl2" to 10f,
            "Lable3" to 30f,
            "Lable4" to 30f,
            "Lable5" to 15f,
            "Lable6" to 25f,
            "Lable7" to 20f,
        )
        private  const val animationDuration =100L
    }
}