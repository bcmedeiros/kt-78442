package dev.bcmedeiros.kt78442

import java.util.UUID

data class Org(
    val id: Id,
    val name: String,
) {
    @JvmInline
    value class Id(val value: UUID)
}