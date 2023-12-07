package com.zhuinden.flowcombinetuplekt

import com.zhuinden.tupleskt.Tuple4
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import kotlin.coroutines.EmptyCoroutineContext

fun <T1, R> combineStates(
    scope: CoroutineScope,
    started: SharingStarted,
    f1: StateFlow<T1>,
    mapper: (T1) -> R,
): StateFlow<R> = f1.map {
    mapper(it)
}.stateIn(
    scope = scope,
    started = started,
    initialValue = mapper(f1.value),
)

fun <T1, T2, R> combineStates(
    scope: CoroutineScope,
    started: SharingStarted,
    f1: StateFlow<T1>,
    f2: StateFlow<T2>,
    mapper: (T1, T2) -> R,
): StateFlow<R> = combine(*arrayOf(f1, f2), transform = {
    @Suppress("UNCHECKED_CAST")
    mapper(it[0] as T1, it[1] as T2)
}).stateIn(
    scope = scope,
    started = started,
    initialValue = mapper(f1.value, f2.value),
)

fun <T1, T2, T3, R> combineStates(
    scope: CoroutineScope,
    started: SharingStarted,
    f1: StateFlow<T1>,
    f2: StateFlow<T2>,
    f3: StateFlow<T3>,
    mapper: (T1, T2, T3) -> R,
): StateFlow<R> = combine(*arrayOf(f1, f2, f3), transform = {
    @Suppress("UNCHECKED_CAST")
    mapper(it[0] as T1, it[1] as T2, it[2] as T3)
}).stateIn(
    scope = scope,
    started = started,
    initialValue = mapper(f1.value, f2.value, f3.value),
)

fun <T1, T2, T3, T4, R> combineStates(
    scope: CoroutineScope,
    started: SharingStarted,
    f1: StateFlow<T1>,
    f2: StateFlow<T2>,
    f3: StateFlow<T3>,
    f4: StateFlow<T4>,
    mapper: (T1, T2, T3, T4) -> R,
): StateFlow<R> = combine(*arrayOf(f1, f2, f3, f4), transform = {
    @Suppress("UNCHECKED_CAST")
    mapper(it[0] as T1, it[1] as T2, it[2] as T3, it[3] as T4)
}).stateIn(
    scope = scope,
    started = started,
    initialValue = mapper(f1.value, f2.value, f3.value, f4.value),
)

fun <T1, T2, T3, T4, T5, R> combineStates(
    scope: CoroutineScope,
    started: SharingStarted,
    f1: StateFlow<T1>,
    f2: StateFlow<T2>,
    f3: StateFlow<T3>,
    f4: StateFlow<T4>,
    f5: StateFlow<T5>,
    mapper: (T1, T2, T3, T4, T5) -> R,
): StateFlow<R> = combine(*arrayOf(f1, f2, f3, f4, f5), transform = {
    @Suppress("UNCHECKED_CAST")
    mapper(it[0] as T1, it[1] as T2, it[2] as T3, it[3] as T4, it[4] as T5)
}).stateIn(
    scope = scope,
    started = started,
    initialValue = mapper(f1.value, f2.value, f3.value, f4.value, f5.value),
)

fun <T1, T2, T3, T4, T5, T6, R> combineStates(
    scope: CoroutineScope,
    started: SharingStarted,
    f1: StateFlow<T1>,
    f2: StateFlow<T2>,
    f3: StateFlow<T3>,
    f4: StateFlow<T4>,
    f5: StateFlow<T5>,
    f6: StateFlow<T6>,
    mapper: (T1, T2, T3, T4, T5, T6) -> R,
): StateFlow<R> = combine(f1, f2, f3, f4, f5, f6, transform = {
    @Suppress("UNCHECKED_CAST")
    mapper(it[0] as T1, it[1] as T2, it[2] as T3, it[3] as T4, it[4] as T5, it[5] as T6)
}).stateIn(
    scope = scope,
    started = started,
    initialValue = mapper(f1.value, f2.value, f3.value, f4.value, f5.value, f6.value),
)

fun <T1, T2, T3, T4, T5, T6, T7, R> combineStates(
    scope: CoroutineScope,
    started: SharingStarted,
    f1: StateFlow<T1>,
    f2: StateFlow<T2>,
    f3: StateFlow<T3>,
    f4: StateFlow<T4>,
    f5: StateFlow<T5>,
    f6: StateFlow<T6>,
    f7: StateFlow<T7>,
    mapper: (T1, T2, T3, T4, T5, T6, T7) -> R,
): StateFlow<R> = combine(f1, f2, f3, f4, f5, f6, f7) {
    @Suppress("UNCHECKED_CAST")
    mapper(it[0] as T1, it[1] as T2, it[2] as T3, it[3] as T4, it[4] as T5, it[5] as T6, it[6] as T7)
}.stateIn(
    scope = scope,
    started = started,
    initialValue = mapper(f1.value, f2.value, f3.value, f4.value, f5.value, f6.value, f7.value),
)

fun <T1, T2, T3, T4, T5, T6, T7, T8, R> combineStates(
    scope: CoroutineScope,
    started: SharingStarted,
    f1: StateFlow<T1>,
    f2: StateFlow<T2>,
    f3: StateFlow<T3>,
    f4: StateFlow<T4>,
    f5: StateFlow<T5>,
    f6: StateFlow<T6>,
    f7: StateFlow<T7>,
    f8: StateFlow<T8>,
    mapper: (T1, T2, T3, T4, T5, T6, T7, T8) -> R,
): StateFlow<R> = combine(f1, f2, f3, f4, f5, f6, f7, f8) {
    @Suppress("UNCHECKED_CAST")
    mapper(it[0] as T1, it[1] as T2, it[2] as T3, it[3] as T4, it[4] as T5, it[5] as T6, it[6] as T7, it[7] as T8)
}.stateIn(
    scope = scope,
    started = started,
    initialValue = mapper(f1.value, f2.value, f3.value, f4.value, f5.value, f6.value, f7.value, f8.value),
)

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> combineStates(
    scope: CoroutineScope,
    started: SharingStarted,
    f1: StateFlow<T1>,
    f2: StateFlow<T2>,
    f3: StateFlow<T3>,
    f4: StateFlow<T4>,
    f5: StateFlow<T5>,
    f6: StateFlow<T6>,
    f7: StateFlow<T7>,
    f8: StateFlow<T8>,
    f9: StateFlow<T9>,
    mapper: (T1, T2, T3, T4, T5, T6, T7, T8, T9) -> R,
): StateFlow<R> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9) {
    @Suppress("UNCHECKED_CAST")
    mapper(it[0] as T1, it[1] as T2, it[2] as T3, it[3] as T4, it[4] as T5, it[5] as T6, it[6] as T7, it[7] as T8, it[8] as T9)
}.stateIn(
    scope = scope,
    started = started,
    initialValue = mapper(f1.value, f2.value, f3.value, f4.value, f5.value, f6.value, f7.value, f8.value, f9.value),
)

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, R> combineStates(
    scope: CoroutineScope,
    started: SharingStarted,
    f1: StateFlow<T1>,
    f2: StateFlow<T2>,
    f3: StateFlow<T3>,
    f4: StateFlow<T4>,
    f5: StateFlow<T5>,
    f6: StateFlow<T6>,
    f7: StateFlow<T7>,
    f8: StateFlow<T8>,
    f9: StateFlow<T9>,
    f10: StateFlow<T10>,
    mapper: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10) -> R,
): StateFlow<R> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10) {
    @Suppress("UNCHECKED_CAST")
    mapper(it[0] as T1, it[1] as T2, it[2] as T3, it[3] as T4, it[4] as T5, it[5] as T6, it[6] as T7, it[7] as T8, it[8] as T9, it[9] as T10)
}.stateIn(
    scope = scope,
    started = started,
    initialValue = mapper(f1.value, f2.value, f3.value, f4.value, f5.value, f6.value, f7.value, f8.value, f9.value, f10.value),
)

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, R> combineStates(
    scope: CoroutineScope,
    started: SharingStarted,
    f1: StateFlow<T1>,
    f2: StateFlow<T2>,
    f3: StateFlow<T3>,
    f4: StateFlow<T4>,
    f5: StateFlow<T5>,
    f6: StateFlow<T6>,
    f7: StateFlow<T7>,
    f8: StateFlow<T8>,
    f9: StateFlow<T9>,
    f10: StateFlow<T10>,
    f11: StateFlow<T11>,
    mapper: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11) -> R,
): StateFlow<R> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11) {
    @Suppress("UNCHECKED_CAST")
    mapper(it[0] as T1, it[1] as T2, it[2] as T3, it[3] as T4, it[4] as T5, it[5] as T6, it[6] as T7, it[7] as T8, it[8] as T9, it[9] as T10, it[10] as T11)
}.stateIn(
    scope = scope,
    started = started,
    initialValue = mapper(f1.value, f2.value, f3.value, f4.value, f5.value, f6.value, f7.value, f8.value, f9.value, f10.value, f11.value),
)

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, R> combineStates(
    scope: CoroutineScope,
    started: SharingStarted,
    f1: StateFlow<T1>,
    f2: StateFlow<T2>,
    f3: StateFlow<T3>,
    f4: StateFlow<T4>,
    f5: StateFlow<T5>,
    f6: StateFlow<T6>,
    f7: StateFlow<T7>,
    f8: StateFlow<T8>,
    f9: StateFlow<T9>,
    f10: StateFlow<T10>,
    f11: StateFlow<T11>,
    f12: StateFlow<T12>,
    mapper: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12) -> R,
): StateFlow<R> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12) {
    @Suppress("UNCHECKED_CAST")
    mapper(it[0] as T1, it[1] as T2, it[2] as T3, it[3] as T4, it[4] as T5, it[5] as T6, it[6] as T7, it[7] as T8, it[8] as T9, it[9] as T10, it[10] as T11, it[11] as T12)
}.stateIn(
    scope = scope,
    started = started,
    initialValue = mapper(f1.value, f2.value, f3.value, f4.value, f5.value, f6.value, f7.value, f8.value, f9.value, f10.value, f11.value, f12.value),
)

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, R> combineStates(
    scope: CoroutineScope,
    started: SharingStarted,
    f1: StateFlow<T1>,
    f2: StateFlow<T2>,
    f3: StateFlow<T3>,
    f4: StateFlow<T4>,
    f5: StateFlow<T5>,
    f6: StateFlow<T6>,
    f7: StateFlow<T7>,
    f8: StateFlow<T8>,
    f9: StateFlow<T9>,
    f10: StateFlow<T10>,
    f11: StateFlow<T11>,
    f12: StateFlow<T12>,
    f13: StateFlow<T13>,
    mapper: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13) -> R,
): StateFlow<R> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13) {
    @Suppress("UNCHECKED_CAST")
    mapper(it[0] as T1, it[1] as T2, it[2] as T3, it[3] as T4, it[4] as T5, it[5] as T6, it[6] as T7, it[7] as T8, it[8] as T9, it[9] as T10, it[10] as T11, it[11] as T12, it[12] as T13)
}.stateIn(
    scope = scope,
    started = started,
    initialValue = mapper(f1.value, f2.value, f3.value, f4.value, f5.value, f6.value, f7.value, f8.value, f9.value, f10.value, f11.value, f12.value, f13.value),
)

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, R> combineStates(
    scope: CoroutineScope,
    started: SharingStarted,
    f1: StateFlow<T1>,
    f2: StateFlow<T2>,
    f3: StateFlow<T3>,
    f4: StateFlow<T4>,
    f5: StateFlow<T5>,
    f6: StateFlow<T6>,
    f7: StateFlow<T7>,
    f8: StateFlow<T8>,
    f9: StateFlow<T9>,
    f10: StateFlow<T10>,
    f11: StateFlow<T11>,
    f12: StateFlow<T12>,
    f13: StateFlow<T13>,
    f14: StateFlow<T14>,
    mapper: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14) -> R,
): StateFlow<R> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14) {
    @Suppress("UNCHECKED_CAST")
    mapper(it[0] as T1, it[1] as T2, it[2] as T3, it[3] as T4, it[4] as T5, it[5] as T6, it[6] as T7, it[7] as T8, it[8] as T9, it[9] as T10, it[10] as T11, it[11] as T12, it[12] as T13, it[13] as T14)
}.stateIn(
    scope = scope,
    started = started,
    initialValue = mapper(f1.value, f2.value, f3.value, f4.value, f5.value, f6.value, f7.value, f8.value, f9.value, f10.value, f11.value, f12.value, f13.value, f14.value),
)

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, R> combineStates(
    scope: CoroutineScope,
    started: SharingStarted,
    f1: StateFlow<T1>,
    f2: StateFlow<T2>,
    f3: StateFlow<T3>,
    f4: StateFlow<T4>,
    f5: StateFlow<T5>,
    f6: StateFlow<T6>,
    f7: StateFlow<T7>,
    f8: StateFlow<T8>,
    f9: StateFlow<T9>,
    f10: StateFlow<T10>,
    f11: StateFlow<T11>,
    f12: StateFlow<T12>,
    f13: StateFlow<T13>,
    f14: StateFlow<T14>,
    f15: StateFlow<T15>,
    mapper: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15) -> R,
): StateFlow<R> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15) {
    @Suppress("UNCHECKED_CAST")
    mapper(it[0] as T1, it[1] as T2, it[2] as T3, it[3] as T4, it[4] as T5, it[5] as T6, it[6] as T7, it[7] as T8, it[8] as T9, it[9] as T10, it[10] as T11, it[11] as T12, it[12] as T13, it[13] as T14, it[14] as T15)
}.stateIn(
    scope = scope,
    started = started,
    initialValue = mapper(f1.value, f2.value, f3.value, f4.value, f5.value, f6.value, f7.value, f8.value, f9.value, f10.value, f11.value, f12.value, f13.value, f14.value, f15.value),
)

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, R> combineStates(
    scope: CoroutineScope,
    started: SharingStarted,
    f1: StateFlow<T1>,
    f2: StateFlow<T2>,
    f3: StateFlow<T3>,
    f4: StateFlow<T4>,
    f5: StateFlow<T5>,
    f6: StateFlow<T6>,
    f7: StateFlow<T7>,
    f8: StateFlow<T8>,
    f9: StateFlow<T9>,
    f10: StateFlow<T10>,
    f11: StateFlow<T11>,
    f12: StateFlow<T12>,
    f13: StateFlow<T13>,
    f14: StateFlow<T14>,
    f15: StateFlow<T15>,
    f16: StateFlow<T16>,
    mapper: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16) -> R,
): StateFlow<R> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16) {
    @Suppress("UNCHECKED_CAST")
    mapper(it[0] as T1, it[1] as T2, it[2] as T3, it[3] as T4, it[4] as T5, it[5] as T6, it[6] as T7, it[7] as T8, it[8] as T9, it[9] as T10, it[10] as T11, it[11] as T12, it[12] as T13, it[13] as T14, it[14] as T15, it[15] as T16)
}.stateIn(
    scope = scope,
    started = started,
    initialValue = mapper(f1.value, f2.value, f3.value, f4.value, f5.value, f6.value, f7.value, f8.value, f9.value, f10.value, f11.value, f12.value, f13.value, f14.value, f15.value, f16.value),
)

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, R> combineStates(
    scope: CoroutineScope,
    started: SharingStarted,
    f1: StateFlow<T1>,
    f2: StateFlow<T2>,
    f3: StateFlow<T3>,
    f4: StateFlow<T4>,
    f5: StateFlow<T5>,
    f6: StateFlow<T6>,
    f7: StateFlow<T7>,
    f8: StateFlow<T8>,
    f9: StateFlow<T9>,
    f10: StateFlow<T10>,
    f11: StateFlow<T11>,
    f12: StateFlow<T12>,
    f13: StateFlow<T13>,
    f14: StateFlow<T14>,
    f15: StateFlow<T15>,
    f16: StateFlow<T16>,
    f17: StateFlow<T17>,
    mapper: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17) -> R,
): StateFlow<R> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17) {
    @Suppress("UNCHECKED_CAST")
    mapper(it[0] as T1, it[1] as T2, it[2] as T3, it[3] as T4, it[4] as T5, it[5] as T6, it[6] as T7, it[7] as T8, it[8] as T9, it[9] as T10, it[10] as T11, it[11] as T12, it[12] as T13, it[13] as T14, it[14] as T15, it[15] as T16, it[16] as T17)
}.stateIn(
    scope = scope,
    started = started,
    initialValue = mapper(f1.value, f2.value, f3.value, f4.value, f5.value, f6.value, f7.value, f8.value, f9.value, f10.value, f11.value, f12.value, f13.value, f14.value, f15.value, f16.value, f17.value),
)

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, R> combineStates(
    scope: CoroutineScope,
    started: SharingStarted,
    f1: StateFlow<T1>,
    f2: StateFlow<T2>,
    f3: StateFlow<T3>,
    f4: StateFlow<T4>,
    f5: StateFlow<T5>,
    f6: StateFlow<T6>,
    f7: StateFlow<T7>,
    f8: StateFlow<T8>,
    f9: StateFlow<T9>,
    f10: StateFlow<T10>,
    f11: StateFlow<T11>,
    f12: StateFlow<T12>,
    f13: StateFlow<T13>,
    f14: StateFlow<T14>,
    f15: StateFlow<T15>,
    f16: StateFlow<T16>,
    f17: StateFlow<T17>,
    f18: StateFlow<T18>,
    mapper: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18) -> R,
): StateFlow<R> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18) {
    @Suppress("UNCHECKED_CAST")
    mapper(it[0] as T1, it[1] as T2, it[2] as T3, it[3] as T4, it[4] as T5, it[5] as T6, it[6] as T7, it[7] as T8, it[8] as T9, it[9] as T10, it[10] as T11, it[11] as T12, it[12] as T13, it[13] as T14, it[14] as T15, it[15] as T16, it[16] as T17, it[17] as T18)
}.stateIn(
    scope = scope,
    started = started,
    initialValue = mapper(f1.value, f2.value, f3.value, f4.value, f5.value, f6.value, f7.value, f8.value, f9.value, f10.value, f11.value, f12.value, f13.value, f14.value, f15.value, f16.value, f17.value, f18.value),
)

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, R> combineStates(
    scope: CoroutineScope,
    started: SharingStarted,
    f1: StateFlow<T1>,
    f2: StateFlow<T2>,
    f3: StateFlow<T3>,
    f4: StateFlow<T4>,
    f5: StateFlow<T5>,
    f6: StateFlow<T6>,
    f7: StateFlow<T7>,
    f8: StateFlow<T8>,
    f9: StateFlow<T9>,
    f10: StateFlow<T10>,
    f11: StateFlow<T11>,
    f12: StateFlow<T12>,
    f13: StateFlow<T13>,
    f14: StateFlow<T14>,
    f15: StateFlow<T15>,
    f16: StateFlow<T16>,
    f17: StateFlow<T17>,
    f18: StateFlow<T18>,
    f19: StateFlow<T19>,
    mapper: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19) -> R,
): StateFlow<R> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19) {
    @Suppress("UNCHECKED_CAST")
    mapper(it[0] as T1, it[1] as T2, it[2] as T3, it[3] as T4, it[4] as T5, it[5] as T6, it[6] as T7, it[7] as T8, it[8] as T9, it[9] as T10, it[10] as T11, it[11] as T12, it[12] as T13, it[13] as T14, it[14] as T15, it[15] as T16, it[16] as T17, it[17] as T18, it[18] as T19)
}.stateIn(
    scope = scope,
    started = started,
    initialValue = mapper(f1.value, f2.value, f3.value, f4.value, f5.value, f6.value, f7.value, f8.value, f9.value, f10.value, f11.value, f12.value, f13.value, f14.value, f15.value, f16.value, f17.value, f18.value, f19.value),
)

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, R> combineStates(
    scope: CoroutineScope,
    started: SharingStarted,
    f1: StateFlow<T1>,
    f2: StateFlow<T2>,
    f3: StateFlow<T3>,
    f4: StateFlow<T4>,
    f5: StateFlow<T5>,
    f6: StateFlow<T6>,
    f7: StateFlow<T7>,
    f8: StateFlow<T8>,
    f9: StateFlow<T9>,
    f10: StateFlow<T10>,
    f11: StateFlow<T11>,
    f12: StateFlow<T12>,
    f13: StateFlow<T13>,
    f14: StateFlow<T14>,
    f15: StateFlow<T15>,
    f16: StateFlow<T16>,
    f17: StateFlow<T17>,
    f18: StateFlow<T18>,
    f19: StateFlow<T19>,
    f20: StateFlow<T20>,
    mapper: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20) -> R,
): StateFlow<R> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20) {
    @Suppress("UNCHECKED_CAST")
    mapper(it[0] as T1, it[1] as T2, it[2] as T3, it[3] as T4, it[4] as T5, it[5] as T6, it[6] as T7, it[7] as T8, it[8] as T9, it[9] as T10, it[10] as T11, it[11] as T12, it[12] as T13, it[13] as T14, it[14] as T15, it[15] as T16, it[16] as T17, it[17] as T18, it[18] as T19, it[19] as T20)
}.stateIn(
    scope = scope,
    started = started,
    initialValue = mapper(f1.value, f2.value, f3.value, f4.value, f5.value, f6.value, f7.value, f8.value, f9.value, f10.value, f11.value, f12.value, f13.value, f14.value, f15.value, f16.value, f17.value, f18.value, f19.value, f20.value),
)

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, R> combineStates(
    scope: CoroutineScope,
    started: SharingStarted,
    f1: StateFlow<T1>,
    f2: StateFlow<T2>,
    f3: StateFlow<T3>,
    f4: StateFlow<T4>,
    f5: StateFlow<T5>,
    f6: StateFlow<T6>,
    f7: StateFlow<T7>,
    f8: StateFlow<T8>,
    f9: StateFlow<T9>,
    f10: StateFlow<T10>,
    f11: StateFlow<T11>,
    f12: StateFlow<T12>,
    f13: StateFlow<T13>,
    f14: StateFlow<T14>,
    f15: StateFlow<T15>,
    f16: StateFlow<T16>,
    f17: StateFlow<T17>,
    f18: StateFlow<T18>,
    f19: StateFlow<T19>,
    f20: StateFlow<T20>,
    f21: StateFlow<T21>,
    mapper: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21) -> R,
): StateFlow<R> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21) {
    @Suppress("UNCHECKED_CAST")
    mapper(it[0] as T1, it[1] as T2, it[2] as T3, it[3] as T4, it[4] as T5, it[5] as T6, it[6] as T7, it[7] as T8, it[8] as T9, it[9] as T10, it[10] as T11, it[11] as T12, it[12] as T13, it[13] as T14, it[14] as T15, it[15] as T16, it[16] as T17, it[17] as T18, it[18] as T19, it[19] as T20, it[20] as T21)
}.stateIn(
    scope = scope,
    started = started,
    initialValue = mapper(f1.value, f2.value, f3.value, f4.value, f5.value, f6.value, f7.value, f8.value, f9.value, f10.value, f11.value, f12.value, f13.value, f14.value, f15.value, f16.value, f17.value, f18.value, f19.value, f20.value, f21.value),
)

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, R> combineStates(
    scope: CoroutineScope,
    started: SharingStarted,
    f1: StateFlow<T1>,
    f2: StateFlow<T2>,
    f3: StateFlow<T3>,
    f4: StateFlow<T4>,
    f5: StateFlow<T5>,
    f6: StateFlow<T6>,
    f7: StateFlow<T7>,
    f8: StateFlow<T8>,
    f9: StateFlow<T9>,
    f10: StateFlow<T10>,
    f11: StateFlow<T11>,
    f12: StateFlow<T12>,
    f13: StateFlow<T13>,
    f14: StateFlow<T14>,
    f15: StateFlow<T15>,
    f16: StateFlow<T16>,
    f17: StateFlow<T17>,
    f18: StateFlow<T18>,
    f19: StateFlow<T19>,
    f20: StateFlow<T20>,
    f21: StateFlow<T21>,
    f22: StateFlow<T22>,
    mapper: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22) -> R,
): StateFlow<R> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, f22) {
    @Suppress("UNCHECKED_CAST")
    mapper(it[0] as T1, it[1] as T2, it[2] as T3, it[3] as T4, it[4] as T5, it[5] as T6, it[6] as T7, it[7] as T8, it[8] as T9, it[9] as T10, it[10] as T11, it[11] as T12, it[12] as T13, it[13] as T14, it[14] as T15, it[15] as T16, it[16] as T17, it[17] as T18, it[18] as T19, it[19] as T20, it[20] as T21, it[21] as T22)
}.stateIn(
    scope = scope,
    started = started,
    initialValue = mapper(f1.value, f2.value, f3.value, f4.value, f5.value, f6.value, f7.value, f8.value, f9.value, f10.value, f11.value, f12.value, f13.value, f14.value, f15.value, f16.value, f17.value, f18.value, f19.value, f20.value, f21.value, f22.value),
)

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, R> combineStates(
    scope: CoroutineScope,
    started: SharingStarted,
    f1: StateFlow<T1>,
    f2: StateFlow<T2>,
    f3: StateFlow<T3>,
    f4: StateFlow<T4>,
    f5: StateFlow<T5>,
    f6: StateFlow<T6>,
    f7: StateFlow<T7>,
    f8: StateFlow<T8>,
    f9: StateFlow<T9>,
    f10: StateFlow<T10>,
    f11: StateFlow<T11>,
    f12: StateFlow<T12>,
    f13: StateFlow<T13>,
    f14: StateFlow<T14>,
    f15: StateFlow<T15>,
    f16: StateFlow<T16>,
    f17: StateFlow<T17>,
    f18: StateFlow<T18>,
    f19: StateFlow<T19>,
    f20: StateFlow<T20>,
    f21: StateFlow<T21>,
    f22: StateFlow<T22>,
    f23: StateFlow<T23>,
    mapper: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23) -> R,
): StateFlow<R> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, f22, f23) {
    @Suppress("UNCHECKED_CAST")
    mapper(it[0] as T1, it[1] as T2, it[2] as T3, it[3] as T4, it[4] as T5, it[5] as T6, it[6] as T7, it[7] as T8, it[8] as T9, it[9] as T10, it[10] as T11, it[11] as T12, it[12] as T13, it[13] as T14, it[14] as T15, it[15] as T16, it[16] as T17, it[17] as T18, it[18] as T19, it[19] as T20, it[20] as T21, it[21] as T22, it[22] as T23)
}.stateIn(
    scope = scope,
    started = started,
    initialValue = mapper(f1.value, f2.value, f3.value, f4.value, f5.value, f6.value, f7.value, f8.value, f9.value, f10.value, f11.value, f12.value, f13.value, f14.value, f15.value, f16.value, f17.value, f18.value, f19.value, f20.value, f21.value, f22.value, f23.value),
)

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, R> combineStates(
    scope: CoroutineScope,
    started: SharingStarted,
    f1: StateFlow<T1>,
    f2: StateFlow<T2>,
    f3: StateFlow<T3>,
    f4: StateFlow<T4>,
    f5: StateFlow<T5>,
    f6: StateFlow<T6>,
    f7: StateFlow<T7>,
    f8: StateFlow<T8>,
    f9: StateFlow<T9>,
    f10: StateFlow<T10>,
    f11: StateFlow<T11>,
    f12: StateFlow<T12>,
    f13: StateFlow<T13>,
    f14: StateFlow<T14>,
    f15: StateFlow<T15>,
    f16: StateFlow<T16>,
    f17: StateFlow<T17>,
    f18: StateFlow<T18>,
    f19: StateFlow<T19>,
    f20: StateFlow<T20>,
    f21: StateFlow<T21>,
    f22: StateFlow<T22>,
    f23: StateFlow<T23>,
    f24: StateFlow<T24>,
    mapper: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24) -> R,
): StateFlow<R> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, f22, f23, f24) {
    @Suppress("UNCHECKED_CAST")
    mapper(it[0] as T1, it[1] as T2, it[2] as T3, it[3] as T4, it[4] as T5, it[5] as T6, it[6] as T7, it[7] as T8, it[8] as T9, it[9] as T10, it[10] as T11, it[11] as T12, it[12] as T13, it[13] as T14, it[14] as T15, it[15] as T16, it[16] as T17, it[17] as T18, it[18] as T19, it[19] as T20, it[20] as T21, it[21] as T22, it[22] as T23, it[23] as T24)
}.stateIn(
    scope = scope,
    started = started,
    initialValue = mapper(f1.value, f2.value, f3.value, f4.value, f5.value, f6.value, f7.value, f8.value, f9.value, f10.value, f11.value, f12.value, f13.value, f14.value, f15.value, f16.value, f17.value, f18.value, f19.value, f20.value, f21.value, f22.value, f23.value, f24.value),
)

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, R> combineStates(
    scope: CoroutineScope,
    started: SharingStarted,
    f1: StateFlow<T1>,
    f2: StateFlow<T2>,
    f3: StateFlow<T3>,
    f4: StateFlow<T4>,
    f5: StateFlow<T5>,
    f6: StateFlow<T6>,
    f7: StateFlow<T7>,
    f8: StateFlow<T8>,
    f9: StateFlow<T9>,
    f10: StateFlow<T10>,
    f11: StateFlow<T11>,
    f12: StateFlow<T12>,
    f13: StateFlow<T13>,
    f14: StateFlow<T14>,
    f15: StateFlow<T15>,
    f16: StateFlow<T16>,
    f17: StateFlow<T17>,
    f18: StateFlow<T18>,
    f19: StateFlow<T19>,
    f20: StateFlow<T20>,
    f21: StateFlow<T21>,
    f22: StateFlow<T22>,
    f23: StateFlow<T23>,
    f24: StateFlow<T24>,
    f25: StateFlow<T25>,
    mapper: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25) -> R,
): StateFlow<R> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, f22, f23, f24, f25) {
    @Suppress("UNCHECKED_CAST")
    mapper(it[0] as T1, it[1] as T2, it[2] as T3, it[3] as T4, it[4] as T5, it[5] as T6, it[6] as T7, it[7] as T8, it[8] as T9, it[9] as T10, it[10] as T11, it[11] as T12, it[12] as T13, it[13] as T14, it[14] as T15, it[15] as T16, it[16] as T17, it[17] as T18, it[18] as T19, it[19] as T20, it[20] as T21, it[21] as T22, it[22] as T23, it[23] as T24, it[24] as T25)
}.stateIn(
    scope = scope,
    started = started,
    initialValue = mapper(f1.value, f2.value, f3.value, f4.value, f5.value, f6.value, f7.value, f8.value, f9.value, f10.value, f11.value, f12.value, f13.value, f14.value, f15.value, f16.value, f17.value, f18.value, f19.value, f20.value, f21.value, f22.value, f23.value, f24.value, f25.value),
)

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, R> combineStates(
    scope: CoroutineScope,
    started: SharingStarted,
    f1: StateFlow<T1>,
    f2: StateFlow<T2>,
    f3: StateFlow<T3>,
    f4: StateFlow<T4>,
    f5: StateFlow<T5>,
    f6: StateFlow<T6>,
    f7: StateFlow<T7>,
    f8: StateFlow<T8>,
    f9: StateFlow<T9>,
    f10: StateFlow<T10>,
    f11: StateFlow<T11>,
    f12: StateFlow<T12>,
    f13: StateFlow<T13>,
    f14: StateFlow<T14>,
    f15: StateFlow<T15>,
    f16: StateFlow<T16>,
    f17: StateFlow<T17>,
    f18: StateFlow<T18>,
    f19: StateFlow<T19>,
    f20: StateFlow<T20>,
    f21: StateFlow<T21>,
    f22: StateFlow<T22>,
    f23: StateFlow<T23>,
    f24: StateFlow<T24>,
    f25: StateFlow<T25>,
    f26: StateFlow<T26>,
    mapper: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26) -> R,
): StateFlow<R> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, f22, f23, f24, f25, f26) {
    @Suppress("UNCHECKED_CAST")
    mapper(it[0] as T1, it[1] as T2, it[2] as T3, it[3] as T4, it[4] as T5, it[5] as T6, it[6] as T7, it[7] as T8, it[8] as T9, it[9] as T10, it[10] as T11, it[11] as T12, it[12] as T13, it[13] as T14, it[14] as T15, it[15] as T16, it[16] as T17, it[17] as T18, it[18] as T19, it[19] as T20, it[20] as T21, it[21] as T22, it[22] as T23, it[23] as T24, it[24] as T25, it[25] as T26)
}.stateIn(
    scope = scope,
    started = started,
    initialValue = mapper(f1.value, f2.value, f3.value, f4.value, f5.value, f6.value, f7.value, f8.value, f9.value, f10.value, f11.value, f12.value, f13.value, f14.value, f15.value, f16.value, f17.value, f18.value, f19.value, f20.value, f21.value, f22.value, f23.value, f24.value, f25.value, f26.value),
)

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, R> combineStates(
    scope: CoroutineScope,
    started: SharingStarted,
    f1: StateFlow<T1>,
    f2: StateFlow<T2>,
    f3: StateFlow<T3>,
    f4: StateFlow<T4>,
    f5: StateFlow<T5>,
    f6: StateFlow<T6>,
    f7: StateFlow<T7>,
    f8: StateFlow<T8>,
    f9: StateFlow<T9>,
    f10: StateFlow<T10>,
    f11: StateFlow<T11>,
    f12: StateFlow<T12>,
    f13: StateFlow<T13>,
    f14: StateFlow<T14>,
    f15: StateFlow<T15>,
    f16: StateFlow<T16>,
    f17: StateFlow<T17>,
    f18: StateFlow<T18>,
    f19: StateFlow<T19>,
    f20: StateFlow<T20>,
    f21: StateFlow<T21>,
    f22: StateFlow<T22>,
    f23: StateFlow<T23>,
    f24: StateFlow<T24>,
    f25: StateFlow<T25>,
    f26: StateFlow<T26>,
    f27: StateFlow<T27>,
    mapper: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27) -> R,
): StateFlow<R> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, f22, f23, f24, f25, f26, f27) {
    @Suppress("UNCHECKED_CAST")
    mapper(it[0] as T1, it[1] as T2, it[2] as T3, it[3] as T4, it[4] as T5, it[5] as T6, it[6] as T7, it[7] as T8, it[8] as T9, it[9] as T10, it[10] as T11, it[11] as T12, it[12] as T13, it[13] as T14, it[14] as T15, it[15] as T16, it[16] as T17, it[17] as T18, it[18] as T19, it[19] as T20, it[20] as T21, it[21] as T22, it[22] as T23, it[23] as T24, it[24] as T25, it[25] as T26, it[26] as T27)
}.stateIn(
    scope = scope,
    started = started,
    initialValue = mapper(f1.value, f2.value, f3.value, f4.value, f5.value, f6.value, f7.value, f8.value, f9.value, f10.value, f11.value, f12.value, f13.value, f14.value, f15.value, f16.value, f17.value, f18.value, f19.value, f20.value, f21.value, f22.value, f23.value, f24.value, f25.value, f26.value, f27.value),
)

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, R> combineStates(
    scope: CoroutineScope,
    started: SharingStarted,
    f1: StateFlow<T1>,
    f2: StateFlow<T2>,
    f3: StateFlow<T3>,
    f4: StateFlow<T4>,
    f5: StateFlow<T5>,
    f6: StateFlow<T6>,
    f7: StateFlow<T7>,
    f8: StateFlow<T8>,
    f9: StateFlow<T9>,
    f10: StateFlow<T10>,
    f11: StateFlow<T11>,
    f12: StateFlow<T12>,
    f13: StateFlow<T13>,
    f14: StateFlow<T14>,
    f15: StateFlow<T15>,
    f16: StateFlow<T16>,
    f17: StateFlow<T17>,
    f18: StateFlow<T18>,
    f19: StateFlow<T19>,
    f20: StateFlow<T20>,
    f21: StateFlow<T21>,
    f22: StateFlow<T22>,
    f23: StateFlow<T23>,
    f24: StateFlow<T24>,
    f25: StateFlow<T25>,
    f26: StateFlow<T26>,
    f27: StateFlow<T27>,
    f28: StateFlow<T28>,
    mapper: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28) -> R,
): StateFlow<R> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, f22, f23, f24, f25, f26, f27, f28) {
    @Suppress("UNCHECKED_CAST")
    mapper(it[0] as T1, it[1] as T2, it[2] as T3, it[3] as T4, it[4] as T5, it[5] as T6, it[6] as T7, it[7] as T8, it[8] as T9, it[9] as T10, it[10] as T11, it[11] as T12, it[12] as T13, it[13] as T14, it[14] as T15, it[15] as T16, it[16] as T17, it[17] as T18, it[18] as T19, it[19] as T20, it[20] as T21, it[21] as T22, it[22] as T23, it[23] as T24, it[24] as T25, it[25] as T26, it[26] as T27, it[27] as T28)
}.stateIn(
    scope = scope,
    started = started,
    initialValue = mapper(f1.value, f2.value, f3.value, f4.value, f5.value, f6.value, f7.value, f8.value, f9.value, f10.value, f11.value, f12.value, f13.value, f14.value, f15.value, f16.value, f17.value, f18.value, f19.value, f20.value, f21.value, f22.value, f23.value, f24.value, f25.value, f26.value, f27.value, f28.value),
)

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, R> combineStates(
    scope: CoroutineScope,
    started: SharingStarted,
    f1: StateFlow<T1>,
    f2: StateFlow<T2>,
    f3: StateFlow<T3>,
    f4: StateFlow<T4>,
    f5: StateFlow<T5>,
    f6: StateFlow<T6>,
    f7: StateFlow<T7>,
    f8: StateFlow<T8>,
    f9: StateFlow<T9>,
    f10: StateFlow<T10>,
    f11: StateFlow<T11>,
    f12: StateFlow<T12>,
    f13: StateFlow<T13>,
    f14: StateFlow<T14>,
    f15: StateFlow<T15>,
    f16: StateFlow<T16>,
    f17: StateFlow<T17>,
    f18: StateFlow<T18>,
    f19: StateFlow<T19>,
    f20: StateFlow<T20>,
    f21: StateFlow<T21>,
    f22: StateFlow<T22>,
    f23: StateFlow<T23>,
    f24: StateFlow<T24>,
    f25: StateFlow<T25>,
    f26: StateFlow<T26>,
    f27: StateFlow<T27>,
    f28: StateFlow<T28>,
    f29: StateFlow<T29>,
    mapper: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29) -> R,
): StateFlow<R> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, f22, f23, f24, f25, f26, f27, f28, f29) {
    @Suppress("UNCHECKED_CAST")
    mapper(it[0] as T1, it[1] as T2, it[2] as T3, it[3] as T4, it[4] as T5, it[5] as T6, it[6] as T7, it[7] as T8, it[8] as T9, it[9] as T10, it[10] as T11, it[11] as T12, it[12] as T13, it[13] as T14, it[14] as T15, it[15] as T16, it[16] as T17, it[17] as T18, it[18] as T19, it[19] as T20, it[20] as T21, it[21] as T22, it[22] as T23, it[23] as T24, it[24] as T25, it[25] as T26, it[26] as T27, it[27] as T28, it[28] as T29)
}.stateIn(
    scope = scope,
    started = started,
    initialValue = mapper(f1.value, f2.value, f3.value, f4.value, f5.value, f6.value, f7.value, f8.value, f9.value, f10.value, f11.value, f12.value, f13.value, f14.value, f15.value, f16.value, f17.value, f18.value, f19.value, f20.value, f21.value, f22.value, f23.value, f24.value, f25.value, f26.value, f27.value, f28.value, f29.value),
)

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, R> combineStates(
    scope: CoroutineScope,
    started: SharingStarted,
    f1: StateFlow<T1>,
    f2: StateFlow<T2>,
    f3: StateFlow<T3>,
    f4: StateFlow<T4>,
    f5: StateFlow<T5>,
    f6: StateFlow<T6>,
    f7: StateFlow<T7>,
    f8: StateFlow<T8>,
    f9: StateFlow<T9>,
    f10: StateFlow<T10>,
    f11: StateFlow<T11>,
    f12: StateFlow<T12>,
    f13: StateFlow<T13>,
    f14: StateFlow<T14>,
    f15: StateFlow<T15>,
    f16: StateFlow<T16>,
    f17: StateFlow<T17>,
    f18: StateFlow<T18>,
    f19: StateFlow<T19>,
    f20: StateFlow<T20>,
    f21: StateFlow<T21>,
    f22: StateFlow<T22>,
    f23: StateFlow<T23>,
    f24: StateFlow<T24>,
    f25: StateFlow<T25>,
    f26: StateFlow<T26>,
    f27: StateFlow<T27>,
    f28: StateFlow<T28>,
    f29: StateFlow<T29>,
    f30: StateFlow<T30>,
    mapper: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30) -> R,
): StateFlow<R> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, f22, f23, f24, f25, f26, f27, f28, f29, f30) {
    @Suppress("UNCHECKED_CAST")
    mapper(it[0] as T1, it[1] as T2, it[2] as T3, it[3] as T4, it[4] as T5, it[5] as T6, it[6] as T7, it[7] as T8, it[8] as T9, it[9] as T10, it[10] as T11, it[11] as T12, it[12] as T13, it[13] as T14, it[14] as T15, it[15] as T16, it[16] as T17, it[17] as T18, it[18] as T19, it[19] as T20, it[20] as T21, it[21] as T22, it[22] as T23, it[23] as T24, it[24] as T25, it[25] as T26, it[26] as T27, it[27] as T28, it[28] as T29, it[29] as T30)
}.stateIn(
    scope = scope,
    started = started,
    initialValue = mapper(f1.value, f2.value, f3.value, f4.value, f5.value, f6.value, f7.value, f8.value, f9.value, f10.value, f11.value, f12.value, f13.value, f14.value, f15.value, f16.value, f17.value, f18.value, f19.value, f20.value, f21.value, f22.value, f23.value, f24.value, f25.value, f26.value, f27.value, f28.value, f29.value, f30.value),
)

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, R> combineStates(
    scope: CoroutineScope,
    started: SharingStarted,
    f1: StateFlow<T1>,
    f2: StateFlow<T2>,
    f3: StateFlow<T3>,
    f4: StateFlow<T4>,
    f5: StateFlow<T5>,
    f6: StateFlow<T6>,
    f7: StateFlow<T7>,
    f8: StateFlow<T8>,
    f9: StateFlow<T9>,
    f10: StateFlow<T10>,
    f11: StateFlow<T11>,
    f12: StateFlow<T12>,
    f13: StateFlow<T13>,
    f14: StateFlow<T14>,
    f15: StateFlow<T15>,
    f16: StateFlow<T16>,
    f17: StateFlow<T17>,
    f18: StateFlow<T18>,
    f19: StateFlow<T19>,
    f20: StateFlow<T20>,
    f21: StateFlow<T21>,
    f22: StateFlow<T22>,
    f23: StateFlow<T23>,
    f24: StateFlow<T24>,
    f25: StateFlow<T25>,
    f26: StateFlow<T26>,
    f27: StateFlow<T27>,
    f28: StateFlow<T28>,
    f29: StateFlow<T29>,
    f30: StateFlow<T30>,
    f31: StateFlow<T31>,
    mapper: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31) -> R,
): StateFlow<R> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, f22, f23, f24, f25, f26, f27, f28, f29, f30, f31) {
    @Suppress("UNCHECKED_CAST")
    mapper(it[0] as T1, it[1] as T2, it[2] as T3, it[3] as T4, it[4] as T5, it[5] as T6, it[6] as T7, it[7] as T8, it[8] as T9, it[9] as T10, it[10] as T11, it[11] as T12, it[12] as T13, it[13] as T14, it[14] as T15, it[15] as T16, it[16] as T17, it[17] as T18, it[18] as T19, it[19] as T20, it[20] as T21, it[21] as T22, it[22] as T23, it[23] as T24, it[24] as T25, it[25] as T26, it[26] as T27, it[27] as T28, it[28] as T29, it[29] as T30, it[30] as T31)
}.stateIn(
    scope = scope,
    started = started,
    initialValue = mapper(f1.value, f2.value, f3.value, f4.value, f5.value, f6.value, f7.value, f8.value, f9.value, f10.value, f11.value, f12.value, f13.value, f14.value, f15.value, f16.value, f17.value, f18.value, f19.value, f20.value, f21.value, f22.value, f23.value, f24.value, f25.value, f26.value, f27.value, f28.value, f29.value, f30.value, f31.value),
)

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32, R> combineStates(
    scope: CoroutineScope,
    started: SharingStarted,
    f1: StateFlow<T1>,
    f2: StateFlow<T2>,
    f3: StateFlow<T3>,
    f4: StateFlow<T4>,
    f5: StateFlow<T5>,
    f6: StateFlow<T6>,
    f7: StateFlow<T7>,
    f8: StateFlow<T8>,
    f9: StateFlow<T9>,
    f10: StateFlow<T10>,
    f11: StateFlow<T11>,
    f12: StateFlow<T12>,
    f13: StateFlow<T13>,
    f14: StateFlow<T14>,
    f15: StateFlow<T15>,
    f16: StateFlow<T16>,
    f17: StateFlow<T17>,
    f18: StateFlow<T18>,
    f19: StateFlow<T19>,
    f20: StateFlow<T20>,
    f21: StateFlow<T21>,
    f22: StateFlow<T22>,
    f23: StateFlow<T23>,
    f24: StateFlow<T24>,
    f25: StateFlow<T25>,
    f26: StateFlow<T26>,
    f27: StateFlow<T27>,
    f28: StateFlow<T28>,
    f29: StateFlow<T29>,
    f30: StateFlow<T30>,
    f31: StateFlow<T31>,
    f32: StateFlow<T32>,
    mapper: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32) -> R,
): StateFlow<R> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, f22, f23, f24, f25, f26, f27, f28, f29, f30, f31, f32) {
    @Suppress("UNCHECKED_CAST")
    mapper(it[0] as T1, it[1] as T2, it[2] as T3, it[3] as T4, it[4] as T5, it[5] as T6, it[6] as T7, it[7] as T8, it[8] as T9, it[9] as T10, it[10] as T11, it[11] as T12, it[12] as T13, it[13] as T14, it[14] as T15, it[15] as T16, it[16] as T17, it[17] as T18, it[18] as T19, it[19] as T20, it[20] as T21, it[21] as T22, it[22] as T23, it[23] as T24, it[24] as T25, it[25] as T26, it[26] as T27, it[27] as T28, it[28] as T29, it[29] as T30, it[30] as T31, it[31] as T32)
}.stateIn(
    scope = scope,
    started = started,
    initialValue = mapper(f1.value, f2.value, f3.value, f4.value, f5.value, f6.value, f7.value, f8.value, f9.value, f10.value, f11.value, f12.value, f13.value, f14.value, f15.value, f16.value, f17.value, f18.value, f19.value, f20.value, f21.value, f22.value, f23.value, f24.value, f25.value, f26.value, f27.value, f28.value, f29.value, f30.value, f31.value, f32.value),
)

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32, T33, R> combineStates(
    scope: CoroutineScope,
    started: SharingStarted,
    f1: StateFlow<T1>,
    f2: StateFlow<T2>,
    f3: StateFlow<T3>,
    f4: StateFlow<T4>,
    f5: StateFlow<T5>,
    f6: StateFlow<T6>,
    f7: StateFlow<T7>,
    f8: StateFlow<T8>,
    f9: StateFlow<T9>,
    f10: StateFlow<T10>,
    f11: StateFlow<T11>,
    f12: StateFlow<T12>,
    f13: StateFlow<T13>,
    f14: StateFlow<T14>,
    f15: StateFlow<T15>,
    f16: StateFlow<T16>,
    f17: StateFlow<T17>,
    f18: StateFlow<T18>,
    f19: StateFlow<T19>,
    f20: StateFlow<T20>,
    f21: StateFlow<T21>,
    f22: StateFlow<T22>,
    f23: StateFlow<T23>,
    f24: StateFlow<T24>,
    f25: StateFlow<T25>,
    f26: StateFlow<T26>,
    f27: StateFlow<T27>,
    f28: StateFlow<T28>,
    f29: StateFlow<T29>,
    f30: StateFlow<T30>,
    f31: StateFlow<T31>,
    f32: StateFlow<T32>,
    f33: StateFlow<T33>,
    mapper: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32, T33) -> R,
): StateFlow<R> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, f22, f23, f24, f25, f26, f27, f28, f29, f30, f31, f32, f33) {
    @Suppress("UNCHECKED_CAST")
    mapper(it[0] as T1, it[1] as T2, it[2] as T3, it[3] as T4, it[4] as T5, it[5] as T6, it[6] as T7, it[7] as T8, it[8] as T9, it[9] as T10, it[10] as T11, it[11] as T12, it[12] as T13, it[13] as T14, it[14] as T15, it[15] as T16, it[16] as T17, it[17] as T18, it[18] as T19, it[19] as T20, it[20] as T21, it[21] as T22, it[22] as T23, it[23] as T24, it[24] as T25, it[25] as T26, it[26] as T27, it[27] as T28, it[28] as T29, it[29] as T30, it[30] as T31, it[31] as T32, it[32] as T33)
}.stateIn(
    scope = scope,
    started = started,
    initialValue = mapper(f1.value, f2.value, f3.value, f4.value, f5.value, f6.value, f7.value, f8.value, f9.value, f10.value, f11.value, f12.value, f13.value, f14.value, f15.value, f16.value, f17.value, f18.value, f19.value, f20.value, f21.value, f22.value, f23.value, f24.value, f25.value, f26.value, f27.value, f28.value, f29.value, f30.value, f31.value, f32.value, f33.value),
)

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32, T33, T34, R> combineStates(
    scope: CoroutineScope,
    started: SharingStarted,
    f1: StateFlow<T1>,
    f2: StateFlow<T2>,
    f3: StateFlow<T3>,
    f4: StateFlow<T4>,
    f5: StateFlow<T5>,
    f6: StateFlow<T6>,
    f7: StateFlow<T7>,
    f8: StateFlow<T8>,
    f9: StateFlow<T9>,
    f10: StateFlow<T10>,
    f11: StateFlow<T11>,
    f12: StateFlow<T12>,
    f13: StateFlow<T13>,
    f14: StateFlow<T14>,
    f15: StateFlow<T15>,
    f16: StateFlow<T16>,
    f17: StateFlow<T17>,
    f18: StateFlow<T18>,
    f19: StateFlow<T19>,
    f20: StateFlow<T20>,
    f21: StateFlow<T21>,
    f22: StateFlow<T22>,
    f23: StateFlow<T23>,
    f24: StateFlow<T24>,
    f25: StateFlow<T25>,
    f26: StateFlow<T26>,
    f27: StateFlow<T27>,
    f28: StateFlow<T28>,
    f29: StateFlow<T29>,
    f30: StateFlow<T30>,
    f31: StateFlow<T31>,
    f32: StateFlow<T32>,
    f33: StateFlow<T33>,
    f34: StateFlow<T34>,
    mapper: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32, T33, T34) -> R,
): StateFlow<R> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, f22, f23, f24, f25, f26, f27, f28, f29, f30, f31, f32, f33, f34) {
    @Suppress("UNCHECKED_CAST")
    mapper(it[0] as T1, it[1] as T2, it[2] as T3, it[3] as T4, it[4] as T5, it[5] as T6, it[6] as T7, it[7] as T8, it[8] as T9, it[9] as T10, it[10] as T11, it[11] as T12, it[12] as T13, it[13] as T14, it[14] as T15, it[15] as T16, it[16] as T17, it[17] as T18, it[18] as T19, it[19] as T20, it[20] as T21, it[21] as T22, it[22] as T23, it[23] as T24, it[24] as T25, it[25] as T26, it[26] as T27, it[27] as T28, it[28] as T29, it[29] as T30, it[30] as T31, it[31] as T32, it[32] as T33, it[33] as T34)
}.stateIn(
    scope = scope,
    started = started,
    initialValue = mapper(f1.value, f2.value, f3.value, f4.value, f5.value, f6.value, f7.value, f8.value, f9.value, f10.value, f11.value, f12.value, f13.value, f14.value, f15.value, f16.value, f17.value, f18.value, f19.value, f20.value, f21.value, f22.value, f23.value, f24.value, f25.value, f26.value, f27.value, f28.value, f29.value, f30.value, f31.value, f32.value, f33.value, f34.value),
)

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32, T33, T34, T35, R> combineStates(
    scope: CoroutineScope,
    started: SharingStarted,
    f1: StateFlow<T1>,
    f2: StateFlow<T2>,
    f3: StateFlow<T3>,
    f4: StateFlow<T4>,
    f5: StateFlow<T5>,
    f6: StateFlow<T6>,
    f7: StateFlow<T7>,
    f8: StateFlow<T8>,
    f9: StateFlow<T9>,
    f10: StateFlow<T10>,
    f11: StateFlow<T11>,
    f12: StateFlow<T12>,
    f13: StateFlow<T13>,
    f14: StateFlow<T14>,
    f15: StateFlow<T15>,
    f16: StateFlow<T16>,
    f17: StateFlow<T17>,
    f18: StateFlow<T18>,
    f19: StateFlow<T19>,
    f20: StateFlow<T20>,
    f21: StateFlow<T21>,
    f22: StateFlow<T22>,
    f23: StateFlow<T23>,
    f24: StateFlow<T24>,
    f25: StateFlow<T25>,
    f26: StateFlow<T26>,
    f27: StateFlow<T27>,
    f28: StateFlow<T28>,
    f29: StateFlow<T29>,
    f30: StateFlow<T30>,
    f31: StateFlow<T31>,
    f32: StateFlow<T32>,
    f33: StateFlow<T33>,
    f34: StateFlow<T34>,
    f35: StateFlow<T35>,
    mapper: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32, T33, T34, T35) -> R,
): StateFlow<R> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, f22, f23, f24, f25, f26, f27, f28, f29, f30, f31, f32, f33, f34, f35) {
    @Suppress("UNCHECKED_CAST")
    mapper(it[0] as T1, it[1] as T2, it[2] as T3, it[3] as T4, it[4] as T5, it[5] as T6, it[6] as T7, it[7] as T8, it[8] as T9, it[9] as T10, it[10] as T11, it[11] as T12, it[12] as T13, it[13] as T14, it[14] as T15, it[15] as T16, it[16] as T17, it[17] as T18, it[18] as T19, it[19] as T20, it[20] as T21, it[21] as T22, it[22] as T23, it[23] as T24, it[24] as T25, it[25] as T26, it[26] as T27, it[27] as T28, it[28] as T29, it[29] as T30, it[30] as T31, it[31] as T32, it[32] as T33, it[33] as T34, it[34] as T35)
}.stateIn(
    scope = scope,
    started = started,
    initialValue = mapper(f1.value, f2.value, f3.value, f4.value, f5.value, f6.value, f7.value, f8.value, f9.value, f10.value, f11.value, f12.value, f13.value, f14.value, f15.value, f16.value, f17.value, f18.value, f19.value, f20.value, f21.value, f22.value, f23.value, f24.value, f25.value, f26.value, f27.value, f28.value, f29.value, f30.value, f31.value, f32.value, f33.value, f34.value, f35.value),
)

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32, T33, T34, T35, T36, R> combineStates(
    scope: CoroutineScope,
    started: SharingStarted,
    f1: StateFlow<T1>,
    f2: StateFlow<T2>,
    f3: StateFlow<T3>,
    f4: StateFlow<T4>,
    f5: StateFlow<T5>,
    f6: StateFlow<T6>,
    f7: StateFlow<T7>,
    f8: StateFlow<T8>,
    f9: StateFlow<T9>,
    f10: StateFlow<T10>,
    f11: StateFlow<T11>,
    f12: StateFlow<T12>,
    f13: StateFlow<T13>,
    f14: StateFlow<T14>,
    f15: StateFlow<T15>,
    f16: StateFlow<T16>,
    f17: StateFlow<T17>,
    f18: StateFlow<T18>,
    f19: StateFlow<T19>,
    f20: StateFlow<T20>,
    f21: StateFlow<T21>,
    f22: StateFlow<T22>,
    f23: StateFlow<T23>,
    f24: StateFlow<T24>,
    f25: StateFlow<T25>,
    f26: StateFlow<T26>,
    f27: StateFlow<T27>,
    f28: StateFlow<T28>,
    f29: StateFlow<T29>,
    f30: StateFlow<T30>,
    f31: StateFlow<T31>,
    f32: StateFlow<T32>,
    f33: StateFlow<T33>,
    f34: StateFlow<T34>,
    f35: StateFlow<T35>,
    f36: StateFlow<T36>,
    mapper: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32, T33, T34, T35, T36) -> R,
): StateFlow<R> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, f22, f23, f24, f25, f26, f27, f28, f29, f30, f31, f32, f33, f34, f35, f36) {
    @Suppress("UNCHECKED_CAST")
    mapper(it[0] as T1, it[1] as T2, it[2] as T3, it[3] as T4, it[4] as T5, it[5] as T6, it[6] as T7, it[7] as T8, it[8] as T9, it[9] as T10, it[10] as T11, it[11] as T12, it[12] as T13, it[13] as T14, it[14] as T15, it[15] as T16, it[16] as T17, it[17] as T18, it[18] as T19, it[19] as T20, it[20] as T21, it[21] as T22, it[22] as T23, it[23] as T24, it[24] as T25, it[25] as T26, it[26] as T27, it[27] as T28, it[28] as T29, it[29] as T30, it[30] as T31, it[31] as T32, it[32] as T33, it[33] as T34, it[34] as T35, it[35] as T36)
}.stateIn(
    scope = scope,
    started = started,
    initialValue = mapper(f1.value, f2.value, f3.value, f4.value, f5.value, f6.value, f7.value, f8.value, f9.value, f10.value, f11.value, f12.value, f13.value, f14.value, f15.value, f16.value, f17.value, f18.value, f19.value, f20.value, f21.value, f22.value, f23.value, f24.value, f25.value, f26.value, f27.value, f28.value, f29.value, f30.value, f31.value, f32.value, f33.value, f34.value, f35.value, f36.value),
)