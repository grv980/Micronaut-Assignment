package blogs.core.services

import blogs.core.models.Blog
import blogs.core.models.user


interface BlogRepository {
    fun getAll(): List<Blog>
    fun fetchBlogById(blogId: Long): List<Blog>
    fun createUser(username:String):List<user>
    fun createUserBlog(userId:Long,title:String,content:String):List<Blog>
    fun updateUserBlog(userId:Long,title:String,content:String):List<Blog>
    fun deleteUserBlog(userId:Long,blog:Long):List<Blog>
    fun displayUserBlog(userId: Long):List<Blog>
    fun displayAllUser():List<user>
    fun getUser(userId: Long):List<user>
}
