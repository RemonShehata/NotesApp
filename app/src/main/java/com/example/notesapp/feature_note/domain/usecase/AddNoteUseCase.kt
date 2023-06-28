package com.example.notesapp.feature_note.domain.usecase

import com.example.notesapp.feature_note.domain.model.InvalidNoteException
import com.example.notesapp.feature_note.domain.model.Note
import com.example.notesapp.feature_note.domain.repository.NoteRepository

class AddNoteUseCase(private val repository: NoteRepository) {

    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        if (note.title.isBlank()) {
            throw InvalidNoteException("title can't be empty")
        }
        if (note.content.isBlank()) {
            throw InvalidNoteException("content can't be blank")
        }
        repository.insertNote(note)
    }
}