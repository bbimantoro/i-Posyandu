package app.dev.iposyandu.core.data.source.remote.retrofit

import app.dev.iposyandu.core.data.source.remote.response.KaderItemResponse
import app.dev.iposyandu.core.data.source.remote.response.KbItemResponse
import app.dev.iposyandu.core.data.source.remote.response.PesertaItemResponse
import app.dev.iposyandu.core.data.source.remote.response.ScheduleItemResponse
import app.dev.iposyandu.core.data.source.remote.response.VitaminItemResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface PosyanduApiService {
    @GET("api/schedule")
    suspend fun getAllSchedule(): List<ScheduleItemResponse>

    @GET("api/peserta")
    suspend fun getAllPeserta(): List<PesertaItemResponse>

    @GET("api/peserta/{id}")
    suspend fun getPesertaById(
        @Path("id") id: String
    ): PesertaItemResponse

    @GET("api/kader")
    suspend fun getAllKader(): List<KaderItemResponse>

    @GET("api/kader{id}")
    suspend fun getKaderById(
        @Path("id") id: String
    ): KaderItemResponse

    @GET("api/vitamin")
    suspend fun getAllVitamin(): List<VitaminItemResponse>

    @GET("api/vitamin/{id}")
    suspend fun getVitaminById(
        @Path("id") id: String
    ): VitaminItemResponse

    @GET("api/kb")
    suspend fun getAllKb(): List<KbItemResponse>

    @GET("api/kb/{id}")
    suspend fun getKbById(
        @Path("id") id: String
    ): KbItemResponse
}