package com.example.clientes.ui.theme.Cliente

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.clientes.data.ClientesDB
import com.example.clientes.data.entities.Cliente
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ClientesViewModel @Inject constructor (
    private val ClientesDB:ClientesDB
) : ViewModel() {
    var Nombre by mutableStateOf("")
    private val _isMessageShown = MutableSharedFlow<Boolean>()
    val isMessageShownFlow = _isMessageShown.asSharedFlow()

    fun setMessageShown() {
        viewModelScope.launch {
            _isMessageShown.emit(true)
        }
    }

    fun saveCliente() {
        viewModelScope.launch {
            val Cliente = Cliente(Nombre=Nombre)
            ClientesDB.clientesDao().save(Cliente)

        limpiar()

        }
    }
    private fun limpiar() {
        Nombre=""

    }
}