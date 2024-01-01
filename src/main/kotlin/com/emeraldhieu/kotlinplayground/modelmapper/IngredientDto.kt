import java.time.LocalDate

data class IngredientDto(
    val name: String,
    val price: Double,
    val expirationDate: LocalDate
)
