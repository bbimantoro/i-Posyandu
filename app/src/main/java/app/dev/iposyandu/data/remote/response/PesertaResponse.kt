package app.dev.iposyandu.data.remote.response

import com.google.gson.annotations.SerializedName

data class PesertaResponse(

	@field:SerializedName("data")
	val data: List<PesertaItemResponse>
)

data class PesertaItemResponse(

	@field:SerializedName("nama")
	val nama: String? = null,

	@field:SerializedName("tempat_lahir")
	val tempatLahir: String? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("no_telp")
	val noTelp: String? = null,

	@field:SerializedName("tanggal_lahir")
	val tanggalLahir: String? = null,

	@field:SerializedName("alamat")
	val alamat: String? = null
)
