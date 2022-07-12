package com.example.virginmoneychallenge.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.virginmoneychallenge.viewmodel.ViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
open class ViewModelFragment :Fragment() {
       protected val viewModel: ViewModel by activityViewModels()
}