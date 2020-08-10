package io.kubeless

import io.kubeless.Event
import io.kubeless.Context

class Foo {
    fun foo(event: io.kubeless.Event, context: io.kubeless.Context): String {
        return "Hello world!"
    }
}