package com.example.android.politicalpreparedness.representative.model

import com.example.android.politicalpreparedness.repository.network.models.Office
import com.example.android.politicalpreparedness.repository.network.models.Official

data class Representative (
        val official: Official,
        val office: Office
)