import java.time.LocalDate

data class PizzaDto(
    val name: String,
    val ingredient: IngredientDto,
) {
    private constructor() : this("", IngredientDto("", 0.0, LocalDate.now()))
}
