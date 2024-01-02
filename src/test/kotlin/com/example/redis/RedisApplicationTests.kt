package com.example.redis

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class RedisApplicationTests {

    @Test
    fun contextLoads() {
        val testNum = 1
        assertThat(testNum).isEqualTo(1)
    }
    //changes2
}
