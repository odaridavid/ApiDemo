package dev.davidodari.apidemo

import org.json.JSONArray
import org.json.JSONObject

fun parseJson(json: String): String {
    return try {
        val json = JSONObject(json)

        val name = json.getString("first_name")
        val address = json.getJSONObject("address")
        val street = address.getString("street")
        val city = address.getString("city")
        val age = json.getInt("age")
        val cars = json.getJSONArray("cars")
        val car1 = cars.getString(0)
        ""
    }catch (e: Exception){
        e.printStackTrace()
        ""
    }


}
