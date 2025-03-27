class CounterG {

    static Map<Integer, Integer> countElementsClassic(List<Integer> list) {
        def frequencyMap = [:].withDefault { 0 }
        list.each { num -> frequencyMap[num]++ }
        return frequencyMap
    }

    // Функциональный подход (Groovy way)
    static Map<Integer, Integer> countElementsGroovy(List<Integer> list) {
        return list.countBy { it }
    }

    static void main(String[] args) {
        def inputList = [1, 3, 4, 5, 1, 5, 4]

        println("Classic approach: " + countElementsClassic(inputList))
        println("Groovy approach: " + countElementsGroovy(inputList))
    }
}