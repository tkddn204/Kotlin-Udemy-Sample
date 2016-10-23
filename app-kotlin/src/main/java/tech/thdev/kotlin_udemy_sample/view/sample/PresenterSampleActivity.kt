package tech.thdev.kotlin_udemy_sample.view.sample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import tech.thdev.kotlin_udemy_sample.R
import tech.thdev.kotlin_udemy_sample.util.replaceFragmentToActivity

class PresenterSampleActivity : AppCompatActivity() {

    private val toolbar by lazy {
        findViewById(R.id.toolbar) as Toolbar
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toolbar.setTitle(R.string.app_name)
        setSupportActionBar(toolbar)

        replaceFragmentToActivity(PresenterSampleFragment.getInstance(), R.id.frame_layout)
    }
}
