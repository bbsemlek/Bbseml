package com.bbseemlek

import com.lagradost.cloudstream3.MainAPI
import com.lagradost.cloudstream3.TvType

class Anizium : MainAPI() {
    override var mainUrl = "https://anizium.co"
    override var name = "Anizium"
    override val supportedTypes = setOf(TvType.Anime)
}

