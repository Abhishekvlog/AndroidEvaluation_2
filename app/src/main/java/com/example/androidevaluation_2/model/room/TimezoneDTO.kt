package com.example.androidevaluation_2.model.room

import com.google.gson.annotations.SerializedName

data class TimezoneDTO(

	@field:SerializedName("offset")
	val offset: String? = null,

	@field:SerializedName("description")
	val description: String? = null
)