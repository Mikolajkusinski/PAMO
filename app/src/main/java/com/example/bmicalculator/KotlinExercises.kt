package com.example.bmicalculator

    /**
     * Exercise 01
     * Complete the code to make the program print "Mary is 20 years old" to standard output:
     * **/
//    fun main(args: Array<String>) {
//        val name = "Mary"
//        val age = 20
//
//        println("$name is $age years old")
//    }

    /**
     * Exercise 02
     * Explicitly declare the correct type for each variable:
     * **/
//    fun main() {
//        val a: Int = 1000
//        val b: String = "log message"
//        val c: Double = 3.14
//        val d: Long = 100_000_000_000
//        val e: Boolean = false
//        val f: Char = '\n' }
//    }

    /**
    * Exercise 03
    * You have a set of protocols supported by your server. A user requests to use a particular protocol.
     * Complete the program to check whether the requested protocol is supported or not
     * (isSupported must be a Boolean value).
    * **/

//    fun main() {
//        val SUPPORTED = setOf("HTTP", "HTTPS", "FTP")
//        val requested = "smtp"
//        val isSupported = requested.uppercase() in SUPPORTED
//        println("Support for $requested: $isSupported") }

    /**
    * Exercise 04
    * You have a program that counts pizza slices until there’s a whole pizza with 8 slices.
     * Refactor this program in two ways:
     * Use a while loop.
     * Use a do-while loop.
    * **/

//    fun main() {
//        var pizzaSlices = 0
//        while ( pizzaSlices < 7 ) {
//            pizzaSlices++
//            println("There's only $pizzaSlices slice/s of pizza :(")
//        }
//        pizzaSlices++
//        println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D") }

//    fun main() {
//        var pizzaSlices = 0
//        pizzaSlices++
//        do {
//            println("There's only $pizzaSlices slice/s of pizza :(")
//            pizzaSlices++
//        } while ( pizzaSlices < 8 )
//        println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D") }

    /**
    * Exercise 05
    * You have a list of words. Use for and if to print only the words that start with the letter l.
    * **/

//    fun main() { val words = listOf("dinosaur", "limousine", "magazine", "language")
//        for (word in words) {
//            if (word.startsWith("l")) println(word)
//        }
//    }

    /**
    * Exercise 06
    * You have a function that translates a time interval given in hours, minutes, and seconds into seconds.
     * In most cases, you need to pass only one or two function parameters while the rest are equal to 0.
     * Improve the function and the code that calls it by using default parameter values and named arguments so
     * that the code is easier to read.
    * **/

//    fun intervalInSeconds(hours: Int = 0, minutes: Int = 0, seconds: Int = 0) = ((hours * 60) + minutes) * 60 + seconds
//    fun main() {
//        println(intervalInSeconds(1, 20, 15))
//        println(intervalInSeconds(minutes = 1, seconds = 25))
//        println(intervalInSeconds(hours = 2))
//        println(intervalInSeconds(minutes = 10))
//        println(intervalInSeconds(hours = 1, seconds = 1)) }

    /**
    * Exercise 07
    * Write a function that takes an Int value and an action (a function with type () -> Unit)
     * which then repeats the action the given number of times.
     * Then use this function to print “Hello” 5 times.
    * **/

//    fun repeatN(n: Int, action: () -> Unit) { for (i in 1..n) { action() } }
//    fun main() { repeatN(5) { println("Hello") } }

    /**
    * Exercise 08
    * Define a data class Employee with two properties: one for a name, and another for a salary.
     * Make sure that the property for salary is mutable,
     * otherwise you won’t get a salary boost at the end of the year!
     * The main function demonstrates how you can use this data class.
    * **/

//    data class Employee(val name: String, var salary: Int)
//    fun main() {
//        val emp = Employee("Jonny", 1000)
//        println(emp)
//        emp.salary += 200
//        println(emp) }

    /**
    * Exercise 09
    * You have the employeeById function that gives you access to a database of employees of a company.
    * Unfortunately, this function returns a value of the Employee? type, so the result can be null.
    * Your goal is to write a function that returns the salary of an employee when their id is provided,
    * or 0 if the employee is missing from the database.
    * **/

//    data class Employee (val name: String, var salary: Int)
//    fun employeeById(id: Int) = when(id) {
//        1 -> Employee("Max", 1504)
//        2 -> null
//        3 -> Employee("Monica", 2315)
//        4 -> Employee("Piter", 2137)
//        else -> null }
//    fun salaryById(id: Int) = employeeById(id)?.salary ?: 0
//    fun main() { println((1..5).sumOf { id -> salaryById(id) }) }

    /**
    * Exercise 10
    * You have a list of actions supported by a web service,
    * a common prefix for all requests, and an ID of a particular resource.
    * To request an action title over the resource with ID: 5, you need to create the following URL:
     * https://example.com/book-info/5/title. Use a lambda expression to create a list of URLs from the list of actions.
    * **/

//    fun main() {
//        val actions = listOf("title", "year", "author")
//        val prefix = "https://example.com/book-info"
//        val id = 5
//        val urls = actions.map { action -> "$prefix/$id/$action" }
//        println(urls) }