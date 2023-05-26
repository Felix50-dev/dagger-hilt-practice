package com.example.dagger_hilt_practice.ui.theme

import androidx.lifecycle.ViewModel
import com.example.dagger_hilt_practice.domain.repository.MyRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class MyViewModel @Inject constructor(
    private val myRepositoryImpl: dagger.Lazy <MyRepository>
): ViewModel() {

    init {
        myRepositoryImpl.get()
    }

}