package com.sparklead.sharaspot.ui.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sparklead.sharaspot.R
import com.zackratos.ultimatebarx.ultimatebarx.java.UltimateBarX
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class OnboardingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding)

        UltimateBarX.statusBar(this)
            .transparent()
            .light(true)
            .apply()
    }
}