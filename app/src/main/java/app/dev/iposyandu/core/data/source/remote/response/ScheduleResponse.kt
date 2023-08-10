package app.dev.iposyandu.core.data.source.remote.response

import com.google.gson.annotations.SerializedName

data class ScheduleResponse(

	@field:SerializedName("data")
	val data: List<ScheduleItemResponse>
)

data class ScheduleItemResponse(

	@field:SerializedName("lokasi")
	val lokasi: String? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("tanggal")
	val tanggal: String? = null,

	@field:SerializedName("status")
	val status: String? = null
)
