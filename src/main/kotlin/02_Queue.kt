fun main(args: Array<String>) {
    /**
     * QUEUE
     * First in First Out
     * add() removeAt() lastOrNull()
     */
    fun first() {
        val queueList = arrayListOf<Int>()
        queueList.add(0, 1)
        queueList.add(0, 2)
        queueList.add(0, 3)
        println(queueList)
        val poll = queueList.removeAt(queueList.size - 1)
        println("poll $poll")
        val peek = queueList.lastOrNull()
        println("peek $peek")
        println(queueList)
        println("-----")
    }

    fun second() {
        val queue = ArrayDeque<Int>()
        queue.add(1)
        queue.add(2)
        queue.add(3)
        println(queue)
        val poll = queue.removeFirst()
        println("poll $poll")
        val peek = queue.firstOrNull()
        println("peek $peek")
        println(queue)
        println("-----")
    }

    fun third(){
        val queue = java.util.ArrayDeque<Int>()
        queue.add(1)
        queue.add(2)
        queue.add(3)
        println(queue)
        val poll = queue.poll()
        println("poll $poll")
        val peek = queue.peek()
        println("peek $peek")
        println(queue)
        println("-----")
    }

    first()
    second()
    third()
}