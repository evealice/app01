package com.example.app01.dataHandlers

data class DataApi01(
    val data: DataContainer
)

data class DataContainer(
    val rule_hits: List<RuleHit>,
    val ownship: OwnShip,
    val situation_level: String,
    val situation_score: Int
)

data class OwnShip(
    val lat: Double,
    val lon: Double,
    val sog_kn: Double
)

data class RuleHit(
    val message: String
)