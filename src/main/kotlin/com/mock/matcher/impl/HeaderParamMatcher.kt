package com.mock.matcher.impl

import com.mock.matcher.RequestMatcher
import java.util.regex.Pattern

class HeaderParamMatcher(private val param: String, private val pattern: Pattern) : RequestMatcher {

    override fun invoke(path: String?, body: String?, headers: Map<String, String>): Boolean {
        val param = headers[param] // TODO не учитывать кейс
        if (param.isNullOrEmpty()) {
            return false
        }

        return pattern.matcher(param).matches()
    }
}