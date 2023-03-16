package com.example.hm4m6.SecondFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.hm4m6.SecondFragment.ViewModel.MainViewModel
import hm4m6.R
import hm4m6.databinding.FragmentThirdBinding

class SecondFragment : Fragment() {


    private lateinit var binding: FragmentThirdBinding
    private lateinit var viewModel: MainViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentThirdBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(requireActivity()).get(MainViewModel::class.java)

        viewModel._counter.observe(viewLifecycleOwner, Observer { count ->
            binding.tv.text = count.toString()
        })
    }
}