package com.example.androidevaluation_2.model.room

import com.google.gson.annotations.SerializedName

data class ResponseDTO(

	@field:SerializedName("results")
	val results: List<ResultsDTO?>? = null,

	@field:SerializedName("info")
	val info: InfoDTO? = null
)