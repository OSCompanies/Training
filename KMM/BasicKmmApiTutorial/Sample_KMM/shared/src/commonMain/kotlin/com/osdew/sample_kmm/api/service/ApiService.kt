package com.osdew.sample_kmm

import com.osdew.sample_kmm.util.Const
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.request.get
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json

class ApiService {
    private val httpClient = HttpClient {
        install(ContentNegotiation) {
            json(Json {
                prettyPrint = true
                isLenient = true
                ignoreUnknownKeys = true
            })
        }
    }

    @Throws(Exception::class)
    suspend fun callApi(api: String): String {
        val result: String = httpClient.get(Const.BASE_URL + "/" + api).body()
        return result
    }

    // 회원정보 조회
    suspend fun getMemberInfo(): String {
        return callApi("getMemberInfo")
    }
}