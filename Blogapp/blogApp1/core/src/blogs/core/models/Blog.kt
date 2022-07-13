package blogs.core.models

import java.sql.Timestamp

data class Blog(
    val id: Long,
    val title: String,
    val content: String,
    val created_at:Timestamp,
    val updated_at:Timestamp,
    val userId:Long,
    val published:Boolean

)
