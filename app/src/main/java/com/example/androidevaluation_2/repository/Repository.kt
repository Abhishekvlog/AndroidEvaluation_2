package com.example.androidevaluation_2.repository

import com.example.androidevaluation_2.model.room.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import okhttp3.Response
import retrofit2.Call

class Repository(val profileDAO: ProfileDAO) {

    private val retrofitApi = Network.getRetrofit().create(Api::class.java)


    fun getRemoteProfile(){
        CoroutineScope(Dispatchers.IO).launch {
            val response = retrofitApi.getData()
            saveToDb(response)
        }
    }

    private fun saveToDb(response: Call<Response>) {

    }

    fun register(profileEntity: ProfileEntity){
        CoroutineScope(Dispatchers.IO).launch {
            profileDAO.refister(profileEntity)
        }
    }

    fun getProfile(email : String , DOB : String) : ProfileEntity{
        return profileDAO.getprofile(email, DOB)
    }

    fun createProfileAPI(resultsDTO: ResultsDTO ){
        CoroutineScope(Dispatchers.IO).launch {

        }
    }


}