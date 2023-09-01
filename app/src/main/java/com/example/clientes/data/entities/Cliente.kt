package com.example.clientes.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Clientes")
data class Cliente (
    @PrimaryKey
    val ClienteId: Int?=null ,
    var Nombre: String = ""
)
