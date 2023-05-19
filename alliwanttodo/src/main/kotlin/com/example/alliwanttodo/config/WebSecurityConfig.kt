package com.example.alliwanttodo.config

import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity

@Configuration
@EnableWebSecurity
class WebSecurityConfig(
    private val jwtFilter: JwtFilter,
) {
}