package com.example.a098_roomdatabase.repostori

import android.app.Application
import android.content.Context

interface ContainerApp {
    val RepositoriSiswa: RepositoriSiswa
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

class AplikasiSiswa : Application() {
    lateinit var container : ContainerApp

    override fun onCreate(){
        super.onCreate()
        container = ContainerDataApp(this)
    }

}