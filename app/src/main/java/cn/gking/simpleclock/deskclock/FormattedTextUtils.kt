/*
 * Copyright (C) 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cn.gking.simpleclock.deskclock

import android.text.Spannable
import android.text.SpannableString

/**
 * Utilities for formatting strings using spans.
 */
object FormattedTextUtils {
    /**
     * Applies a span over the length of the given text.
     *
     * @param text the [CharSequence] to be formatted
     * @param span the span to apply
     * @return the text with the span applied
     */
    @JvmStatic
    fun formatText(text: CharSequence?, span: Any?): CharSequence? {
        if (text == null) {
            return null
        }

        val formattedText = SpannableString.valueOf(text)
        formattedText.setSpan(span, 0, formattedText.length, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        return formattedText
    }
}