package com.fastnotes.app

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import xyz.doikki.videoplayer.exo.ExoMediaPlayerFactory
import xyz.doikki.videoplayer.player.VideoViewConfig
import xyz.doikki.videoplayer.player.VideoViewManager

@HiltAndroidApp
class BaseApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        VideoViewManager.setConfig(
            VideoViewConfig.newBuilder()
                .setPlayerFactory(ExoMediaPlayerFactory.create())
                .build()
        )
    }
}