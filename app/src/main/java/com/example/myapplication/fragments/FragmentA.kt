package com.example.myapplication.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.myapplication.Communicator
import com.example.myapplication.R
import kotlinx.android.synthetic.main.fragment_a.view.*


class FragmentA : Fragment() {

    private lateinit var communicator: Communicator

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_a, container, false)

        communicator = activity as Communicator

        view.sendBtn.setOnClickListener {
            communicator.passDataCom(view.message_Input.text.toString())
        }
        return view
    }
}