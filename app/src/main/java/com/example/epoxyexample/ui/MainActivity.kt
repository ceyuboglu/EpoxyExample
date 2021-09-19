package com.example.epoxyexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.airbnb.epoxy.EpoxyRecyclerView
import com.airbnb.epoxy.carousel
import com.example.epoxyexample.data.entity.BaseApiResponse
import com.example.epoxyexample.ui.MainViewModel

class MainActivity() : AppCompatActivity() {

    val mainvm : MainViewModel by lazy {
        ViewModelProvider(this).get(MainViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainvm.getAllCharacters()
        mainvm.charactersLiveData.observe(this,{
            it?.let {
                setupEpoxyRv(it)
            }
        })

    }

    private fun setupEpoxyRv(heroes: BaseApiResponse) {
        val epoxyRV = findViewById<EpoxyRecyclerView>(R.id.epoxyRecyclerView)
        epoxyRV.withModels {
            // First title
            title {
                id("title-id")
                title("Carousel")
            }

            // Carousel Item
            val carouselItemModels = heroes.toList().map { currentItem ->
                HeroCarouselBindingModel_()
                    .id(currentItem.id)
                    .carouselItem(currentItem)
                    .clickListener { v ->
                    }
            }

            // Carousel
            // This extension function come with epoxy
            carousel {
                id("herocarousel")
                models(carouselItemModels)
            }

            // Heroes title
            // item_title.xml
            title {
                id("title-id")
                title("Super Heroes")
            }

            // Heroes
            heroes.forEach { currentHero ->
                // item_hero.xml
                hero {
                    id(currentHero.id)
                    hero(currentHero)
                    clickListener { v ->
                        println("clicked: "+currentHero)
                    }
                }
            }
        }
    }
}