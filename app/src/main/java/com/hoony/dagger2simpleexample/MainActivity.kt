package com.hoony.dagger2simpleexample

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.hoony.dagger2simpleexample.di.DIFragment
import com.hoony.dagger2simpleexample.non_di.NonDIFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val fragments: Array<Fragment> = arrayOf(
        NonDIFragment(),
        DIFragment()
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavView.setOnNavigationItemSelectedListener { item: MenuItem ->
            val fragmentTransition = supportFragmentManager.beginTransaction()
            when (item.itemId) {
                R.id.non_di -> {
                    fragmentTransition.replace(frameLayout.id, fragments[0]).commit()
                }
                R.id.di -> {
                    fragmentTransition.replace(frameLayout.id, fragments[1]).commit()
                }
            }
            true
        }
    }
}