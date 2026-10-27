
data class Node(val value: String, var prev: Node? = null, var next: Node? = null)

class BrowserHistory(homepage: String) {
    var cur: Node? = Node(homepage)

    fun visit(url: String) {
        cur?.next = Node(url, cur, null)
        cur = cur?.next
    }

    fun back(steps: Int): String {
        var s = steps
        while (cur?.prev != null && s > 0) {
            cur = cur?.prev
            s--
        }
        return cur?.value!!
    }

    fun forward(steps: Int): String {
        var s = steps
        while (cur?.next != null && s > 0) {
            cur = cur?.next
            s--
        }
        return cur?.value!!
    }

}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * var obj = BrowserHistory(homepage)
 * obj.visit(url)
 * var param_2 = obj.back(steps)
 * var param_3 = obj.forward(steps)
 */