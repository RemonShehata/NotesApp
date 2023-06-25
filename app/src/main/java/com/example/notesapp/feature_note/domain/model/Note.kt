package com.example.notesapp.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.notesapp.ui.theme.Pink80
import com.example.notesapp.ui.theme.Purple80
import com.example.notesapp.ui.theme.PurpleGrey40

@Entity
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
) {
    companion object {
        val noteColors = listOf(
            Purple80,
            PurpleGrey40,
            Pink80
        )
    }
}
