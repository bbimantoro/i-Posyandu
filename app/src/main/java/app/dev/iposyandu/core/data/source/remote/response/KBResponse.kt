package app.dev.iposyandu.core.data.source.remote.response

import com.google.gson.annotations.SerializedName

data class KBResponse(

	@field:SerializedName("data")
	val data: List<KbItemResponse>
)

data class KbItemResponse(

	@field:SerializedName("nama")
	val nama: String? = null,

	@field:SerializedName("jenis")
	val jenis: String? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("stok")
	val stok: Int? = null
)
