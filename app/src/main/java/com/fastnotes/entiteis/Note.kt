package com.fastnotes.entiteis

import android.os.Parcel
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(tableName = "notes")
class Note(
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,
    @ColumnInfo(name = "title")
    val title: String,
    @ColumnInfo(name = "date_time")
    val dateTime: String,
    @ColumnInfo(name = "subtitle")
    val subTitle: String,
    @ColumnInfo(name = "image_path")
    val imagePath: String? = null,
    @ColumnInfo(name = "note_text")
    var note_text: String? = null,
    @ColumnInfo(name = "color")
    val color: String? = null,
    @ColumnInfo(name = "weblink")
    val webLink: String? = null,
    @ColumnInfo(name = "type")
    val type: String? = null
) : Parcelable {
    override fun toString(): String {
        return "Note(id=$id, title='$title', dateTime='$dateTime', subTitle='$subTitle', imagePath=$imagePath, color=$color, webLink=$webLink,type='$type)"
    }

}