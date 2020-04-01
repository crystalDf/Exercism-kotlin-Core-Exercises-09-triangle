class Triangle<out T : Number>(private val a: T, private val b: T, private val c: T) {

    init {
        require((a.toDouble() > 0) && (b.toDouble() > 0) && (c.toDouble() > 0))
        require((a.toDouble() + b.toDouble() >= c.toDouble()))
        require((b.toDouble() + c.toDouble() >= a.toDouble()))
        require((c.toDouble() + a.toDouble() >= b.toDouble()))
    }

    val isEquilateral: Boolean = (a == b) && (b == c) && (c == a)
    val isIsosceles: Boolean = (a == b) || (b == c) || (c == a)
    val isScalene: Boolean = (a != b) && (b != c) && (c != a)
}
