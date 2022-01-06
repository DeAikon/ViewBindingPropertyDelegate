@file:RestrictTo(RestrictTo.Scope.LIBRARY)
@file:JvmName("VBPDRuntimeUtils")

package by.kirich1409.viewbindingdelegate.internal

import android.os.Looper
import androidx.annotation.RestrictTo

internal fun checkMainThread() {
    check(Looper.getMainLooper() === Looper.myLooper()) {
        "The method must be called on the main thread"
    }
}

internal fun checkMainThread(reason: String) {
    check(Looper.getMainLooper() === Looper.myLooper()) {
        "The method must be called on the main thread. Reason: $reason."
    }
}