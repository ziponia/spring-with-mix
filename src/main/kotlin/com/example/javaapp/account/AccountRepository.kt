package com.example.javaapp.account

import com.example.javaapp.common.AccountEntity
import org.springframework.data.jpa.repository.JpaRepository

interface AccountRepository: JpaRepository<AccountEntity, String> {
}
