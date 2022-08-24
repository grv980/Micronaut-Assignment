package blogs


import io.kotest.core.spec.style.BehaviorSpec


import io.kotest.matchers.shouldBe
import io.micronaut.test.annotation.MicronautTest
import utility.ResponseType




@MicronautTest
class BlogApiTest (
    private val blogControllerImpl: BlogControllerImpl
          ):BehaviorSpec ({
        given("displaying all blogs") {
        `when`("the blog API is called /api/v1/blogs") {
            val result = blogControllerImpl.getAll()
            then("display success"){
                result.status shouldBe ResponseType.SUCCESS
            }
        }

            given("creating blog"){
            `when`("the blog API is called /api/v1/user/{userid}/blog"){
                val result = blogControllerImpl.createUserBlog(1,"kotlin","kotest5")
                then("display success"){
                    result.status shouldBe ResponseType.SUCCESS
                }
            }
            given("blog update by user") {
                `when`("the blog API is called /api/v1/user{userId}/blog/{blogId}"){
                    val result = blogControllerImpl.updateUserBlog(1,67,"kotlin","kotest5")
                    then("display success")
                    result.status shouldBe ResponseType.SUCCESS
                }

            }
            given("blog deleted by user"){
                `when`("the blog API is called /api/v1/user/{userId}/blog/{blogId}"){
                    val result = blogControllerImpl.deleteUserBlog(1,67)
                    then("display success")
                    result.status shouldBe ResponseType.SUCCESS
                }
            }
            given("displaying user blog"){
                `when`("the blog API is called /api/v1/user/{userId}/blogs"){

                    val result = blogControllerImpl.displayUserBlog(1)
                    then("display success")
                    result.status shouldBe ResponseType.SUCCESS
                }
            }
            given("displaying all users"){
                `when`("the blog API is called /api/v1/user/{userId}/blog") {
                    val result = blogControllerImpl.displayAllUser()
                    then("display success")
                    result.status shouldBe ResponseType.SUCCESS
                }
            }
        }



    }


})



