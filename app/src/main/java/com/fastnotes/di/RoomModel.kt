package com.fastnotes.di

import com.fastnotes.app.NoteDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import com.fastnotes.data.NoteDataBase


@Module
@InstallIn(ViewModelComponent::class)
object RoomModel {

    @Provides
    @ViewModelScoped
    fun provideNoteDao(appDatabase: NoteDataBase): NoteDao {
        return appDatabase.noteDao()
    }


}