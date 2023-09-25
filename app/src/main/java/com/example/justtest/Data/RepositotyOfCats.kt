package com.example.justtest.Data


fun RepositoryOfCatsData() : MutableList<CatCardData> {
    val Jessie = CatCardData()
    Jessie.nameOfCat = "Jessie"
    Jessie.breedOfCat = "Unknown"
    Jessie.ageOfCat = 3
val Timmy = CatCardData()
    Timmy.nameOfCat = "Timmy"
    Timmy.breedOfCat = "Thai"
    Timmy.ageOfCat = 10
    val RepositoryOfCats = mutableListOf<CatCardData>(Jessie, Timmy)
    return RepositoryOfCats
}