package com.example.androidevaluation_2.model.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "profile_table")
data class ProfileEntity (
    @ColumnInfo(name = "image") var image : Int,
    @ColumnInfo(name = "name") var name : String,
    @ColumnInfo(name = "gender") var gender : String,
    @ColumnInfo(name = "city") var city : String,
    @ColumnInfo(name = "country") var counrty : String,
    @ColumnInfo(name = "phone") var phone : Int,
    @ColumnInfo(name = "dob") var dob : String,
    @ColumnInfo(name = "email") var email : String
    ){

    @PrimaryKey(autoGenerate = true)@ColumnInfo(name = " id") var id :Int = 0

}