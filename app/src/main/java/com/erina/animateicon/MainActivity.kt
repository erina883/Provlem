package com.erina.animateicon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.RotateAnimation
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    private var isRotated = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val iconImageView = findViewById<ImageView>(R.id.iconImageView)

        iconImageView.setOnClickListener {
            if (isRotated) {
                rotateIcon(iconImageView, 180f, 0f)
            } else {
                rotateIcon(iconImageView, 0f, 180f)
            }
            isRotated = !isRotated
        }
    }

    private fun rotateIcon(view: View, fromDegree: Float, toDegree: Float) {
        val rotateAnimation = RotateAnimation(
            fromDegree,
            toDegree,
            Animation.RELATIVE_TO_SELF,
            0.5f,
            Animation.RELATIVE_TO_SELF,
            0.5f
        )
        rotateAnimation.duration = 1000
        rotateAnimation.fillAfter = true
        view.startAnimation(rotateAnimation)
    }
}