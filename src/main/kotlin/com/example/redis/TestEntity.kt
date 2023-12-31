package com.example.redis

import org.springframework.data.annotation.Id
import org.springframework.data.redis.core.RedisHash


@RedisHash("Test")
data class TestEntity(
    @Id
    val id: String,
    val name: String,
    val age: Int
)
