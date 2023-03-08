package com.example.demo

import java.util.*

data class PostSummary(var id: UUID? = null, var title: String? = null, val commentsCount: Long? = 0)