package com.example.androidevaluation_2.model.room

import com.google.gson.annotations.SerializedName

data class IdDTO(

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("value")
	val value: String? = null
)