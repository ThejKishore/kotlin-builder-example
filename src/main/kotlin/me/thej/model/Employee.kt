package me.thej.model

import com.thinkinglogic.builder.annotation.Builder


@Builder
data class Employee( val id: Int , val firstName:String , val lastName:String){
    fun toBuilder(): EmployeeBuilder = EmployeeBuilder(this)
    companion object {
        @JvmStatic fun builder() = EmployeeBuilder()
    }
}


