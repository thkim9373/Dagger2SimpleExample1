package com.hoony.dagger2simpleexample.di

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.hoony.dagger2simpleexample.R
import kotlinx.android.synthetic.main.frag_coffee.*

class DIFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.frag_coffee, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setListener()
    }

    private fun setListener() {
        btCoffee.setOnClickListener {
            val coffeeLog = makingCoffee()

            tvDescription.text = coffeeLog
        }
    }

    private fun makingCoffee(): String {
        return Injection.provideCoffeeMaker().brew()
    }
}