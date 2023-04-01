package com.example.latihan_navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.latihan_navigationcomponent.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val getNama = HomeFragmentArgs.fromBundle(arguments as Bundle).name
        binding.tvSetUsername.text= getNama

        binding.imgProfile.setOnClickListener {
            val direction = HomeFragmentDirections.actionHomeFragmentToProfileFragment2()
            direction.name = getNama
            findNavController().navigate(direction)
        }
    }
}