package me.thej.model.test

import arrow.core.rightIfNotNull
import me.thej.model.Customer
import me.thej.model.Employee
import me.thej.model.Validation

class TestDriver

fun main() {
    println(" Inside the kotlin main method")

    val employee = Employee.builder().id(1).firstName("Thej").lastName("Karuneegar").build()

    println("employee = ${employee}")
    val employee1 = employee.toBuilder().firstName("Thej Kishore").build()
    println("employee1 = ${employee1}")
    val validator = Validation.validateEmployee(employee1)
    validator.errors.forEach{ println(it.message)}

    val customer = Customer("thej", "karuneegar" , 37)

}