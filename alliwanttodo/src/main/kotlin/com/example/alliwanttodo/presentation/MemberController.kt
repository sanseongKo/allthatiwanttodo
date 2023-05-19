package com.example.alliwanttodo.presentation

import com.example.alliwanttodo.application.MemberService
import com.example.alliwanttodo.presentation.reqBody.CreateMemberReqBody
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class MemberController(
    private val memberService: MemberService,
) {
    @PostMapping("/member")
    fun createMember(
        @RequestBody reqBody: CreateMemberReqBody
    ) {
        val dto = reqBody.toDto()

        memberService.createMember(dto)
    }


}