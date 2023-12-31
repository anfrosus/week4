package com.example.redis

import org.springframework.data.repository.CrudRepository

interface TestRepo : CrudRepository<TestEntity, String>{
}