package com.example.alliwanttodo.application

import com.example.alliwanttodo.application.dto.CreateMemberDto
import com.example.alliwanttodo.repository.MemberRepository
import org.springframework.stereotype.Service

@Service
class MemberService(
    private val memberRepository: MemberRepository,
) {
    fun createMember(dto: CreateMemberDto) {
        val entity = dto.toEntity()

        memberRepository.save(entity)
    }
}