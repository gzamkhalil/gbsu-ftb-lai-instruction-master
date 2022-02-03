package com.kata.gbsuftblai.services

import org.springframework.stereotype.Component

@Component
class GbsuFtbLaiService {

    fun convertNumber(inputNumber: Int): String {
        var retval = ""
        if (inputNumber % 3 == 0) {
            retval += "Gbsu"
        }
        if (inputNumber % 5 == 0) {
            retval += "Ftb"
        }
        val inputString = Integer.valueOf(inputNumber).toString()
        for (i in 0 until inputString.length) {
            when (inputString[i]) {
                '3' -> retval += "Gbsu"
                '5' -> retval += "Ftb"
                '7' -> retval += "Lai"
            }
        }
        return if (retval === "") inputString else retval
    }

}