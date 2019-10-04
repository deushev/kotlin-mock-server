# kotlin-mock-server [![Build Status](https://travis-ci.com/infeez/kotlin-mock-server.svg?branch=master)](https://travis-ci.com/infeez/kotlin-mock-server)

This is kotlin DSL mock server based OkHttp3 mock server.

🔴 Attention! 
🔨 Work in progress!

Simple
```kotlin
stubContext(mockWebServer) {
    doResponseWithUrl("/base/mock/server") {
        fromString("response string") {
            responseStatusCode = 200
            socketPolicy = SocketPolicy.CONTINUE_ALWAYS
            headers {
                "key" withValue "value"
            }
            bodyDelay {
                delay = 100
                unit = TimeUnit.MILLISECONDS
            }
            headersDelay {
                delay = 100
                unit = TimeUnit.MILLISECONDS
            }
        }
    }
}
```
