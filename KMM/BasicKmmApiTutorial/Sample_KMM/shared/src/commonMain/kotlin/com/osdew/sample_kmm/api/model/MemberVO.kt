import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MemberVO(
    @SerialName("name")
    val name: String,
    @SerialName("age")
    val age: Int,
    @SerialName("height")
    val height: String,
)
