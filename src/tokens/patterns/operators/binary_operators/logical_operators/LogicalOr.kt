package tokens.patterns.operators.binary_operators.logical_operators

object LogicalOr : LogicalOperator() {
    override val matchedPattern = Regex("\\|\\|")
}