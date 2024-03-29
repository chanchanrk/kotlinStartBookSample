package com.example.qiitaclient.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class User(val id: String,
                val name: String,
                val profileImageUrl: String) : Parcelable