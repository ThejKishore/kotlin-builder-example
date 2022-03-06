package me.thej.model

import io.konform.validation.Validation
import io.konform.validation.jsonschema.maxLength
import io.konform.validation.jsonschema.maximum
import io.konform.validation.jsonschema.minLength
import io.konform.validation.jsonschema.minimum

object Validation {

    @JvmStatic val validateEmployee = Validation<Employee> {
        Employee::firstName ifPresent  {
            minLength(1)
            maxLength(10) hint "Max length can't be more than 10 characters"
        }

        Employee::lastName required {}

        Employee::id ifPresent  {
            minimum(1)
            maximum(10)
        }

    }

}