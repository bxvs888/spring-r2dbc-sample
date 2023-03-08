package com.example.demo

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.Id
import org.springframework.data.annotation.Version
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table
import java.time.LocalDateTime
import java.util.*

@Table(value = "posts")
data class Post(
    @Id
    @Column("id")
    val id: UUID? = null,

    @Column("title")
    var title: String? = null,

    @Column("content")
    var content: String? = null,

    @Column("tags")
    var tags: List<String>? = emptyList(),

    @Column("status")
    var status: Status? = Status.DRAFT,

    @Column("created_at")
    @CreatedDate
    val createdAt: LocalDateTime? = null,

    @Column("version")
    @Version
    val version: Long? = null,
)