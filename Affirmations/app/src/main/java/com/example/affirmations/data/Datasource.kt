package com.example.affirmations.data

import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

class Datasource() {

    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1, "https://i.imgur.com/VTKWBl2.jpeg"),
            Affirmation(R.string.affirmation2, "https://i.imgur.com/VTKWBl2.jpeg"),
            Affirmation(R.string.affirmation3, "https://i.imgur.com/VTKWBl2.jpeg"),
            Affirmation(R.string.affirmation4, "https://i.imgur.com/VTKWBl2.jpeg"),
            Affirmation(R.string.affirmation5, "https://i.imgur.com/VTKWBl2.jpeg"),
            Affirmation(R.string.affirmation6, "https://i.imgur.com/VTKWBl2.jpeg"),
            Affirmation(R.string.affirmation7, "https://i.imgur.com/VTKWBl2.jpeg"),
            Affirmation(R.string.affirmation8, "https://i.imgur.com/VTKWBl2.jpeg"),
            Affirmation(R.string.affirmation9, "https://i.imgur.com/VTKWBl2.jpeg"),
            Affirmation(R.string.affirmation10, "https://i.imgur.com/VTKWBl2.jpeg"))
    }
}
