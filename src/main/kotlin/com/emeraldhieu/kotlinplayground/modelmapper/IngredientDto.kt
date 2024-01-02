import java.time.LocalDate

data class IngredientDto(
    val name: String,
    val price: Double,
    val expirationDate: LocalDate
) {
    private constructor() : this("", 0.0, LocalDate.now())
}
