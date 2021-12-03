fun main() {
    fun part1(input: List<String>): Int {
        if (input.isEmpty()) return 0;

        var count = 0;
        var previous: Int? = null;

        input.forEach {
            var current: Int = Integer.parseInt(it)
            previous?.let {
                if (current > previous!!) {
                    count += 1
                }
            }
            previous = current;
        };


        return count
    }

    fun part2(input: List<String>): Int {
        return input.size
    }

// test if implementation meets criteria from the description, like:
    val testInput = readInput("Day01_test")
    println(part1(testInput))
    check(part1(testInput) == 7)

    val input = readInput("Day01")
    println(part1(input))
    println(part2(input))
}
