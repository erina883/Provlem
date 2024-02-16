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