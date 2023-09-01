package com.example.clientes.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.example.clientes.data.entities.Cliente

@Dao
interface  ClientesDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun save(Cliente: Cliente)
}