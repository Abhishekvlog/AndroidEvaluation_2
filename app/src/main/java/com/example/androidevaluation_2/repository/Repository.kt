package com.example.androidevaluation_2.repository

import com.example.androidevaluation_2.model.room.Api
import com.example.androidevaluation_2.model.room.Network
import com.example.androidevaluation_2.model.room.ProfileDAO
import com.example.androidevaluation_2.model.room.ProfileEntity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class Repository(val profileDAO: ProfileDAO) {

    private val retrofitApi = Network.getRetrofit().create(Api::class.java)
    private val 

    fun register(profileEntity: ProfileEntity){
        CoroutineScope(Dispatchers.IO).launch {
            profileDAO.refister(profileEntity)
        }
    }

    fun getProfile(email : String , DOB : String) : ProfileEntity{
        return profileDAO.getprofile(email, DOB)
    }


}