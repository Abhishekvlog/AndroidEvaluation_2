package com.example.androidevaluation_2.model.room

import com.google.gson.annotations.SerializedName

data class RegisteredDTO(

	@field:SerializedName("date")
	val date: String? = null,

	@field:SerializedName("age")
	val age: Int? = null
)