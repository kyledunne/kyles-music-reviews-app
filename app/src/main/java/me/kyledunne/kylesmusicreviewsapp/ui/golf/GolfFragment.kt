package me.kyledunne.kylesmusicreviewsapp.ui.golf

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import me.kyledunne.kylesmusicreviewsapp.R

class GolfFragment : Fragment() {

    private lateinit var golfViewModel: GolfViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        golfViewModel =
            ViewModelProviders.of(this).get(GolfViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_golf, container, false)
        val textView: TextView = root.findViewById(R.id.text_golf)
        golfViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}