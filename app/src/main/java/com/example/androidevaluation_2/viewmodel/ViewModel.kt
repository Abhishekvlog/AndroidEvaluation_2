package com.example.androidevaluation_2.viewmodel

import androidx.lifecycle.ViewModel
import com.example.androidevaluation_2.model.room.ProfileEntity
import com.example.androidevaluation_2.repository.Repository

class ViewModel(val repository: Repository) : ViewModel(){

    fun newRegister(profileEntity: ProfileEntity){
        repository.register(profileEntity)
    }

    fun getProfile(email : String , dob : String) : ProfileEntity{
        return repository.getProfile(email, dob)
    }


}