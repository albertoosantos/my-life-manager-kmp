package oliveira.alberto.mylifemanager

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform