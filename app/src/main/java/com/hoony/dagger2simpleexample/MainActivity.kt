package com.hoony.dagger2simpleexample

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.hoony.dagger2simpleexample.dagger2.DaggerFragment
import com.hoony.dagger2simpleexample.di.DIFragment
import com.hoony.dagger2simpleexample.non_di.NonDIFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private enum class FragmentPosition(val position: Int) {
        NON_DI(0), DI(1), DAGGER(2)
    }

    private val fragments: Array<Fragment> = arrayOf(
        NonDIFragment(),
        DIFragment(),
        DaggerFragment()
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        selectFragment(FragmentPosition.NON_DI)
        setListener()
    }

    private fun setListener() {
        bottomNavView.setOnNavigationItemSelectedListener { item: MenuItem ->
            when (item.itemId) {
                R.id.non_di -> {
                    selectFragment(FragmentPosition.NON_DI)
                }
                R.id.di -> {
                    selectFragment(FragmentPosition.DI)
                }
                R.id.dagger -> {
                    selectFragment(FragmentPosition.DAGGER)
                }
            }
            true
        }
    }

    private fun selectFragment(fragmentPosition: FragmentPosition) {
        val fragmentTransition = supportFragmentManager.beginTransaction()
        fragmentTransition.replace(frameLayout.id, fragments[fragmentPosition.position]).commit()
    }
}