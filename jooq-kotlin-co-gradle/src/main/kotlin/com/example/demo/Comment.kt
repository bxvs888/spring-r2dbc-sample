package com.example.demo

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table
import java.time.LocalDateTime
import java.util.*

@Table(value = "comments")
data class Comment(
    @Id
    @Column("id")
    val id: UUID? = null,

    @Column("content")
    var content: String? = null,

    @Column("created_at")
    @CreatedDate
    val createdAt: LocalDateTime? = null,
)