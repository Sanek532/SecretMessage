package com.bignerdranch.android.secretmessage
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bignerdranch.android.secretmessage.R

class WelcomeFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Заполнение макета для этого фрагмента
        return inflater.inflate(R.layout.fragment_welcome, container, false)
    }
}