package com.zhuinden.flowcombinetuplekt

import com.zhuinden.tupleskt.Tuple4
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import kotlin.coroutines.EmptyCoroutineContext

fun <T1, R> combineAsState(
    scope: CoroutineScope,
    started: SharingStarted,
    initialValue: R,
    f1: Flow<T1>,
    mapper: (T1) -> R,
): StateFlow<R> = f1.map {
    mapper(it)
}.stateIn(
    scope = scope,
    started = started,
    initialValue = initialValue,
)

fun <T1, T2, R> combineAsState(
    scope: CoroutineScope,
    started: SharingStarted,
    initialValue: R,
    f1: Flow<T1>,
    f2: Flow<T2>,
    mapper: (T1, T2) -> R,
): StateFlow<R> = combine(*arrayOf(f1, f2), transform = {
    @Suppress("UNCHECKED_CAST")
    mapper(it[0] as T1, it[1] as T2)
}).stateIn(
    scope = scope,
    started = started,
    initialValue = initialValue,
)

fun <T1, T2, T3, R> combineAsState(
    scope: CoroutineScope,
    started: SharingStarted,
    initialValue: R,
    f1: Flow<T1>,
    f2: Flow<T2>,
    f3: Flow<T3>,
    mapper: (T1, T2, T3) -> R,
): StateFlow<R> = combine(*arrayOf(f1, f2, f3), transform = {
    @Suppress("UNCHECKED_CAST")
    mapper(it[0] as T1, it[1] as T2, it[2] as T3)
}).stateIn(
    scope = scope,
    started = started,
    initialValue = initialValue,
)

fun <T1, T2, T3, T4, R> combineAsState(
    scope: CoroutineScope,
    started: SharingStarted,
    initialValue: R,
    f1: Flow<T1>,
    f2: Flow<T2>,
    f3: Flow<T3>,
    f4: Flow<T4>,
    mapper: (T1, T2, T3, T4) -> R,
): StateFlow<R> = combine(*arrayOf(f1, f2, f3, f4), transform = {
    @Suppress("UNCHECKED_CAST")
    mapper(it[0] as T1, it[1] as T2, it[2] as T3, it[3] as T4)
}).stateIn(
    scope = scope,
    started = started,
    initialValue = initialValue,
)

fun <T1, T2, T3, T4, T5, R> combineAsState(
    scope: CoroutineScope,
    started: SharingStarted,
    initialValue: R,
    f1: Flow<T1>,
    f2: Flow<T2>,
    f3: Flow<T3>,
    f4: Flow<T4>,
    f5: Flow<T5>,
    mapper: (T1, T2, T3, T4, T5) -> R,
): StateFlow<R> = combine(*arrayOf(f1, f2, f3, f4, f5), transform = {
    @Suppress("UNCHECKED_CAST")
    mapper(it[0] as T1, it[1] as T2, it[2] as T3, it[3] as T4, it[4] as T5)
}).stateIn(
    scope = scope,
    started = started,
    initialValue = initialValue,
)

fun <T1, T2, T3, T4, T5, T6, R> combineAsState(
    scope: CoroutineScope,
    started: SharingStarted,
    initialValue: R,
    f1: Flow<T1>,
    f2: Flow<T2>,
    f3: Flow<T3>,
    f4: Flow<T4>,
    f5: Flow<T5>,
    f6: Flow<T6>,
    mapper: (T1, T2, T3, T4, T5, T6) -> R,
): StateFlow<R> = combine(f1, f2, f3, f4, f5, f6, transform = {
    @Suppress("UNCHECKED_CAST")
    mapper(it[0] as T1, it[1] as T2, it[2] as T3, it[3] as T4, it[4] as T5, it[5] as T6)
}).stateIn(
    scope = scope,
    started = started,
    initialValue = initialValue,
)

fun <T1, T2, T3, T4, T5, T6, T7, R> combineAsState(
    scope: CoroutineScope,
    started: SharingStarted,
    initialValue: R,
    f1: Flow<T1>,
    f2: Flow<T2>,
    f3: Flow<T3>,
    f4: Flow<T4>,
    f5: Flow<T5>,
    f6: Flow<T6>,
    f7: Flow<T7>,
    mapper: (T1, T2, T3, T4, T5, T6, T7) -> R,
): StateFlow<R> = combine(f1, f2, f3, f4, f5, f6, f7) {
    @Suppress("UNCHECKED_CAST")
    mapper(it[0] as T1, it[1] as T2, it[2] as T3, it[3] as T4, it[4] as T5, it[5] as T6, it[6] as T7)
}.stateIn(
    scope = scope,
    started = started,
    initialValue = initialValue,
)

fun <T1, T2, T3, T4, T5, T6, T7, T8, R> combineAsState(
    scope: CoroutineScope,
    started: SharingStarted,
    initialValue: R,
    f1: Flow<T1>,
    f2: Flow<T2>,
    f3: Flow<T3>,
    f4: Flow<T4>,
    f5: Flow<T5>,
    f6: Flow<T6>,
    f7: Flow<T7>,
    f8: Flow<T8>,
    mapper: (T1, T2, T3, T4, T5, T6, T7, T8) -> R,
): StateFlow<R> = combine(f1, f2, f3, f4, f5, f6, f7, f8) {
    @Suppress("UNCHECKED_CAST")
    mapper(it[0] as T1, it[1] as T2, it[2] as T3, it[3] as T4, it[4] as T5, it[5] as T6, it[6] as T7, it[7] as T8)
}.stateIn(
    scope = scope,
    started = started,
    initialValue = initialValue,
)

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> combineAsState(
    scope: CoroutineScope,
    started: SharingStarted,
    initialValue: R,
    f1: Flow<T1>,
    f2: Flow<T2>,
    f3: Flow<T3>,
    f4: Flow<T4>,
    f5: Flow<T5>,
    f6: Flow<T6>,
    f7: Flow<T7>,
    f8: Flow<T8>,
    f9: Flow<T9>,
    mapper: (T1, T2, T3, T4, T5, T6, T7, T8, T9) -> R,
): StateFlow<R> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9) {
    @Suppress("UNCHECKED_CAST")
    mapper(it[0] as T1, it[1] as T2, it[2] as T3, it[3] as T4, it[4] as T5, it[5] as T6, it[6] as T7, it[7] as T8, it[8] as T9)
}.stateIn(
    scope = scope,
    started = started,
    initialValue = initialValue,
)

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, R> combineAsState(
    scope: CoroutineScope,
    started: SharingStarted,
    initialValue: R,
    f1: Flow<T1>,
    f2: Flow<T2>,
    f3: Flow<T3>,
    f4: Flow<T4>,
    f5: Flow<T5>,
    f6: Flow<T6>,
    f7: Flow<T7>,
    f8: Flow<T8>,
    f9: Flow<T9>,
    f10: Flow<T10>,
    mapper: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10) -> R,
): StateFlow<R> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10) {
    @Suppress("UNCHECKED_CAST")
    mapper(it[0] as T1, it[1] as T2, it[2] as T3, it[3] as T4, it[4] as T5, it[5] as T6, it[6] as T7, it[7] as T8, it[8] as T9, it[9] as T10)
}.stateIn(
    scope = scope,
    started = started,
    initialValue = initialValue,
)

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, R> combineAsState(
    scope: CoroutineScope,
    started: SharingStarted,
    initialValue: R,
    f1: Flow<T1>,
    f2: Flow<T2>,
    f3: Flow<T3>,
    f4: Flow<T4>,
    f5: Flow<T5>,
    f6: Flow<T6>,
    f7: Flow<T7>,
    f8: Flow<T8>,
    f9: Flow<T9>,
    f10: Flow<T10>,
    f11: Flow<T11>,
    mapper: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11) -> R,
): StateFlow<R> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11) {
    @Suppress("UNCHECKED_CAST")
    mapper(it[0] as T1, it[1] as T2, it[2] as T3, it[3] as T4, it[4] as T5, it[5] as T6, it[6] as T7, it[7] as T8, it[8] as T9, it[9] as T10, it[10] as T11)
}.stateIn(
    scope = scope,
    started = started,
    initialValue = initialValue,
)

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, R> combineAsState(
    scope: CoroutineScope,
    started: SharingStarted,
    initialValue: R,
    f1: Flow<T1>,
    f2: Flow<T2>,
    f3: Flow<T3>,
    f4: Flow<T4>,
    f5: Flow<T5>,
    f6: Flow<T6>,
    f7: Flow<T7>,
    f8: Flow<T8>,
    f9: Flow<T9>,
    f10: Flow<T10>,
    f11: Flow<T11>,
    f12: Flow<T12>,
    mapper: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12) -> R,
): StateFlow<R> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12) {
    @Suppress("UNCHECKED_CAST")
    mapper(it[0] as T1, it[1] as T2, it[2] as T3, it[3] as T4, it[4] as T5, it[5] as T6, it[6] as T7, it[7] as T8, it[8] as T9, it[9] as T10, it[10] as T11, it[11] as T12)
}.stateIn(
    scope = scope,
    started = started,
    initialValue = initialValue,
)

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, R> combineAsState(
    scope: CoroutineScope,
    started: SharingStarted,
    initialValue: R,
    f1: Flow<T1>,
    f2: Flow<T2>,
    f3: Flow<T3>,
    f4: Flow<T4>,
    f5: Flow<T5>,
    f6: Flow<T6>,
    f7: Flow<T7>,
    f8: Flow<T8>,
    f9: Flow<T9>,
    f10: Flow<T10>,
    f11: Flow<T11>,
    f12: Flow<T12>,
    f13: Flow<T13>,
    mapper: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13) -> R,
): StateFlow<R> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13) {
    @Suppress("UNCHECKED_CAST")
    mapper(it[0] as T1, it[1] as T2, it[2] as T3, it[3] as T4, it[4] as T5, it[5] as T6, it[6] as T7, it[7] as T8, it[8] as T9, it[9] as T10, it[10] as T11, it[11] as T12, it[12] as T13)
}.stateIn(
    scope = scope,
    started = started,
    initialValue = initialValue,
)

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, R> combineAsState(
    scope: CoroutineScope,
    started: SharingStarted,
    initialValue: R,
    f1: Flow<T1>,
    f2: Flow<T2>,
    f3: Flow<T3>,
    f4: Flow<T4>,
    f5: Flow<T5>,
    f6: Flow<T6>,
    f7: Flow<T7>,
    f8: Flow<T8>,
    f9: Flow<T9>,
    f10: Flow<T10>,
    f11: Flow<T11>,
    f12: Flow<T12>,
    f13: Flow<T13>,
    f14: Flow<T14>,
    mapper: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14) -> R,
): StateFlow<R> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14) {
    @Suppress("UNCHECKED_CAST")
    mapper(it[0] as T1, it[1] as T2, it[2] as T3, it[3] as T4, it[4] as T5, it[5] as T6, it[6] as T7, it[7] as T8, it[8] as T9, it[9] as T10, it[10] as T11, it[11] as T12, it[12] as T13, it[13] as T14)
}.stateIn(
    scope = scope,
    started = started,
    initialValue = initialValue,
)

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, R> combineAsState(
    scope: CoroutineScope,
    started: SharingStarted,
    initialValue: R,
    f1: Flow<T1>,
    f2: Flow<T2>,
    f3: Flow<T3>,
    f4: Flow<T4>,
    f5: Flow<T5>,
    f6: Flow<T6>,
    f7: Flow<T7>,
    f8: Flow<T8>,
    f9: Flow<T9>,
    f10: Flow<T10>,
    f11: Flow<T11>,
    f12: Flow<T12>,
    f13: Flow<T13>,
    f14: Flow<T14>,
    f15: Flow<T15>,
    mapper: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15) -> R,
): StateFlow<R> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15) {
    @Suppress("UNCHECKED_CAST")
    mapper(it[0] as T1, it[1] as T2, it[2] as T3, it[3] as T4, it[4] as T5, it[5] as T6, it[6] as T7, it[7] as T8, it[8] as T9, it[9] as T10, it[10] as T11, it[11] as T12, it[12] as T13, it[13] as T14, it[14] as T15)
}.stateIn(
    scope = scope,
    started = started,
    initialValue = initialValue,
)

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, R> combineAsState(
    scope: CoroutineScope,
    started: SharingStarted,
    initialValue: R,
    f1: Flow<T1>,
    f2: Flow<T2>,
    f3: Flow<T3>,
    f4: Flow<T4>,
    f5: Flow<T5>,
    f6: Flow<T6>,
    f7: Flow<T7>,
    f8: Flow<T8>,
    f9: Flow<T9>,
    f10: Flow<T10>,
    f11: Flow<T11>,
    f12: Flow<T12>,
    f13: Flow<T13>,
    f14: Flow<T14>,
    f15: Flow<T15>,
    f16: Flow<T16>,
    mapper: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16) -> R,
): StateFlow<R> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16) {
    @Suppress("UNCHECKED_CAST")
    mapper(it[0] as T1, it[1] as T2, it[2] as T3, it[3] as T4, it[4] as T5, it[5] as T6, it[6] as T7, it[7] as T8, it[8] as T9, it[9] as T10, it[10] as T11, it[11] as T12, it[12] as T13, it[13] as T14, it[14] as T15, it[15] as T16)
}.stateIn(
    scope = scope,
    started = started,
    initialValue = initialValue,
)

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, R> combineAsState(
    scope: CoroutineScope,
    started: SharingStarted,
    initialValue: R,
    f1: Flow<T1>,
    f2: Flow<T2>,
    f3: Flow<T3>,
    f4: Flow<T4>,
    f5: Flow<T5>,
    f6: Flow<T6>,
    f7: Flow<T7>,
    f8: Flow<T8>,
    f9: Flow<T9>,
    f10: Flow<T10>,
    f11: Flow<T11>,
    f12: Flow<T12>,
    f13: Flow<T13>,
    f14: Flow<T14>,
    f15: Flow<T15>,
    f16: Flow<T16>,
    f17: Flow<T17>,
    mapper: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17) -> R,
): StateFlow<R> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17) {
    @Suppress("UNCHECKED_CAST")
    mapper(it[0] as T1, it[1] as T2, it[2] as T3, it[3] as T4, it[4] as T5, it[5] as T6, it[6] as T7, it[7] as T8, it[8] as T9, it[9] as T10, it[10] as T11, it[11] as T12, it[12] as T13, it[13] as T14, it[14] as T15, it[15] as T16, it[16] as T17)
}.stateIn(
    scope = scope,
    started = started,
    initialValue = initialValue,
)

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, R> combineAsState(
    scope: CoroutineScope,
    started: SharingStarted,
    initialValue: R,
    f1: Flow<T1>,
    f2: Flow<T2>,
    f3: Flow<T3>,
    f4: Flow<T4>,
    f5: Flow<T5>,
    f6: Flow<T6>,
    f7: Flow<T7>,
    f8: Flow<T8>,
    f9: Flow<T9>,
    f10: Flow<T10>,
    f11: Flow<T11>,
    f12: Flow<T12>,
    f13: Flow<T13>,
    f14: Flow<T14>,
    f15: Flow<T15>,
    f16: Flow<T16>,
    f17: Flow<T17>,
    f18: Flow<T18>,
    mapper: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18) -> R,
): StateFlow<R> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18) {
    @Suppress("UNCHECKED_CAST")
    mapper(it[0] as T1, it[1] as T2, it[2] as T3, it[3] as T4, it[4] as T5, it[5] as T6, it[6] as T7, it[7] as T8, it[8] as T9, it[9] as T10, it[10] as T11, it[11] as T12, it[12] as T13, it[13] as T14, it[14] as T15, it[15] as T16, it[16] as T17, it[17] as T18)
}.stateIn(
    scope = scope,
    started = started,
    initialValue = initialValue,
)

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, R> combineAsState(
    scope: CoroutineScope,
    started: SharingStarted,
    initialValue: R,
    f1: Flow<T1>,
    f2: Flow<T2>,
    f3: Flow<T3>,
    f4: Flow<T4>,
    f5: Flow<T5>,
    f6: Flow<T6>,
    f7: Flow<T7>,
    f8: Flow<T8>,
    f9: Flow<T9>,
    f10: Flow<T10>,
    f11: Flow<T11>,
    f12: Flow<T12>,
    f13: Flow<T13>,
    f14: Flow<T14>,
    f15: Flow<T15>,
    f16: Flow<T16>,
    f17: Flow<T17>,
    f18: Flow<T18>,
    f19: Flow<T19>,
    mapper: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19) -> R,
): StateFlow<R> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19) {
    @Suppress("UNCHECKED_CAST")
    mapper(it[0] as T1, it[1] as T2, it[2] as T3, it[3] as T4, it[4] as T5, it[5] as T6, it[6] as T7, it[7] as T8, it[8] as T9, it[9] as T10, it[10] as T11, it[11] as T12, it[12] as T13, it[13] as T14, it[14] as T15, it[15] as T16, it[16] as T17, it[17] as T18, it[18] as T19)
}.stateIn(
    scope = scope,
    started = started,
    initialValue = initialValue,
)

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, R> combineAsState(
    scope: CoroutineScope,
    started: SharingStarted,
    initialValue: R,
    f1: Flow<T1>,
    f2: Flow<T2>,
    f3: Flow<T3>,
    f4: Flow<T4>,
    f5: Flow<T5>,
    f6: Flow<T6>,
    f7: Flow<T7>,
    f8: Flow<T8>,
    f9: Flow<T9>,
    f10: Flow<T10>,
    f11: Flow<T11>,
    f12: Flow<T12>,
    f13: Flow<T13>,
    f14: Flow<T14>,
    f15: Flow<T15>,
    f16: Flow<T16>,
    f17: Flow<T17>,
    f18: Flow<T18>,
    f19: Flow<T19>,
    f20: Flow<T20>,
    mapper: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20) -> R,
): StateFlow<R> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20) {
    @Suppress("UNCHECKED_CAST")
    mapper(it[0] as T1, it[1] as T2, it[2] as T3, it[3] as T4, it[4] as T5, it[5] as T6, it[6] as T7, it[7] as T8, it[8] as T9, it[9] as T10, it[10] as T11, it[11] as T12, it[12] as T13, it[13] as T14, it[14] as T15, it[15] as T16, it[16] as T17, it[17] as T18, it[18] as T19, it[19] as T20)
}.stateIn(
    scope = scope,
    started = started,
    initialValue = initialValue,
)

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, R> combineAsState(
    scope: CoroutineScope,
    started: SharingStarted,
    initialValue: R,
    f1: Flow<T1>,
    f2: Flow<T2>,
    f3: Flow<T3>,
    f4: Flow<T4>,
    f5: Flow<T5>,
    f6: Flow<T6>,
    f7: Flow<T7>,
    f8: Flow<T8>,
    f9: Flow<T9>,
    f10: Flow<T10>,
    f11: Flow<T11>,
    f12: Flow<T12>,
    f13: Flow<T13>,
    f14: Flow<T14>,
    f15: Flow<T15>,
    f16: Flow<T16>,
    f17: Flow<T17>,
    f18: Flow<T18>,
    f19: Flow<T19>,
    f20: Flow<T20>,
    f21: Flow<T21>,
    mapper: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21) -> R,
): StateFlow<R> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21) {
    @Suppress("UNCHECKED_CAST")
    mapper(it[0] as T1, it[1] as T2, it[2] as T3, it[3] as T4, it[4] as T5, it[5] as T6, it[6] as T7, it[7] as T8, it[8] as T9, it[9] as T10, it[10] as T11, it[11] as T12, it[12] as T13, it[13] as T14, it[14] as T15, it[15] as T16, it[16] as T17, it[17] as T18, it[18] as T19, it[19] as T20, it[20] as T21)
}.stateIn(
    scope = scope,
    started = started,
    initialValue = initialValue,
)

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, R> combineAsState(
    scope: CoroutineScope,
    started: SharingStarted,
    initialValue: R,
    f1: Flow<T1>,
    f2: Flow<T2>,
    f3: Flow<T3>,
    f4: Flow<T4>,
    f5: Flow<T5>,
    f6: Flow<T6>,
    f7: Flow<T7>,
    f8: Flow<T8>,
    f9: Flow<T9>,
    f10: Flow<T10>,
    f11: Flow<T11>,
    f12: Flow<T12>,
    f13: Flow<T13>,
    f14: Flow<T14>,
    f15: Flow<T15>,
    f16: Flow<T16>,
    f17: Flow<T17>,
    f18: Flow<T18>,
    f19: Flow<T19>,
    f20: Flow<T20>,
    f21: Flow<T21>,
    f22: Flow<T22>,
    mapper: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22) -> R,
): StateFlow<R> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, f22) {
    @Suppress("UNCHECKED_CAST")
    mapper(it[0] as T1, it[1] as T2, it[2] as T3, it[3] as T4, it[4] as T5, it[5] as T6, it[6] as T7, it[7] as T8, it[8] as T9, it[9] as T10, it[10] as T11, it[11] as T12, it[12] as T13, it[13] as T14, it[14] as T15, it[15] as T16, it[16] as T17, it[17] as T18, it[18] as T19, it[19] as T20, it[20] as T21, it[21] as T22)
}.stateIn(
    scope = scope,
    started = started,
    initialValue = initialValue,
)

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, R> combineAsState(
    scope: CoroutineScope,
    started: SharingStarted,
    initialValue: R,
    f1: Flow<T1>,
    f2: Flow<T2>,
    f3: Flow<T3>,
    f4: Flow<T4>,
    f5: Flow<T5>,
    f6: Flow<T6>,
    f7: Flow<T7>,
    f8: Flow<T8>,
    f9: Flow<T9>,
    f10: Flow<T10>,
    f11: Flow<T11>,
    f12: Flow<T12>,
    f13: Flow<T13>,
    f14: Flow<T14>,
    f15: Flow<T15>,
    f16: Flow<T16>,
    f17: Flow<T17>,
    f18: Flow<T18>,
    f19: Flow<T19>,
    f20: Flow<T20>,
    f21: Flow<T21>,
    f22: Flow<T22>,
    f23: Flow<T23>,
    mapper: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23) -> R,
): StateFlow<R> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, f22, f23) {
    @Suppress("UNCHECKED_CAST")
    mapper(it[0] as T1, it[1] as T2, it[2] as T3, it[3] as T4, it[4] as T5, it[5] as T6, it[6] as T7, it[7] as T8, it[8] as T9, it[9] as T10, it[10] as T11, it[11] as T12, it[12] as T13, it[13] as T14, it[14] as T15, it[15] as T16, it[16] as T17, it[17] as T18, it[18] as T19, it[19] as T20, it[20] as T21, it[21] as T22, it[22] as T23)
}.stateIn(
    scope = scope,
    started = started,
    initialValue = initialValue,
)

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, R> combineAsState(
    scope: CoroutineScope,
    started: SharingStarted,
    initialValue: R,
    f1: Flow<T1>,
    f2: Flow<T2>,
    f3: Flow<T3>,
    f4: Flow<T4>,
    f5: Flow<T5>,
    f6: Flow<T6>,
    f7: Flow<T7>,
    f8: Flow<T8>,
    f9: Flow<T9>,
    f10: Flow<T10>,
    f11: Flow<T11>,
    f12: Flow<T12>,
    f13: Flow<T13>,
    f14: Flow<T14>,
    f15: Flow<T15>,
    f16: Flow<T16>,
    f17: Flow<T17>,
    f18: Flow<T18>,
    f19: Flow<T19>,
    f20: Flow<T20>,
    f21: Flow<T21>,
    f22: Flow<T22>,
    f23: Flow<T23>,
    f24: Flow<T24>,
    mapper: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24) -> R,
): StateFlow<R> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, f22, f23, f24) {
    @Suppress("UNCHECKED_CAST")
    mapper(it[0] as T1, it[1] as T2, it[2] as T3, it[3] as T4, it[4] as T5, it[5] as T6, it[6] as T7, it[7] as T8, it[8] as T9, it[9] as T10, it[10] as T11, it[11] as T12, it[12] as T13, it[13] as T14, it[14] as T15, it[15] as T16, it[16] as T17, it[17] as T18, it[18] as T19, it[19] as T20, it[20] as T21, it[21] as T22, it[22] as T23, it[23] as T24)
}.stateIn(
    scope = scope,
    started = started,
    initialValue = initialValue,
)

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, R> combineAsState(
    scope: CoroutineScope,
    started: SharingStarted,
    initialValue: R,
    f1: Flow<T1>,
    f2: Flow<T2>,
    f3: Flow<T3>,
    f4: Flow<T4>,
    f5: Flow<T5>,
    f6: Flow<T6>,
    f7: Flow<T7>,
    f8: Flow<T8>,
    f9: Flow<T9>,
    f10: Flow<T10>,
    f11: Flow<T11>,
    f12: Flow<T12>,
    f13: Flow<T13>,
    f14: Flow<T14>,
    f15: Flow<T15>,
    f16: Flow<T16>,
    f17: Flow<T17>,
    f18: Flow<T18>,
    f19: Flow<T19>,
    f20: Flow<T20>,
    f21: Flow<T21>,
    f22: Flow<T22>,
    f23: Flow<T23>,
    f24: Flow<T24>,
    f25: Flow<T25>,
    mapper: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25) -> R,
): StateFlow<R> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, f22, f23, f24, f25) {
    @Suppress("UNCHECKED_CAST")
    mapper(it[0] as T1, it[1] as T2, it[2] as T3, it[3] as T4, it[4] as T5, it[5] as T6, it[6] as T7, it[7] as T8, it[8] as T9, it[9] as T10, it[10] as T11, it[11] as T12, it[12] as T13, it[13] as T14, it[14] as T15, it[15] as T16, it[16] as T17, it[17] as T18, it[18] as T19, it[19] as T20, it[20] as T21, it[21] as T22, it[22] as T23, it[23] as T24, it[24] as T25)
}.stateIn(
    scope = scope,
    started = started,
    initialValue = initialValue,
)

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, R> combineAsState(
    scope: CoroutineScope,
    started: SharingStarted,
    initialValue: R,
    f1: Flow<T1>,
    f2: Flow<T2>,
    f3: Flow<T3>,
    f4: Flow<T4>,
    f5: Flow<T5>,
    f6: Flow<T6>,
    f7: Flow<T7>,
    f8: Flow<T8>,
    f9: Flow<T9>,
    f10: Flow<T10>,
    f11: Flow<T11>,
    f12: Flow<T12>,
    f13: Flow<T13>,
    f14: Flow<T14>,
    f15: Flow<T15>,
    f16: Flow<T16>,
    f17: Flow<T17>,
    f18: Flow<T18>,
    f19: Flow<T19>,
    f20: Flow<T20>,
    f21: Flow<T21>,
    f22: Flow<T22>,
    f23: Flow<T23>,
    f24: Flow<T24>,
    f25: Flow<T25>,
    f26: Flow<T26>,
    mapper: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26) -> R,
): StateFlow<R> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, f22, f23, f24, f25, f26) {
    @Suppress("UNCHECKED_CAST")
    mapper(it[0] as T1, it[1] as T2, it[2] as T3, it[3] as T4, it[4] as T5, it[5] as T6, it[6] as T7, it[7] as T8, it[8] as T9, it[9] as T10, it[10] as T11, it[11] as T12, it[12] as T13, it[13] as T14, it[14] as T15, it[15] as T16, it[16] as T17, it[17] as T18, it[18] as T19, it[19] as T20, it[20] as T21, it[21] as T22, it[22] as T23, it[23] as T24, it[24] as T25, it[25] as T26)
}.stateIn(
    scope = scope,
    started = started,
    initialValue = initialValue,
)

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, R> combineAsState(
    scope: CoroutineScope,
    started: SharingStarted,
    initialValue: R,
    f1: Flow<T1>,
    f2: Flow<T2>,
    f3: Flow<T3>,
    f4: Flow<T4>,
    f5: Flow<T5>,
    f6: Flow<T6>,
    f7: Flow<T7>,
    f8: Flow<T8>,
    f9: Flow<T9>,
    f10: Flow<T10>,
    f11: Flow<T11>,
    f12: Flow<T12>,
    f13: Flow<T13>,
    f14: Flow<T14>,
    f15: Flow<T15>,
    f16: Flow<T16>,
    f17: Flow<T17>,
    f18: Flow<T18>,
    f19: Flow<T19>,
    f20: Flow<T20>,
    f21: Flow<T21>,
    f22: Flow<T22>,
    f23: Flow<T23>,
    f24: Flow<T24>,
    f25: Flow<T25>,
    f26: Flow<T26>,
    f27: Flow<T27>,
    mapper: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27) -> R,
): StateFlow<R> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, f22, f23, f24, f25, f26, f27) {
    @Suppress("UNCHECKED_CAST")
    mapper(it[0] as T1, it[1] as T2, it[2] as T3, it[3] as T4, it[4] as T5, it[5] as T6, it[6] as T7, it[7] as T8, it[8] as T9, it[9] as T10, it[10] as T11, it[11] as T12, it[12] as T13, it[13] as T14, it[14] as T15, it[15] as T16, it[16] as T17, it[17] as T18, it[18] as T19, it[19] as T20, it[20] as T21, it[21] as T22, it[22] as T23, it[23] as T24, it[24] as T25, it[25] as T26, it[26] as T27)
}.stateIn(
    scope = scope,
    started = started,
    initialValue = initialValue,
)

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, R> combineAsState(
    scope: CoroutineScope,
    started: SharingStarted,
    initialValue: R,
    f1: Flow<T1>,
    f2: Flow<T2>,
    f3: Flow<T3>,
    f4: Flow<T4>,
    f5: Flow<T5>,
    f6: Flow<T6>,
    f7: Flow<T7>,
    f8: Flow<T8>,
    f9: Flow<T9>,
    f10: Flow<T10>,
    f11: Flow<T11>,
    f12: Flow<T12>,
    f13: Flow<T13>,
    f14: Flow<T14>,
    f15: Flow<T15>,
    f16: Flow<T16>,
    f17: Flow<T17>,
    f18: Flow<T18>,
    f19: Flow<T19>,
    f20: Flow<T20>,
    f21: Flow<T21>,
    f22: Flow<T22>,
    f23: Flow<T23>,
    f24: Flow<T24>,
    f25: Flow<T25>,
    f26: Flow<T26>,
    f27: Flow<T27>,
    f28: Flow<T28>,
    mapper: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28) -> R,
): StateFlow<R> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, f22, f23, f24, f25, f26, f27, f28) {
    @Suppress("UNCHECKED_CAST")
    mapper(it[0] as T1, it[1] as T2, it[2] as T3, it[3] as T4, it[4] as T5, it[5] as T6, it[6] as T7, it[7] as T8, it[8] as T9, it[9] as T10, it[10] as T11, it[11] as T12, it[12] as T13, it[13] as T14, it[14] as T15, it[15] as T16, it[16] as T17, it[17] as T18, it[18] as T19, it[19] as T20, it[20] as T21, it[21] as T22, it[22] as T23, it[23] as T24, it[24] as T25, it[25] as T26, it[26] as T27, it[27] as T28)
}.stateIn(
    scope = scope,
    started = started,
    initialValue = initialValue,
)

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, R> combineAsState(
    scope: CoroutineScope,
    started: SharingStarted,
    initialValue: R,
    f1: Flow<T1>,
    f2: Flow<T2>,
    f3: Flow<T3>,
    f4: Flow<T4>,
    f5: Flow<T5>,
    f6: Flow<T6>,
    f7: Flow<T7>,
    f8: Flow<T8>,
    f9: Flow<T9>,
    f10: Flow<T10>,
    f11: Flow<T11>,
    f12: Flow<T12>,
    f13: Flow<T13>,
    f14: Flow<T14>,
    f15: Flow<T15>,
    f16: Flow<T16>,
    f17: Flow<T17>,
    f18: Flow<T18>,
    f19: Flow<T19>,
    f20: Flow<T20>,
    f21: Flow<T21>,
    f22: Flow<T22>,
    f23: Flow<T23>,
    f24: Flow<T24>,
    f25: Flow<T25>,
    f26: Flow<T26>,
    f27: Flow<T27>,
    f28: Flow<T28>,
    f29: Flow<T29>,
    mapper: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29) -> R,
): StateFlow<R> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, f22, f23, f24, f25, f26, f27, f28, f29) {
    @Suppress("UNCHECKED_CAST")
    mapper(it[0] as T1, it[1] as T2, it[2] as T3, it[3] as T4, it[4] as T5, it[5] as T6, it[6] as T7, it[7] as T8, it[8] as T9, it[9] as T10, it[10] as T11, it[11] as T12, it[12] as T13, it[13] as T14, it[14] as T15, it[15] as T16, it[16] as T17, it[17] as T18, it[18] as T19, it[19] as T20, it[20] as T21, it[21] as T22, it[22] as T23, it[23] as T24, it[24] as T25, it[25] as T26, it[26] as T27, it[27] as T28, it[28] as T29)
}.stateIn(
    scope = scope,
    started = started,
    initialValue = initialValue,
)

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, R> combineAsState(
    scope: CoroutineScope,
    started: SharingStarted,
    initialValue: R,
    f1: Flow<T1>,
    f2: Flow<T2>,
    f3: Flow<T3>,
    f4: Flow<T4>,
    f5: Flow<T5>,
    f6: Flow<T6>,
    f7: Flow<T7>,
    f8: Flow<T8>,
    f9: Flow<T9>,
    f10: Flow<T10>,
    f11: Flow<T11>,
    f12: Flow<T12>,
    f13: Flow<T13>,
    f14: Flow<T14>,
    f15: Flow<T15>,
    f16: Flow<T16>,
    f17: Flow<T17>,
    f18: Flow<T18>,
    f19: Flow<T19>,
    f20: Flow<T20>,
    f21: Flow<T21>,
    f22: Flow<T22>,
    f23: Flow<T23>,
    f24: Flow<T24>,
    f25: Flow<T25>,
    f26: Flow<T26>,
    f27: Flow<T27>,
    f28: Flow<T28>,
    f29: Flow<T29>,
    f30: Flow<T30>,
    mapper: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30) -> R,
): StateFlow<R> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, f22, f23, f24, f25, f26, f27, f28, f29, f30) {
    @Suppress("UNCHECKED_CAST")
    mapper(it[0] as T1, it[1] as T2, it[2] as T3, it[3] as T4, it[4] as T5, it[5] as T6, it[6] as T7, it[7] as T8, it[8] as T9, it[9] as T10, it[10] as T11, it[11] as T12, it[12] as T13, it[13] as T14, it[14] as T15, it[15] as T16, it[16] as T17, it[17] as T18, it[18] as T19, it[19] as T20, it[20] as T21, it[21] as T22, it[22] as T23, it[23] as T24, it[24] as T25, it[25] as T26, it[26] as T27, it[27] as T28, it[28] as T29, it[29] as T30)
}.stateIn(
    scope = scope,
    started = started,
    initialValue = initialValue,
)

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, R> combineAsState(
    scope: CoroutineScope,
    started: SharingStarted,
    initialValue: R,
    f1: Flow<T1>,
    f2: Flow<T2>,
    f3: Flow<T3>,
    f4: Flow<T4>,
    f5: Flow<T5>,
    f6: Flow<T6>,
    f7: Flow<T7>,
    f8: Flow<T8>,
    f9: Flow<T9>,
    f10: Flow<T10>,
    f11: Flow<T11>,
    f12: Flow<T12>,
    f13: Flow<T13>,
    f14: Flow<T14>,
    f15: Flow<T15>,
    f16: Flow<T16>,
    f17: Flow<T17>,
    f18: Flow<T18>,
    f19: Flow<T19>,
    f20: Flow<T20>,
    f21: Flow<T21>,
    f22: Flow<T22>,
    f23: Flow<T23>,
    f24: Flow<T24>,
    f25: Flow<T25>,
    f26: Flow<T26>,
    f27: Flow<T27>,
    f28: Flow<T28>,
    f29: Flow<T29>,
    f30: Flow<T30>,
    f31: Flow<T31>,
    mapper: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31) -> R,
): StateFlow<R> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, f22, f23, f24, f25, f26, f27, f28, f29, f30, f31) {
    @Suppress("UNCHECKED_CAST")
    mapper(it[0] as T1, it[1] as T2, it[2] as T3, it[3] as T4, it[4] as T5, it[5] as T6, it[6] as T7, it[7] as T8, it[8] as T9, it[9] as T10, it[10] as T11, it[11] as T12, it[12] as T13, it[13] as T14, it[14] as T15, it[15] as T16, it[16] as T17, it[17] as T18, it[18] as T19, it[19] as T20, it[20] as T21, it[21] as T22, it[22] as T23, it[23] as T24, it[24] as T25, it[25] as T26, it[26] as T27, it[27] as T28, it[28] as T29, it[29] as T30, it[30] as T31)
}.stateIn(
    scope = scope,
    started = started,
    initialValue = initialValue,
)

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32, R> combineAsState(
    scope: CoroutineScope,
    started: SharingStarted,
    initialValue: R,
    f1: Flow<T1>,
    f2: Flow<T2>,
    f3: Flow<T3>,
    f4: Flow<T4>,
    f5: Flow<T5>,
    f6: Flow<T6>,
    f7: Flow<T7>,
    f8: Flow<T8>,
    f9: Flow<T9>,
    f10: Flow<T10>,
    f11: Flow<T11>,
    f12: Flow<T12>,
    f13: Flow<T13>,
    f14: Flow<T14>,
    f15: Flow<T15>,
    f16: Flow<T16>,
    f17: Flow<T17>,
    f18: Flow<T18>,
    f19: Flow<T19>,
    f20: Flow<T20>,
    f21: Flow<T21>,
    f22: Flow<T22>,
    f23: Flow<T23>,
    f24: Flow<T24>,
    f25: Flow<T25>,
    f26: Flow<T26>,
    f27: Flow<T27>,
    f28: Flow<T28>,
    f29: Flow<T29>,
    f30: Flow<T30>,
    f31: Flow<T31>,
    f32: Flow<T32>,
    mapper: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32) -> R,
): StateFlow<R> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, f22, f23, f24, f25, f26, f27, f28, f29, f30, f31, f32) {
    @Suppress("UNCHECKED_CAST")
    mapper(it[0] as T1, it[1] as T2, it[2] as T3, it[3] as T4, it[4] as T5, it[5] as T6, it[6] as T7, it[7] as T8, it[8] as T9, it[9] as T10, it[10] as T11, it[11] as T12, it[12] as T13, it[13] as T14, it[14] as T15, it[15] as T16, it[16] as T17, it[17] as T18, it[18] as T19, it[19] as T20, it[20] as T21, it[21] as T22, it[22] as T23, it[23] as T24, it[24] as T25, it[25] as T26, it[26] as T27, it[27] as T28, it[28] as T29, it[29] as T30, it[30] as T31, it[31] as T32)
}.stateIn(
    scope = scope,
    started = started,
    initialValue = initialValue,
)

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32, T33, R> combineAsState(
    scope: CoroutineScope,
    started: SharingStarted,
    initialValue: R,
    f1: Flow<T1>,
    f2: Flow<T2>,
    f3: Flow<T3>,
    f4: Flow<T4>,
    f5: Flow<T5>,
    f6: Flow<T6>,
    f7: Flow<T7>,
    f8: Flow<T8>,
    f9: Flow<T9>,
    f10: Flow<T10>,
    f11: Flow<T11>,
    f12: Flow<T12>,
    f13: Flow<T13>,
    f14: Flow<T14>,
    f15: Flow<T15>,
    f16: Flow<T16>,
    f17: Flow<T17>,
    f18: Flow<T18>,
    f19: Flow<T19>,
    f20: Flow<T20>,
    f21: Flow<T21>,
    f22: Flow<T22>,
    f23: Flow<T23>,
    f24: Flow<T24>,
    f25: Flow<T25>,
    f26: Flow<T26>,
    f27: Flow<T27>,
    f28: Flow<T28>,
    f29: Flow<T29>,
    f30: Flow<T30>,
    f31: Flow<T31>,
    f32: Flow<T32>,
    f33: Flow<T33>,
    mapper: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32, T33) -> R,
): StateFlow<R> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, f22, f23, f24, f25, f26, f27, f28, f29, f30, f31, f32, f33) {
    @Suppress("UNCHECKED_CAST")
    mapper(it[0] as T1, it[1] as T2, it[2] as T3, it[3] as T4, it[4] as T5, it[5] as T6, it[6] as T7, it[7] as T8, it[8] as T9, it[9] as T10, it[10] as T11, it[11] as T12, it[12] as T13, it[13] as T14, it[14] as T15, it[15] as T16, it[16] as T17, it[17] as T18, it[18] as T19, it[19] as T20, it[20] as T21, it[21] as T22, it[22] as T23, it[23] as T24, it[24] as T25, it[25] as T26, it[26] as T27, it[27] as T28, it[28] as T29, it[29] as T30, it[30] as T31, it[31] as T32, it[32] as T33)
}.stateIn(
    scope = scope,
    started = started,
    initialValue = initialValue,
)

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32, T33, T34, R> combineAsState(
    scope: CoroutineScope,
    started: SharingStarted,
    initialValue: R,
    f1: Flow<T1>,
    f2: Flow<T2>,
    f3: Flow<T3>,
    f4: Flow<T4>,
    f5: Flow<T5>,
    f6: Flow<T6>,
    f7: Flow<T7>,
    f8: Flow<T8>,
    f9: Flow<T9>,
    f10: Flow<T10>,
    f11: Flow<T11>,
    f12: Flow<T12>,
    f13: Flow<T13>,
    f14: Flow<T14>,
    f15: Flow<T15>,
    f16: Flow<T16>,
    f17: Flow<T17>,
    f18: Flow<T18>,
    f19: Flow<T19>,
    f20: Flow<T20>,
    f21: Flow<T21>,
    f22: Flow<T22>,
    f23: Flow<T23>,
    f24: Flow<T24>,
    f25: Flow<T25>,
    f26: Flow<T26>,
    f27: Flow<T27>,
    f28: Flow<T28>,
    f29: Flow<T29>,
    f30: Flow<T30>,
    f31: Flow<T31>,
    f32: Flow<T32>,
    f33: Flow<T33>,
    f34: Flow<T34>,
    mapper: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32, T33, T34) -> R,
): StateFlow<R> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, f22, f23, f24, f25, f26, f27, f28, f29, f30, f31, f32, f33, f34) {
    @Suppress("UNCHECKED_CAST")
    mapper(it[0] as T1, it[1] as T2, it[2] as T3, it[3] as T4, it[4] as T5, it[5] as T6, it[6] as T7, it[7] as T8, it[8] as T9, it[9] as T10, it[10] as T11, it[11] as T12, it[12] as T13, it[13] as T14, it[14] as T15, it[15] as T16, it[16] as T17, it[17] as T18, it[18] as T19, it[19] as T20, it[20] as T21, it[21] as T22, it[22] as T23, it[23] as T24, it[24] as T25, it[25] as T26, it[26] as T27, it[27] as T28, it[28] as T29, it[29] as T30, it[30] as T31, it[31] as T32, it[32] as T33, it[33] as T34)
}.stateIn(
    scope = scope,
    started = started,
    initialValue = initialValue,
)

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32, T33, T34, T35, R> combineAsState(
    scope: CoroutineScope,
    started: SharingStarted,
    initialValue: R,
    f1: Flow<T1>,
    f2: Flow<T2>,
    f3: Flow<T3>,
    f4: Flow<T4>,
    f5: Flow<T5>,
    f6: Flow<T6>,
    f7: Flow<T7>,
    f8: Flow<T8>,
    f9: Flow<T9>,
    f10: Flow<T10>,
    f11: Flow<T11>,
    f12: Flow<T12>,
    f13: Flow<T13>,
    f14: Flow<T14>,
    f15: Flow<T15>,
    f16: Flow<T16>,
    f17: Flow<T17>,
    f18: Flow<T18>,
    f19: Flow<T19>,
    f20: Flow<T20>,
    f21: Flow<T21>,
    f22: Flow<T22>,
    f23: Flow<T23>,
    f24: Flow<T24>,
    f25: Flow<T25>,
    f26: Flow<T26>,
    f27: Flow<T27>,
    f28: Flow<T28>,
    f29: Flow<T29>,
    f30: Flow<T30>,
    f31: Flow<T31>,
    f32: Flow<T32>,
    f33: Flow<T33>,
    f34: Flow<T34>,
    f35: Flow<T35>,
    mapper: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32, T33, T34, T35) -> R,
): StateFlow<R> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, f22, f23, f24, f25, f26, f27, f28, f29, f30, f31, f32, f33, f34, f35) {
    @Suppress("UNCHECKED_CAST")
    mapper(it[0] as T1, it[1] as T2, it[2] as T3, it[3] as T4, it[4] as T5, it[5] as T6, it[6] as T7, it[7] as T8, it[8] as T9, it[9] as T10, it[10] as T11, it[11] as T12, it[12] as T13, it[13] as T14, it[14] as T15, it[15] as T16, it[16] as T17, it[17] as T18, it[18] as T19, it[19] as T20, it[20] as T21, it[21] as T22, it[22] as T23, it[23] as T24, it[24] as T25, it[25] as T26, it[26] as T27, it[27] as T28, it[28] as T29, it[29] as T30, it[30] as T31, it[31] as T32, it[32] as T33, it[33] as T34, it[34] as T35)
}.stateIn(
    scope = scope,
    started = started,
    initialValue = initialValue,
)

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32, T33, T34, T35, T36, R> combineAsState(
    scope: CoroutineScope,
    started: SharingStarted,
    initialValue: R,
    f1: Flow<T1>,
    f2: Flow<T2>,
    f3: Flow<T3>,
    f4: Flow<T4>,
    f5: Flow<T5>,
    f6: Flow<T6>,
    f7: Flow<T7>,
    f8: Flow<T8>,
    f9: Flow<T9>,
    f10: Flow<T10>,
    f11: Flow<T11>,
    f12: Flow<T12>,
    f13: Flow<T13>,
    f14: Flow<T14>,
    f15: Flow<T15>,
    f16: Flow<T16>,
    f17: Flow<T17>,
    f18: Flow<T18>,
    f19: Flow<T19>,
    f20: Flow<T20>,
    f21: Flow<T21>,
    f22: Flow<T22>,
    f23: Flow<T23>,
    f24: Flow<T24>,
    f25: Flow<T25>,
    f26: Flow<T26>,
    f27: Flow<T27>,
    f28: Flow<T28>,
    f29: Flow<T29>,
    f30: Flow<T30>,
    f31: Flow<T31>,
    f32: Flow<T32>,
    f33: Flow<T33>,
    f34: Flow<T34>,
    f35: Flow<T35>,
    f36: Flow<T36>,
    mapper: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32, T33, T34, T35, T36) -> R,
): StateFlow<R> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, f22, f23, f24, f25, f26, f27, f28, f29, f30, f31, f32, f33, f34, f35, f36) {
    @Suppress("UNCHECKED_CAST")
    mapper(it[0] as T1, it[1] as T2, it[2] as T3, it[3] as T4, it[4] as T5, it[5] as T6, it[6] as T7, it[7] as T8, it[8] as T9, it[9] as T10, it[10] as T11, it[11] as T12, it[12] as T13, it[13] as T14, it[14] as T15, it[15] as T16, it[16] as T17, it[17] as T18, it[18] as T19, it[19] as T20, it[20] as T21, it[21] as T22, it[22] as T23, it[23] as T24, it[24] as T25, it[25] as T26, it[26] as T27, it[27] as T28, it[28] as T29, it[29] as T30, it[30] as T31, it[31] as T32, it[32] as T33, it[33] as T34, it[34] as T35, it[35] as T36)
}.stateIn(
    scope = scope,
    started = started,
    initialValue = initialValue,
)