package io.axiom.editor.data

import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow

object GitHubOAuthBus {
    private val _codeFlow = MutableSharedFlow<String>(extraBufferCapacity = 1)
    val codeFlow = _codeFlow.asSharedFlow()

    fun emit(code: String) {
        _codeFlow.tryEmit(code)
    }
}
