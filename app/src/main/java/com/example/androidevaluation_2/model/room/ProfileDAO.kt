package com.example.androidevaluation_2.model.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface ProfileDAO {

    @Insert(onConflict =  OnConflictStrategy.REPLACE)
    fun refister(profileEntity: ProfileEntity)

    @Query("Select * from profile_table where email = :email and dob = :DOB")
    fun getprofile(email : String , DOB : String) : ProfileEntity


}