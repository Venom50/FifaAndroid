package com.example.fifa

import android.app.Application
import com.example.fifa.Viewmodels.PlayerViewModel
import org.koin.android.ext.koin.androidApplication
import org.koin.android.ext.koin.androidContext
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.core.context.startKoin
import org.koin.dsl.module

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            modules(
                listOf(module {
                    viewModel { PlayerViewModel(androidApplication()) }
                })
            )
        }
    }
}