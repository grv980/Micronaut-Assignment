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
                when ("blog api is called"){
                    val result =blogControllerImpl.getAll()
                        then("display success")
                        result shouldBe(ResponseType.SUCCESS)


                    }
            }
    given("creating user"){
        when("createUserApi is called"){
            val result = blogControllerImpl.createUser("grv")
            then("display success")
            result shouldBe(ResponseType.SUCCESS)


            }

        }

    given("creating blog") {
        when("CreateUserBlogApi is called"){
            val result = blogControllerImpl.createUserBlog("Gaurav","java")
            then("display success")
            result shouldBe(ResponseType.SUCCESS)

    }
    }
    given("updating blog"){
        when("updateUserBlogApi is called"){
            val result = blogControllerImpl.updateUserBlog()
            then("display success")
            result shouldBe(ResponseType.SUCCESS)
        }
    }
    given("deleting blog"){
        when(" deleteUserBlogApi is called"){
            val result = blogControllerImpl.deleteUserBlog()
            then("display success")
            result shouldBe(ResponseType.SUCCESS)
        }
    }
    given("displaying all users"){
        when("displayAllUser is called"){
            val result = blogControllerImpl.displayAllUser()
            then("display success")
            result shouldBe(ResponseType.SUCCESS)
        }
    }
}






)



