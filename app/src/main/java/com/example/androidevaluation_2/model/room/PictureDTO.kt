package com.example.androidevaluation_2.model.room

import com.google.gson.annotations.SerializedName

data class PictureDTO(

	@field:SerializedName("large")
	val large: String? = null,

	@field:SerializedName("medium")
	val medium: String? = null,

	@field:SerializedName("thumbnail")
	val thumbnail: String? = null
)