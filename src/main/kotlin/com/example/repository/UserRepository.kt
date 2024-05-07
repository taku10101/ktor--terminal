package com.example.repository

import com.example.model.User
import java.util.UUID

class UserRepository {;
    private val users = mutableListOf<User>()

    fun finedAll(): List<User> {
        return users
    }

    fun finedById(id: UUID
    ): User? {
        return users.firstOrNull { it.id == id }
    }

    fun finedByUsername(username: String): User? {
        return users.firstOrNull { it.username == username }
    }

    fun save(user: User): Boolean {
        return users.add(user)
    }


}