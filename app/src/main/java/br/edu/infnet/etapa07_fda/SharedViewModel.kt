package br.edu.infnet.etapa07_fda

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel: ViewModel() {

    private val _contadorFrag01: MutableLiveData<Int> by lazy {
        MutableLiveData<Int>().also {
            it.postValue(0)
        }
    }
    val contadorFrag01 : LiveData<Int> = _contadorFrag01
    fun setContadorFrag01(value: Int){
        _contadorFrag01.postValue(value)
    }

    private val _contadorFrag02: MutableLiveData<Int> by lazy {
        MutableLiveData<Int>().also {
            it.postValue(0)
        }
    }
    val contadorFrag02 : LiveData<Int> = _contadorFrag02
    fun setContadorFrag02(value: Int){
        _contadorFrag02.postValue(value)
    }



}