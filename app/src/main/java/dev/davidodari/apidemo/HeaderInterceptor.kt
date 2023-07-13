package dev.davidodari.apidemo

import okhttp3.Interceptor

object HeaderInterceptor : Interceptor {

    override fun intercept(chain: Interceptor.Chain): okhttp3.Response {
        val request = chain.request()
        val newRequest = request.newBuilder()
            .addHeader("Authorization", "Bearer ${BuildConfig.ACCESS_TOKEN}")
            .build()
        return chain.proceed(newRequest)
    }
}
