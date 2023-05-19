package com.example.alliwanttodo.presentation.reqBody

import com.example.alliwanttodo.application.dto.CreateMemberDto

class CreateMemberReqBody (
    val name: String,
    val phoneNumber: String,
    val address: String,
    val email: String,
    val dateOfBirth: String
) {
    fun toDto(): CreateMemberDto {
        return CreateMemberDto(
            name = name,
            phoneNumber = phoneNumber,
            address = address,
            email = email,
            dateOfBirth = dateOfBirth,
        )
    }
}