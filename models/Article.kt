package com.example.thenewsapp.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity (
    tableName = "articles"
)

data class Article(

    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,

    val author: String?,
    val content: String?,
    val description: String?,
    val publishedAt: String,
    val source: Source,
    val title: String,
    val url: String,
    val urlToImage: String,

     @ColumnInfo(name = "category")
     val category: String? = null

): Serializable {

    override fun hashCode(): Int {
        var result = id.hashCode()
        result = 31 * result + (url?.hashCode() ?: 0)
        return result
    }
}
