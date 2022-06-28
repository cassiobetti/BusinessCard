package com.cassio.businnes_card

import android.app.Application
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cassio.businnes_card.data.AppDatabase
import com.cassio.businnes_card.data.BusinessCardRepository

class App : Application() {
    val database by lazy { AppDatabase.getDatabase(this) }
    val repository by lazy { BusinessCardRepository(database.businessDao()) }
}