package com.example.javaapp.common

import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.LocalDateTime
import java.util.UUID
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.MappedSuperclass
import javax.persistence.PrePersist

@MappedSuperclass
class BaseEntity {
    @CreationTimestamp
    var createdAt: LocalDateTime? = null

    @UpdateTimestamp
    var updatedAt: LocalDateTime? = null
}

@Entity
class PostEntity : BaseEntity() {

    @Id
    @GeneratedValue
    var id: Long? = null
    var title: String? = null

    @Column(columnDefinition = "text")
    var content: String? = null
}

@Entity
class AccountEntity : BaseEntity() {
    @Id
    var id: String? = null
    var email: String? = null
    var password: String? = null

    @PrePersist
    fun prePersist() {
        id = UUID.randomUUID().toString().replace("-", "")
    }
}
