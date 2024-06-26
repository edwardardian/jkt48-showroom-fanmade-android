package com.example.jkt48showroom.data.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Member(
    @SerializedName("isTrainee") val isTrainee: Boolean,
    val roomId: Int,
    @SerializedName("main_name") var name: String,
    val description: String,
    val recommend_comment_url: String,
    val room_level: Int,
    val genre_name: String,
    val onLive: Boolean,
    val liveDate: String,
    val liveViews: Int,
    val liveTime: String,
    val liveGifts: Int,
    @SerializedName("image") val image: String,
    val image_square: String,
    @SerializedName("follower_num") val follower: Int,
) : Parcelable