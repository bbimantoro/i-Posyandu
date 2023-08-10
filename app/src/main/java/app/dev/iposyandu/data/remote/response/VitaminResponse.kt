package app.dev.iposyandu.data.remote.response

import com.google.gson.annotations.SerializedName

data class VitaminResponse(

	@field:SerializedName("data")
	val data: List<VitaminItemResponse>
)

data class VitaminItemResponse(

	@field:SerializedName("usia")
	val usia: String? = null,

	@field:SerializedName("nama")
	val nama: String? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("stok")
	val stok: Int? = null
)
