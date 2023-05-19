package com.example.alliwanttodo.config

import com.example.alliwanttodo.application.MemberService
import io.jsonwebtoken.Claims
import io.jsonwebtoken.Jwts
import io.jsonwebtoken.SignatureAlgorithm
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken
import org.springframework.security.core.Authentication
import java.util.*

class JwtUtils(
    private val memberService: MemberService,
) {
    fun createToken(username: String): String {
        val claims = Jwts.claims()
        claims["username"] = username

        return Jwts.builder()
            .setClaims(claims)
            .setExpiration(Date(System.currentTimeMillis() + EXP_TIME))
            .compact()
    }

    fun validation(token: String): Boolean {
        val claims = getAllClaims(token)
        val expirationDate = claims.expiration
        return expirationDate.after(Date())
    }

    fun parseUsername(token: String): String {
        val claims = getAllClaims(token)
        return claims["username"] as String
    }

    fun getAuthentication(username: String): Authentication {

        return UsernamePasswordAuthenticationToken()
    }

    private fun getAllClaims(token: String): Claims {
        return Jwts.parser()
            .setSign
    }
}

private const val EXP_TIME = 1000L * 60 * 3
private const val JWT_SECRET = "secret"