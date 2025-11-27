package com.example.a098_roomdatabase.viewmodel.provider

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.a098_roomdatabase.repostori.AplikasiSiswa
import com.example.a098_roomdatabase.viewmodel.EntryViewModel
import com.example.a098_roomdatabase.viewmodel.HomeViewModel

object PenyediaViewModel{
    val Factory = viewModelFactory {
        initializer {
            HomeViewModel(aplikasiSiswa().container.RepositoriSiswa)
        }
        initializer {
            EntryViewModel(aplikasiSiswa().container.RepositoriSiswa)
        }
    }
}

/**
 * Fungsi ekstensi query untuk objek Application dan mengembalikan sebuah instance dari
 * AplikasiSiswa
 */

fun CreationExtras.aplikasiSiswa(): AplikasiSiswa =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as AplikasiSiswa)