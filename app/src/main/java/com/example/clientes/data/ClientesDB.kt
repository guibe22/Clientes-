package com.example.clientes.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.clientes.data.dao.ClientesDao
import com.example.clientes.data.entities.Cliente

@Database(
    entities = [Cliente::class],
    version = 3
)
abstract class ClientesDB: RoomDatabase() {
    abstract fun clientesDao(): ClientesDao
}