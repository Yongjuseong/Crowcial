package com.android.crowcial.classes

import com.android.crowcial.interfaces.UserExitRouter


// UserExitRouter 인터페이스에 명시된 REST API를 처리하는 클래스이다.
class UserExitClient {
    companion object {
        var routerInterface: UserExitRouter? = null

        fun get(): UserExitRouter {
            if (routerInterface == null) {
                routerInterface = RetrofitClient.retrofit.create(UserExitRouter::class.java)
            }

            return routerInterface!!
        }
    }
}