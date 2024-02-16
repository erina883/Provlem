Binary Trees first problem:


![Screenshot_2](https://github.com/erina883/Provlem/assets/61052816/51172822-dee1-442c-8c88-be0d3545f9e3)



fun main(){

    val tree1 = BinaryTree(1).apply {
    
        left = BinaryTree(2).apply {
        
            left = BinaryTree(4)
            right = BinaryTree(5)
        }
        right = BinaryTree(3).apply {
        
            left = BinaryTree(6)
            right = BinaryTree(7)
        }
    }

    val tree2 = BinaryTree(1).apply {
    
        left = BinaryTree(2).apply {
        
            left = BinaryTree(4)
            right = BinaryTree(5)
        }
        right = BinaryTree(3).apply {
        
            left = BinaryTree(6)
            right = BinaryTree(7)
        }
    }

    println(binaryTreeIsSame(tree1,tree2))
    
}


class BinaryTree(var value: Int){

    var left: BinaryTree? = null
    
    var right: BinaryTree? = null
    
}


fun binaryTreeIsSame(tree1: BinaryTree?, tree2: BinaryTree?): Boolean{

    if (tree1 == null  && tree2 == null) return true
    
    if (tree1?.value != tree2?.value) return false
    
    return binaryTreeIsSame(tree1?.left, tree2?.left) && binaryTreeIsSame(tree1?.right, tree2?.right)
    
}



Binary Trees second problem:


![Screenshot_3](https://github.com/erina883/Provlem/assets/61052816/d10d729d-c849-4f81-9252-ebb330ddc6e7)



fun main(){


    val tree1 = BinaryTree(1).apply {
    
        left = BinaryTree(2).apply {
        
            left = BinaryTree(4)
            right = BinaryTree(5)
        }
        right = BinaryTree(3).apply {
        
            left = BinaryTree(6)
            right = BinaryTree(7)
        }
    }

    val tree2 = BinaryTree(1).apply {
    
        left = BinaryTree(2).apply {
        
            left = BinaryTree(4)
            right = BinaryTree(5)
        }
        right = BinaryTree(3).apply {
        
            left = BinaryTree(6)

        }
    }

    println(binaryTreeIsSame(tree1,tree2))
}

class BinaryTree(var value: Int){

    var left: BinaryTree? = null
    var right: BinaryTree? = null
    
}

fun binaryTreeIsSame(tree1: BinaryTree?, tree2: BinaryTree?): Boolean{

    if (tree1 == null  && tree2 == null) return true
    if (tree1?.value != tree2?.value) return false
    return binaryTreeIsSame(tree1?.left, tree2?.left) && binaryTreeIsSame(tree1?.right, tree2?.right)
    
}


Binary Trees third problem:

![Screenshot_4](https://github.com/erina883/Provlem/assets/61052816/52ea65e6-3550-419f-a049-fec822786543)


fun main(){

    val tree1 = BinaryTree(1).apply {
    
        left = BinaryTree(2).apply {
        
            left = BinaryTree(4)
            right = BinaryTree(5)
        }
        right = BinaryTree(3).apply {
        
            left = BinaryTree(6)
            right = BinaryTree(7)
        }
    }

    val tree2 = BinaryTree(1).apply {
    
        left = BinaryTree(2).apply {
        
            left = BinaryTree(4)
            right = BinaryTree(5)
        }
        right = BinaryTree(3).apply {
        
            left = BinaryTree(6)
            right = BinaryTree(8)
        }
    }

    println(binaryTreeIsSame(tree1,tree2))
}

class BinaryTree(var value: Int){

    var left: BinaryTree? = null
    var right: BinaryTree? = null
}

fun binaryTreeIsSame(tree1: BinaryTree?, tree2: BinaryTree?): Boolean{

    if (tree1 == null  && tree2 == null) return true
    if (tree1?.value != tree2?.value) return false
    return binaryTreeIsSame(tree1?.left, tree2?.left) && binaryTreeIsSame(tree1?.right, tree2?.right)
}




2.  A list of coordinates are given, write an algorithm to detect if any 4 of them form a square. Come up with some sample test cases for all possible cases.
E.g. [[0, 0], [2, 0], [1, 1], [0, -1], [-1, -1], [0, 2], [0, 1], [1,0]]



import kotlin.math.pow

import kotlin.math.sqrt


data class Point(val x: Int, val y: Int)


fun distance(p1: Point, p2: Point): Double = sqrt((p2.x - p1.x.toDouble()).pow(2) + (p2.y - p1.y.toDouble()).pow(2))


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



3.Create a simple mobile which can do the following

    a.The app has a medium size icon at the center of the home page
    
    b.If you click on the icon it rotates by 180 deg with 1 sec animation
    
    c.If you click again it should stop the animation

    




https://github.com/erina883/Provlem/assets/61052816/d28dfc86-c4e4-4c09-a03e-d28ac49fbccf


