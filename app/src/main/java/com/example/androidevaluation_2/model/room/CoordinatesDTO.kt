package com.example.androidevaluation_2.model.room


import com.google.gson.annotations.SerializedName


data class CoordinatesDTO(

	@field:SerializedName("latitude")
	val latitude: String? = null,

	@field:SerializedName("longitude")
	val longitude: String? = null
)