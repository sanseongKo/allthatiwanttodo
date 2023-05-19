package com.example.alliwanttodo.application.dto

import com.example.alliwanttodo.domain.Member
import java.time.OffsetDateTime


class CreateMemberDto(
    val name: String,
    val phoneNumber: String,
    val address: String,
    val email: String,
    val dateOfBirth: String,
) {
    fun toEntity(): Member {
        return Member(
            name = name,
            phoneNumber = phoneNumber,
            address = address,
            email = email,
            dataOfBirth = dateOfBirth,
            createdAt = OffsetDateTime.now(),
        )
    }
}