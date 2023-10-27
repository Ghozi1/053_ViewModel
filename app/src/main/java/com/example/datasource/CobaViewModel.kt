package com.example.datasource

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.datasource.Data.Dataform
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class CobaViewModel : ViewModel(){
    var namaUsr : String by mutableStateOf("")
        private set
    var noTlp : String by mutableStateOf("")
        private set
    var jenisKl : String by mutableStateOf("")
        private set
    var email : String by mutableStateOf("")
        private set
    var addres : String by mutableStateOf("")
        private set
    var sts : String by mutableStateOf("")
        private set
    private val _uiState = MutableStateFlow(Dataform())
    val uiState : StateFlow<Dataform> = _uiState.asStateFlow()

    fun insertData(nm : String, tlp : String, jk : String, Email : String, alm : String, status : String){
        namaUsr = nm;
        noTlp = tlp;
        jenisKl = jk
        email = Email;
        addres = alm;
        sts = status;
    }

    fun setJenisk (pilihJK : String){
        _uiState.update { currentState -> currentState.copy(sex = pilihJK) }
    }

    fun status (pilihSt : String){
        _uiState.update { currentState -> currentState.copy(status = pilihSt) }
    }
}
