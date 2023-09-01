package com.example.clientes.di

import android.content.Context
import androidx.room.Room
import com.example.clientes.data.ClientesDB
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn( SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideTicketDatabase(@ApplicationContext appContext: Context): ClientesDB =
        Room.databaseBuilder(
            appContext,
            ClientesDB::class.java,
            "Clientes.db")
            .fallbackToDestructiveMigration()
            .build()
}