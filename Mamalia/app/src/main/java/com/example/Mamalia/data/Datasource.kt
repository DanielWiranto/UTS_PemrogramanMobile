package com.example.Mamalia.data

import com.example.Mamalia.R
import com.example.Mamalia.model.Hewan

class Datasource {
    fun loadHewan(): List<Hewan> {
        return listOf<Hewan>(
            Hewan(R.string.Mamal1, R.drawable.h1),
            Hewan(R.string.Mamal2, R.drawable.h2),
            Hewan(R.string.Mamal3, R.drawable.h3),
            Hewan(R.string.Mamal4, R.drawable.h4),
            Hewan(R.string.Mamal5, R.drawable.h5),
            Hewan(R.string.Mamal6, R.drawable.h6),
            Hewan(R.string.Mamal7, R.drawable.h7),
            Hewan(R.string.Mamal8, R.drawable.h8),
            Hewan(R.string.Mamal9, R.drawable.h9),
            Hewan(R.string.Mamal10, R.drawable.h10)
        )
    }
}