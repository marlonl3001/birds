import kotlinx.serialization.Serializable

@Serializable
data class Bird(
    val category: String,
    val path: String,
    val author: String
)
