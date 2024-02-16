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
