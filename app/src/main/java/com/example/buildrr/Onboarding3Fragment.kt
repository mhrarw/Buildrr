package com.example.buildrr

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.cardview.widget.CardView
import androidx.core.os.bundleOf

class Onboarding3Fragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val fragment = inflater.inflate(R.layout.fragment_onboarding3, container, false)

        val toPilihLogin = fragment.findViewById<CardView>(R.id.card_masuk)
        toPilihLogin.setOnClickListener{
            val intent = Intent (getActivity(), PilihLogin::class.java)
            startActivity(intent)
        }

        val toPilihLogin2 = fragment.findViewById<CardView>(R.id.card_daftar)
        toPilihLogin2.setOnClickListener{
            val intent = Intent (getActivity(), PilihLogin::class.java)
            startActivity(intent)
        }

        return fragment




    }



    }







