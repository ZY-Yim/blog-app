package com.mszlu.blog.utils;

import io.jsonwebtoken.Jwt;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author yanzhiyu
 * @date 2025/3/12
 */
public class JWTUtils {
    private static final String JWT_TOKEN = "123456Mszlu!@#$$";

    public static String createToken(Long userId) {
        Map<String, Object> claims = new HashMap<>();
        claims.put("userId", userId);
        JwtBuilder jwtBuilder = Jwts.builder()
                // 签发算法，秘钥为jwtToken
                .signWith(SignatureAlgorithm.HS256, JWT_TOKEN)
                // body数据，要唯一，自行设置
                .setClaims(claims)
                // 设置签发时间
                .setIssuedAt(new Date())
                // 一天的有效时间
                .setExpiration(new Date(System.currentTimeMillis() + 24L * 60 * 60 * 60 * 1000));
        return jwtBuilder.compact();
    }

    public static Map<String, Object> checkToken(String token) {
        try {
            Jwt parse = Jwts.parser().setSigningKey(JWT_TOKEN).parse(token);
            return (Map<String, Object>) parse.getBody();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        String token = JWTUtils.createToken(1L);
        System.out.println(token);
        Map<String, Object> map = JWTUtils.checkToken(token);
        System.out.println(map.get("userId"));
    }
}
