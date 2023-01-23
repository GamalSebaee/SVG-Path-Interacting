package com.gsapps.svgPathInteracting.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.gsapps.svgInteracting.R
import com.gsapps.svgInteracting.databinding.FragmentHomeBinding
import com.gsapps.svgPathInteracting.richpath.RichPath

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

       /* binding.icData.setOnPathClickListener {
          *//*  it?.fillColor= ContextCompat.getColor(requireContext(),
                R.color.purple_700);*//*
        }*/
        binding.icData.onPathClickListener = object : RichPath.OnPathClickListener{
            override fun onClick(richPath: RichPath) {
                richPath.fillColor= ContextCompat.getColor(requireContext(),
                    R.color.purple_700);
            }

        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
