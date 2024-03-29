package com.example.qiitaclient.model

import android.os.Parcelable
import com.example.qiitaclient.model.User
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Article(val id: String,
                   val title: String,
                   val url: String,
                   val user: User): Parcelable
