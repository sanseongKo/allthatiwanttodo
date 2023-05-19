package com.example.alliwanttodo.repository

import com.example.alliwanttodo.domain.Member
import org.springframework.data.jpa.repository.JpaRepository

interface MemberRepository: JpaRepository<Member, Long>