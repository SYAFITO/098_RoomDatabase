package com.example.a098_roomdatabase.repostori

import android.content.Context
import com.example.a098_roomdatabase.room.DatabaseSiswa

interface ContainerApp {
    val repositorSiswa : RepositorSiswa
}

class ContainerDataApp(private val context: Context):
        ContainerApp {
    override val repositorSiswa: RepositorSiswa by lazy {
        OfflineRepositorSiswa(
            siswaDao = DatabaseSiswa.getDatabase(context).siswaDao()
        )
    }

}