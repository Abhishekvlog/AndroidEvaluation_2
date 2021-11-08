package com.example.androidevaluation_2.model.room

import com.google.gson.annotations.SerializedName

data class StreetDTO(

	@field:SerializedName("number")
	val number: Int? = null,

	@field:SerializedName("name")
	val name: String? = null
)