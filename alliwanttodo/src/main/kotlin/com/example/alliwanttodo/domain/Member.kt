package com.example.alliwanttodo.domain

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.time.OffsetDateTime

@Entity
class Member(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long = 0,
    val name: String,
    val phoneNumber: String,
    val address: String,
    val email: String,
    val dataOfBirth: String,
    val createdAt: OffsetDateTime,
    val updatedAt: OffsetDateTime? = null,
)