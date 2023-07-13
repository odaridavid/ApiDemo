package dev.davidodari.apidemo

// generate json schema
val json = """
{
   "first_name":"John",
   "address":{
      "street":"Main Street",
      "city":"New York"
   },
    "age":30,
    "cars":[ "Ford", "BMW", "Fiat" ]
}
""".trimIndent()
