fun main(args: Array<String>) {
    /**
     * STACK
     * Last in First Out
     * add() remove()
     */
    fun first(){
        val stack = arrayListOf<Int>()
        stack.add(1)
        stack.add(2)
        stack.add(3)
        println(stack)
        val last = stack.removeAt(stack.size - 1)
        println("last $last")
        val peek = stack.lastOrNull()
        println("peek $peek")
        println(stack)
        println("-----")
    }

    fun second(){
        val stack = ArrayDeque<Int>()
        stack.add(1)
        stack.add(2)
        stack.add(3)
        println(stack)
        val pop = stack.removeLast()
        println("last $pop")
        val peek = stack.lastOrNull()
        println("peek $peek")
        println(stack)
        println("-----")
    }

    fun third(){
        val stack = java.util.ArrayDeque<Int>()
        stack.add(1)
        stack.add(2)
        stack.add(3)
        println(stack)
        val pop = stack.pop()
        println("last $pop")
        val peek = stack.peek()
        println("peek $peek")
        println(stack)
    }


    first()
    second()
    third()
}