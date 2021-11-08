package com.example.androidevaluation_2.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.androidevaluation_2.repository.Repository

class ViewModelFactory (val repository: Repository) : ViewModelProvider.Factory{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return ViewModel(repository)  as T
    }
}