// User.kt
package com.tlu.tlucontact.data.model

import androidx.compose.ui.semantics.Role

data class User(
    val id: String = "",
    val email: String = "",
    val displayName: String = "",
    val phoneNumber: String = "",
    val photoURL: String = "",
    val role: String = "",  // "staff", "student", or "guest"
    val verified: Boolean = false
) {
    fun isStaff(): Boolean {
        return role.equals("staff", ignoreCase = true)
    }

    fun isStudent(): Boolean {
        return role.equals("student", ignoreCase = true)
    }

    fun isGuest(): Boolean {
        return role.equals("guest", ignoreCase = true) || role.isEmpty()
    }
}