package com.example.redis

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
class TestController(
    private val testRepo: TestRepo
) {

    @PostMapping("/test")
    fun createTest(){
        val newTest = TestEntity(
            id = "key1",
            name = "test1",
            age = 30
        )

        testRepo.save(newTest)
    }

    @GetMapping("/test")
    fun getTest(): TestEntity? {
        return testRepo.findById("key1").orElseThrow()
    }

    @GetMapping("/do")
    fun sayHello(): String {
        return "Hello"
    }
}