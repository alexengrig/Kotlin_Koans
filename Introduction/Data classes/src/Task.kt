class Person(private val name: String, private val age: Int){
    override fun toString(): String {
        return "Person(name=$name, age=$age)"
    }
}

fun getPeople(): List<Person> {
    return listOf(Person("Alice", 29), Person("Bob", 31))
}
