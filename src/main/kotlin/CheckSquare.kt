import kotlin.math.pow
import kotlin.math.sqrt

data class Point(val x: Int, val y: Int)

fun distance(p1: Point, p2: Point): Double =
    sqrt((p2.x - p1.x.toDouble()).pow(2) + (p2.y - p1.y.toDouble()).pow(2))

fun isSquare(points: List<Point>): Boolean {
    val n = points.size
    for (i in 0 until n - 3) {
        for (j in i + 1 until n - 2) {
            for (k in j + 1 until n - 1) {
                for (l in k + 1 until n) {
                    val distances = listOf(
                        distance(points[i], points[j]),
                        distance(points[i], points[k]),
                        distance(points[i], points[l]),
                        distance(points[j], points[k]),
                        distance(points[j], points[l]),
                        distance(points[k], points[l])
                    ).sorted()

                    val side1 = distances[0]
                    val side2 = distances[1]
                    val diagonal = distances[2]
                    if (side1 == side2 && distances[3] == distances[4] && distances[5] == 2 * diagonal) {
                        return true
                    }
                }
            }
        }
    }
    return false
}

fun main() {
    val coordinates = listOf(
        Point(0, 0),
        Point(2, 0),
        Point(1, 1),
        Point(0, -1),
        Point(-1, -1),
        Point(0, 2),
        Point(0, 1),
        Point(1, 0)
    )
    println("Do any 4 points form a square? ${isSquare(coordinates)}")
}
