package app.dev.iposyandu.core.data.source.remote.response

import com.google.gson.annotations.SerializedName

data class KaderResponse(

	@field:SerializedName("data")
	val data: List<KaderItemResponse>
)

data class KaderItemResponse(

	@field:SerializedName("nama")
	val nama: String? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("no_telp")
	val noTelp: String? = null,

	@field:SerializedName("alamat")
	val alamat: String? = null
)
