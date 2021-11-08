package com.example.androidevaluation_2.model.room

import javax.annotation.Generated
import com.google.gson.annotations.SerializedName
import java.io.Serializable

@Generated("com.robohorse.robopojogenerator")
data class InfoDTO(

	@field:SerializedName("seed")
	val seed: String? = null,

	@field:SerializedName("results")
	val results: Int? = null,

	@field:SerializedName("page")
	val page: Int? = null,

	@field:SerializedName("version")
	val version: String? = null
)