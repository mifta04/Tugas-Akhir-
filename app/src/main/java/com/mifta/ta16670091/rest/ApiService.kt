package com.mifta.ta16670091.rest

import com.mifta.ta16670091.BuildConfig
import com.mifta.ta16670091.model.RootDataModel
import retrofit.http.GET
import rx.Observable

interface ApiService {
    // http://informatika.upgris.ac.id/mobile/data/index.php/api/example/detil_jadwal?key=83fbfe1f2309ec6095697548efcb26&npm=16670091
    @GET("detil_jadwal?key=" + BuildConfig.API_KEY + "&npm=" + BuildConfig.NPM)
    fun getJadwalKuliah(
    ): Observable<RootDataModel>

    @GET("detil_pribadi?key=" + BuildConfig.API_KEY + "&npm=" + BuildConfig.NPM)
    fun getProfil(
    ): Observable<RootDataModel>

}