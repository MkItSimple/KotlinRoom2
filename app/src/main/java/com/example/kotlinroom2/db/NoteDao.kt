package com.example.kotlinroom2.db

import androidx.room.*

@Dao
interface NoteDao {

    @Insert
    abstract fun addNote(note: Note)

    @Query("SELECT * FROM note")
    suspend fun getAllNotes() : List<Note>

    @Insert
    suspend fun addMultipleNotes(vararg note: Note)

    @Update
    suspend fun updateNote(note: Note)

    @Delete
    suspend fun deleteNote(note: Note)
}