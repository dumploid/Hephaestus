package tokens.operators.binary_operators.comparison_operators

object LessThanOrEqualOperator : ComparisonOperator() {
    override val matchedPattern = Regex("<=")
}