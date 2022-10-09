package com.frogobox.minimummvvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/*
 * Created by faisalamir on 08/02/22
 * recyclercoroutines
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 * Copyright (C) 2022 Mona Primaveras Inc.      
 * All rights reserved
 *
 */

class MainViewModel : ViewModel() {

    private val data = mutableListOf<MainData>()

    private var _listMainData = MutableLiveData<MutableList<MainData>>()
    val listMainData: LiveData<MutableList<MainData>> = _listMainData

    fun setupData() {
        data.add(MainData("Faisal Amir", 24))
        data.add(MainData("Faisal Amir", 24))
        data.add(MainData("Faisal Amir", 24))
        data.add(MainData("Faisal Amir", 24))
        data.add(MainData("Faisal Amir", 24))
        data.add(MainData("Faisal Amir", 24))
        data.add(MainData("Faisal Amir", 24))
        data.add(MainData("Faisal Amir", 24))
        data.add(MainData("Faisal Amir", 24))
        data.add(MainData("Faisal Amir", 24))
        _listMainData.postValue(data)
    }

}