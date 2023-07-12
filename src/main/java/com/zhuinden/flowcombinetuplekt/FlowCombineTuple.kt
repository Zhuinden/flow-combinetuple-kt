/*
 * Copyright 2020 Gabor Varadi
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
package com.zhuinden.flowcombinetuplekt

import com.zhuinden.tupleskt.*
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.map


fun <T1> combineTuple(f1: Flow<T1>): Flow<Tuple1<T1>> = f1.map(::Tuple1)


fun <T1, T2> combineTuple(f1: Flow<T1>, f2: Flow<T2>): Flow<Pair<T1, T2>> = combine(f1, f2) { t1, t2 -> Pair(t1, t2) }


fun <T1, T2, T3> combineTuple(f1: Flow<T1>, f2: Flow<T2>, f3: Flow<T3>): Flow<Triple<T1, T2, T3>> = combine(f1, f2, f3) { t1, t2, t3 -> Triple<T1, T2, T3>(t1, t2, t3) }


fun <T1, T2, T3, T4> combineTuple(f1: Flow<T1>, f2: Flow<T2>, f3: Flow<T3>, f4: Flow<T4>): Flow<Tuple4<T1, T2, T3, T4>> = combine(f1, f2, f3, f4) { t1, t2, t3, t4 -> Tuple4<T1, T2, T3, T4>(t1, t2, t3, t4) }


fun <T1, T2, T3, T4, T5> combineTuple(f1: Flow<T1>, f2: Flow<T2>, f3: Flow<T3>, f4: Flow<T4>, f5: Flow<T5>): Flow<Tuple5<T1, T2, T3, T4, T5>> = combine(f1, f2, f3, f4, f5) { t1, t2, t3, t4, t5 -> Tuple5<T1, T2, T3, T4, T5>(t1, t2, t3, t4, t5) }


fun <T1, T2, T3, T4, T5, T6> combineTuple(f1: Flow<T1>, f2: Flow<T2>, f3: Flow<T3>, f4: Flow<T4>, f5: Flow<T5>, f6: Flow<T6>): Flow<Tuple6<T1, T2, T3, T4, T5, T6>> = combine(f1, f2, f3, f4, f5, f6) { array: Array<*> ->
    @Suppress("UNCHECKED_CAST")
    Tuple6<T1, T2, T3, T4, T5, T6>(array[0] as T1, array[1] as T2, array[2] as T3, array[3] as T4, array[4] as T5, array[5] as T6)
}


fun <T1, T2, T3, T4, T5, T6, T7> combineTuple(f1: Flow<T1>, f2: Flow<T2>, f3: Flow<T3>, f4: Flow<T4>, f5: Flow<T5>, f6: Flow<T6>, f7: Flow<T7>): Flow<Tuple7<T1, T2, T3, T4, T5, T6, T7>> = combine(f1, f2, f3, f4, f5, f6, f7) { array: Array<*> ->
    @Suppress("UNCHECKED_CAST")
    Tuple7<T1, T2, T3, T4, T5, T6, T7>(array[0] as T1, array[1] as T2, array[2] as T3, array[3] as T4, array[4] as T5, array[5] as T6, array[6] as T7)
}


fun <T1, T2, T3, T4, T5, T6, T7, T8> combineTuple(f1: Flow<T1>, f2: Flow<T2>, f3: Flow<T3>, f4: Flow<T4>, f5: Flow<T5>, f6: Flow<T6>, f7: Flow<T7>, f8: Flow<T8>): Flow<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> = combine(f1, f2, f3, f4, f5, f6, f7, f8) { array: Array<*> ->
    @Suppress("UNCHECKED_CAST")
    Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>(array[0] as T1, array[1] as T2, array[2] as T3, array[3] as T4, array[4] as T5, array[5] as T6, array[6] as T7, array[7] as T8)
}


fun <T1, T2, T3, T4, T5, T6, T7, T8, T9> combineTuple(f1: Flow<T1>, f2: Flow<T2>, f3: Flow<T3>, f4: Flow<T4>, f5: Flow<T5>, f6: Flow<T6>, f7: Flow<T7>, f8: Flow<T8>, f9: Flow<T9>): Flow<Tuple9<T1, T2, T3, T4, T5, T6, T7, T8, T9>> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9) { array: Array<*> ->
    @Suppress("UNCHECKED_CAST")
    Tuple9<T1, T2, T3, T4, T5, T6, T7, T8, T9>(array[0] as T1, array[1] as T2, array[2] as T3, array[3] as T4, array[4] as T5, array[5] as T6, array[6] as T7, array[7] as T8, array[8] as T9)
}


fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> combineTuple(f1: Flow<T1>, f2: Flow<T2>, f3: Flow<T3>, f4: Flow<T4>, f5: Flow<T5>, f6: Flow<T6>, f7: Flow<T7>, f8: Flow<T8>, f9: Flow<T9>, f10: Flow<T10>): Flow<Tuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10) { array: Array<*> ->
    @Suppress("UNCHECKED_CAST")
    Tuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>(array[0] as T1, array[1] as T2, array[2] as T3, array[3] as T4, array[4] as T5, array[5] as T6, array[6] as T7, array[7] as T8, array[8] as T9, array[9] as T10)
}


fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> combineTuple(f1: Flow<T1>, f2: Flow<T2>, f3: Flow<T3>, f4: Flow<T4>, f5: Flow<T5>, f6: Flow<T6>, f7: Flow<T7>, f8: Flow<T8>, f9: Flow<T9>, f10: Flow<T10>, f11: Flow<T11>): Flow<Tuple11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11>> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11) { array: Array<*> ->
    @Suppress("UNCHECKED_CAST")
    Tuple11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11>(array[0] as T1, array[1] as T2, array[2] as T3, array[3] as T4, array[4] as T5, array[5] as T6, array[6] as T7, array[7] as T8, array[8] as T9, array[9] as T10, array[10] as T11)
}


fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> combineTuple(f1: Flow<T1>, f2: Flow<T2>, f3: Flow<T3>, f4: Flow<T4>, f5: Flow<T5>, f6: Flow<T6>, f7: Flow<T7>, f8: Flow<T8>, f9: Flow<T9>, f10: Flow<T10>, f11: Flow<T11>, f12: Flow<T12>): Flow<Tuple12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12>> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12) { array: Array<*> ->
    @Suppress("UNCHECKED_CAST")
    Tuple12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12>(array[0] as T1, array[1] as T2, array[2] as T3, array[3] as T4, array[4] as T5, array[5] as T6, array[6] as T7, array[7] as T8, array[8] as T9, array[9] as T10, array[10] as T11, array[11] as T12)
}


fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> combineTuple(f1: Flow<T1>, f2: Flow<T2>, f3: Flow<T3>, f4: Flow<T4>, f5: Flow<T5>, f6: Flow<T6>, f7: Flow<T7>, f8: Flow<T8>, f9: Flow<T9>, f10: Flow<T10>, f11: Flow<T11>, f12: Flow<T12>, f13: Flow<T13>): Flow<Tuple13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13) { array: Array<*> ->
    @Suppress("UNCHECKED_CAST")
    Tuple13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>(array[0] as T1, array[1] as T2, array[2] as T3, array[3] as T4, array[4] as T5, array[5] as T6, array[6] as T7, array[7] as T8, array[8] as T9, array[9] as T10, array[10] as T11, array[11] as T12, array[12] as T13)
}


fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> combineTuple(f1: Flow<T1>, f2: Flow<T2>, f3: Flow<T3>, f4: Flow<T4>, f5: Flow<T5>, f6: Flow<T6>, f7: Flow<T7>, f8: Flow<T8>, f9: Flow<T9>, f10: Flow<T10>, f11: Flow<T11>, f12: Flow<T12>, f13: Flow<T13>, f14: Flow<T14>): Flow<Tuple14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14>> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14) { array: Array<*> ->
    @Suppress("UNCHECKED_CAST")
    Tuple14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14>(array[0] as T1, array[1] as T2, array[2] as T3, array[3] as T4, array[4] as T5, array[5] as T6, array[6] as T7, array[7] as T8, array[8] as T9, array[9] as T10, array[10] as T11, array[11] as T12, array[12] as T13, array[13] as T14)
}


fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> combineTuple(f1: Flow<T1>, f2: Flow<T2>, f3: Flow<T3>, f4: Flow<T4>, f5: Flow<T5>, f6: Flow<T6>, f7: Flow<T7>, f8: Flow<T8>, f9: Flow<T9>, f10: Flow<T10>, f11: Flow<T11>, f12: Flow<T12>, f13: Flow<T13>, f14: Flow<T14>, f15: Flow<T15>): Flow<Tuple15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15>> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15) { array: Array<*> ->
    @Suppress("UNCHECKED_CAST")
    Tuple15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15>(array[0] as T1, array[1] as T2, array[2] as T3, array[3] as T4, array[4] as T5, array[5] as T6, array[6] as T7, array[7] as T8, array[8] as T9, array[9] as T10, array[10] as T11, array[11] as T12, array[12] as T13, array[13] as T14, array[14] as T15)
}


fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> combineTuple(f1: Flow<T1>, f2: Flow<T2>, f3: Flow<T3>, f4: Flow<T4>, f5: Flow<T5>, f6: Flow<T6>, f7: Flow<T7>, f8: Flow<T8>, f9: Flow<T9>, f10: Flow<T10>, f11: Flow<T11>, f12: Flow<T12>, f13: Flow<T13>, f14: Flow<T14>, f15: Flow<T15>, f16: Flow<T16>): Flow<Tuple16<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16>> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16) { array: Array<*> ->
    @Suppress("UNCHECKED_CAST")
    Tuple16<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16>(array[0] as T1, array[1] as T2, array[2] as T3, array[3] as T4, array[4] as T5, array[5] as T6, array[6] as T7, array[7] as T8, array[8] as T9, array[9] as T10, array[10] as T11, array[11] as T12, array[12] as T13, array[13] as T14, array[14] as T15, array[15] as T16)
}

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> combineTuple(f1: Flow<T1>, f2: Flow<T2>, f3: Flow<T3>, f4: Flow<T4>, f5: Flow<T5>, f6: Flow<T6>, f7: Flow<T7>, f8: Flow<T8>, f9: Flow<T9>, f10: Flow<T10>, f11: Flow<T11>, f12: Flow<T12>, f13: Flow<T13>, f14: Flow<T14>, f15: Flow<T15>, f16: Flow<T16>, f17: Flow<T17>): Flow<Tuple17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17>> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17) { array: Array<*> ->
    @Suppress("UNCHECKED_CAST")
    Tuple17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17>(array[0] as T1, array[1] as T2, array[2] as T3, array[3] as T4, array[4] as T5, array[5] as T6, array[6] as T7, array[7] as T8, array[8] as T9, array[9] as T10, array[10] as T11, array[11] as T12, array[12] as T13, array[13] as T14, array[14] as T15, array[15] as T16, array[16] as T17)
}

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> combineTuple(f1: Flow<T1>, f2: Flow<T2>, f3: Flow<T3>, f4: Flow<T4>, f5: Flow<T5>, f6: Flow<T6>, f7: Flow<T7>, f8: Flow<T8>, f9: Flow<T9>, f10: Flow<T10>, f11: Flow<T11>, f12: Flow<T12>, f13: Flow<T13>, f14: Flow<T14>, f15: Flow<T15>, f16: Flow<T16>, f17: Flow<T17>, f18: Flow<T18>): Flow<Tuple18<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18>> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18) { array: Array<*> ->
    @Suppress("UNCHECKED_CAST")
    Tuple18<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18>(array[0] as T1, array[1] as T2, array[2] as T3, array[3] as T4, array[4] as T5, array[5] as T6, array[6] as T7, array[7] as T8, array[8] as T9, array[9] as T10, array[10] as T11, array[11] as T12, array[12] as T13, array[13] as T14, array[14] as T15, array[15] as T16, array[16] as T17, array[17] as T18)
}

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> combineTuple(f1: Flow<T1>, f2: Flow<T2>, f3: Flow<T3>, f4: Flow<T4>, f5: Flow<T5>, f6: Flow<T6>, f7: Flow<T7>, f8: Flow<T8>, f9: Flow<T9>, f10: Flow<T10>, f11: Flow<T11>, f12: Flow<T12>, f13: Flow<T13>, f14: Flow<T14>, f15: Flow<T15>, f16: Flow<T16>, f17: Flow<T17>, f18: Flow<T18>, f19: Flow<T19>): Flow<Tuple19<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19>> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19) { array: Array<*> ->
    @Suppress("UNCHECKED_CAST")
    Tuple19<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19>(array[0] as T1, array[1] as T2, array[2] as T3, array[3] as T4, array[4] as T5, array[5] as T6, array[6] as T7, array[7] as T8, array[8] as T9, array[9] as T10, array[10] as T11, array[11] as T12, array[12] as T13, array[13] as T14, array[14] as T15, array[15] as T16, array[16] as T17, array[17] as T18, array[18] as T19)
}

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> combineTuple(f1: Flow<T1>, f2: Flow<T2>, f3: Flow<T3>, f4: Flow<T4>, f5: Flow<T5>, f6: Flow<T6>, f7: Flow<T7>, f8: Flow<T8>, f9: Flow<T9>, f10: Flow<T10>, f11: Flow<T11>, f12: Flow<T12>, f13: Flow<T13>, f14: Flow<T14>, f15: Flow<T15>, f16: Flow<T16>, f17: Flow<T17>, f18: Flow<T18>, f19: Flow<T19>, f20: Flow<T20>): Flow<Tuple20<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20>> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20) { array: Array<*> ->
    @Suppress("UNCHECKED_CAST")
    Tuple20<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20>(array[0] as T1, array[1] as T2, array[2] as T3, array[3] as T4, array[4] as T5, array[5] as T6, array[6] as T7, array[7] as T8, array[8] as T9, array[9] as T10, array[10] as T11, array[11] as T12, array[12] as T13, array[13] as T14, array[14] as T15, array[15] as T16, array[16] as T17, array[17] as T18, array[18] as T19, array[19] as T20)
}

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> combineTuple(f1: Flow<T1>, f2: Flow<T2>, f3: Flow<T3>, f4: Flow<T4>, f5: Flow<T5>, f6: Flow<T6>, f7: Flow<T7>, f8: Flow<T8>, f9: Flow<T9>, f10: Flow<T10>, f11: Flow<T11>, f12: Flow<T12>, f13: Flow<T13>, f14: Flow<T14>, f15: Flow<T15>, f16: Flow<T16>, f17: Flow<T17>, f18: Flow<T18>, f19: Flow<T19>, f20: Flow<T20>, f21: Flow<T21>): Flow<Tuple21<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21>> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21) { array: Array<*> ->
    @Suppress("UNCHECKED_CAST")
    Tuple21<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21>(array[0] as T1, array[1] as T2, array[2] as T3, array[3] as T4, array[4] as T5, array[5] as T6, array[6] as T7, array[7] as T8, array[8] as T9, array[9] as T10, array[10] as T11, array[11] as T12, array[12] as T13, array[13] as T14, array[14] as T15, array[15] as T16, array[16] as T17, array[17] as T18, array[18] as T19, array[19] as T20, array[20] as T21)
}

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> combineTuple(f1: Flow<T1>, f2: Flow<T2>, f3: Flow<T3>, f4: Flow<T4>, f5: Flow<T5>, f6: Flow<T6>, f7: Flow<T7>, f8: Flow<T8>, f9: Flow<T9>, f10: Flow<T10>, f11: Flow<T11>, f12: Flow<T12>, f13: Flow<T13>, f14: Flow<T14>, f15: Flow<T15>, f16: Flow<T16>, f17: Flow<T17>, f18: Flow<T18>, f19: Flow<T19>, f20: Flow<T20>, f21: Flow<T21>, f22: Flow<T22>): Flow<Tuple22<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22>> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, f22) { array: Array<*> ->
    @Suppress("UNCHECKED_CAST")
    Tuple22<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22>(array[0] as T1, array[1] as T2, array[2] as T3, array[3] as T4, array[4] as T5, array[5] as T6, array[6] as T7, array[7] as T8, array[8] as T9, array[9] as T10, array[10] as T11, array[11] as T12, array[12] as T13, array[13] as T14, array[14] as T15, array[15] as T16, array[16] as T17, array[17] as T18, array[18] as T19, array[19] as T20, array[20] as T21, array[21] as T22)
}

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> combineTuple(f1: Flow<T1>, f2: Flow<T2>, f3: Flow<T3>, f4: Flow<T4>, f5: Flow<T5>, f6: Flow<T6>, f7: Flow<T7>, f8: Flow<T8>, f9: Flow<T9>, f10: Flow<T10>, f11: Flow<T11>, f12: Flow<T12>, f13: Flow<T13>, f14: Flow<T14>, f15: Flow<T15>, f16: Flow<T16>, f17: Flow<T17>, f18: Flow<T18>, f19: Flow<T19>, f20: Flow<T20>, f21: Flow<T21>, f22: Flow<T22>, f23: Flow<T23>): Flow<Tuple23<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23>> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, f22, f23) { array: Array<*> ->
    @Suppress("UNCHECKED_CAST")
    Tuple23<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23>(array[0] as T1, array[1] as T2, array[2] as T3, array[3] as T4, array[4] as T5, array[5] as T6, array[6] as T7, array[7] as T8, array[8] as T9, array[9] as T10, array[10] as T11, array[11] as T12, array[12] as T13, array[13] as T14, array[14] as T15, array[15] as T16, array[16] as T17, array[17] as T18, array[18] as T19, array[19] as T20, array[20] as T21, array[21] as T22, array[22] as T23)
}

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> combineTuple(f1: Flow<T1>, f2: Flow<T2>, f3: Flow<T3>, f4: Flow<T4>, f5: Flow<T5>, f6: Flow<T6>, f7: Flow<T7>, f8: Flow<T8>, f9: Flow<T9>, f10: Flow<T10>, f11: Flow<T11>, f12: Flow<T12>, f13: Flow<T13>, f14: Flow<T14>, f15: Flow<T15>, f16: Flow<T16>, f17: Flow<T17>, f18: Flow<T18>, f19: Flow<T19>, f20: Flow<T20>, f21: Flow<T21>, f22: Flow<T22>, f23: Flow<T23>, f24: Flow<T24>): Flow<Tuple24<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24>> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, f22, f23, f24) { array: Array<*> ->
    @Suppress("UNCHECKED_CAST")
    Tuple24<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24>(array[0] as T1, array[1] as T2, array[2] as T3, array[3] as T4, array[4] as T5, array[5] as T6, array[6] as T7, array[7] as T8, array[8] as T9, array[9] as T10, array[10] as T11, array[11] as T12, array[12] as T13, array[13] as T14, array[14] as T15, array[15] as T16, array[16] as T17, array[17] as T18, array[18] as T19, array[19] as T20, array[20] as T21, array[21] as T22, array[22] as T23, array[23] as T24)
}

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> combineTuple(f1: Flow<T1>, f2: Flow<T2>, f3: Flow<T3>, f4: Flow<T4>, f5: Flow<T5>, f6: Flow<T6>, f7: Flow<T7>, f8: Flow<T8>, f9: Flow<T9>, f10: Flow<T10>, f11: Flow<T11>, f12: Flow<T12>, f13: Flow<T13>, f14: Flow<T14>, f15: Flow<T15>, f16: Flow<T16>, f17: Flow<T17>, f18: Flow<T18>, f19: Flow<T19>, f20: Flow<T20>, f21: Flow<T21>, f22: Flow<T22>, f23: Flow<T23>, f24: Flow<T24>, f25: Flow<T25>): Flow<Tuple25<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25>> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, f22, f23, f24, f25) { array: Array<*> ->
    @Suppress("UNCHECKED_CAST")
    Tuple25<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25>(array[0] as T1, array[1] as T2, array[2] as T3, array[3] as T4, array[4] as T5, array[5] as T6, array[6] as T7, array[7] as T8, array[8] as T9, array[9] as T10, array[10] as T11, array[11] as T12, array[12] as T13, array[13] as T14, array[14] as T15, array[15] as T16, array[16] as T17, array[17] as T18, array[18] as T19, array[19] as T20, array[20] as T21, array[21] as T22, array[22] as T23, array[23] as T24, array[24] as T25)
}

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> combineTuple(f1: Flow<T1>, f2: Flow<T2>, f3: Flow<T3>, f4: Flow<T4>, f5: Flow<T5>, f6: Flow<T6>, f7: Flow<T7>, f8: Flow<T8>, f9: Flow<T9>, f10: Flow<T10>, f11: Flow<T11>, f12: Flow<T12>, f13: Flow<T13>, f14: Flow<T14>, f15: Flow<T15>, f16: Flow<T16>, f17: Flow<T17>, f18: Flow<T18>, f19: Flow<T19>, f20: Flow<T20>, f21: Flow<T21>, f22: Flow<T22>, f23: Flow<T23>, f24: Flow<T24>, f25: Flow<T25>, f26: Flow<T26>): Flow<Tuple26<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26>> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, f22, f23, f24, f25, f26) { array: Array<*> ->
    @Suppress("UNCHECKED_CAST")
    Tuple26<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26>(array[0] as T1, array[1] as T2, array[2] as T3, array[3] as T4, array[4] as T5, array[5] as T6, array[6] as T7, array[7] as T8, array[8] as T9, array[9] as T10, array[10] as T11, array[11] as T12, array[12] as T13, array[13] as T14, array[14] as T15, array[15] as T16, array[16] as T17, array[17] as T18, array[18] as T19, array[19] as T20, array[20] as T21, array[21] as T22, array[22] as T23, array[23] as T24, array[24] as T25, array[25] as T26)
}

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> combineTuple(f1: Flow<T1>, f2: Flow<T2>, f3: Flow<T3>, f4: Flow<T4>, f5: Flow<T5>, f6: Flow<T6>, f7: Flow<T7>, f8: Flow<T8>, f9: Flow<T9>, f10: Flow<T10>, f11: Flow<T11>, f12: Flow<T12>, f13: Flow<T13>, f14: Flow<T14>, f15: Flow<T15>, f16: Flow<T16>, f17: Flow<T17>, f18: Flow<T18>, f19: Flow<T19>, f20: Flow<T20>, f21: Flow<T21>, f22: Flow<T22>, f23: Flow<T23>, f24: Flow<T24>, f25: Flow<T25>, f26: Flow<T26>, f27: Flow<T27>): Flow<Tuple27<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27>> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, f22, f23, f24, f25, f26, f27) { array: Array<*> ->
    @Suppress("UNCHECKED_CAST")
    Tuple27<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27>(array[0] as T1, array[1] as T2, array[2] as T3, array[3] as T4, array[4] as T5, array[5] as T6, array[6] as T7, array[7] as T8, array[8] as T9, array[9] as T10, array[10] as T11, array[11] as T12, array[12] as T13, array[13] as T14, array[14] as T15, array[15] as T16, array[16] as T17, array[17] as T18, array[18] as T19, array[19] as T20, array[20] as T21, array[21] as T22, array[22] as T23, array[23] as T24, array[24] as T25, array[25] as T26, array[26] as T27)
}

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> combineTuple(f1: Flow<T1>, f2: Flow<T2>, f3: Flow<T3>, f4: Flow<T4>, f5: Flow<T5>, f6: Flow<T6>, f7: Flow<T7>, f8: Flow<T8>, f9: Flow<T9>, f10: Flow<T10>, f11: Flow<T11>, f12: Flow<T12>, f13: Flow<T13>, f14: Flow<T14>, f15: Flow<T15>, f16: Flow<T16>, f17: Flow<T17>, f18: Flow<T18>, f19: Flow<T19>, f20: Flow<T20>, f21: Flow<T21>, f22: Flow<T22>, f23: Flow<T23>, f24: Flow<T24>, f25: Flow<T25>, f26: Flow<T26>, f27: Flow<T27>, f28: Flow<T28>): Flow<Tuple28<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28>> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, f22, f23, f24, f25, f26, f27, f28) { array: Array<*> ->
    @Suppress("UNCHECKED_CAST")
    Tuple28<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28>(array[0] as T1, array[1] as T2, array[2] as T3, array[3] as T4, array[4] as T5, array[5] as T6, array[6] as T7, array[7] as T8, array[8] as T9, array[9] as T10, array[10] as T11, array[11] as T12, array[12] as T13, array[13] as T14, array[14] as T15, array[15] as T16, array[16] as T17, array[17] as T18, array[18] as T19, array[19] as T20, array[20] as T21, array[21] as T22, array[22] as T23, array[23] as T24, array[24] as T25, array[25] as T26, array[26] as T27, array[27] as T28)
}

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> combineTuple(f1: Flow<T1>, f2: Flow<T2>, f3: Flow<T3>, f4: Flow<T4>, f5: Flow<T5>, f6: Flow<T6>, f7: Flow<T7>, f8: Flow<T8>, f9: Flow<T9>, f10: Flow<T10>, f11: Flow<T11>, f12: Flow<T12>, f13: Flow<T13>, f14: Flow<T14>, f15: Flow<T15>, f16: Flow<T16>, f17: Flow<T17>, f18: Flow<T18>, f19: Flow<T19>, f20: Flow<T20>, f21: Flow<T21>, f22: Flow<T22>, f23: Flow<T23>, f24: Flow<T24>, f25: Flow<T25>, f26: Flow<T26>, f27: Flow<T27>, f28: Flow<T28>, f29: Flow<T29>): Flow<Tuple29<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29>> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, f22, f23, f24, f25, f26, f27, f28, f29) { array: Array<*> ->
    @Suppress("UNCHECKED_CAST")
    Tuple29<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29>(array[0] as T1, array[1] as T2, array[2] as T3, array[3] as T4, array[4] as T5, array[5] as T6, array[6] as T7, array[7] as T8, array[8] as T9, array[9] as T10, array[10] as T11, array[11] as T12, array[12] as T13, array[13] as T14, array[14] as T15, array[15] as T16, array[16] as T17, array[17] as T18, array[18] as T19, array[19] as T20, array[20] as T21, array[21] as T22, array[22] as T23, array[23] as T24, array[24] as T25, array[25] as T26, array[26] as T27, array[27] as T28, array[28] as T29)
}

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> combineTuple(f1: Flow<T1>, f2: Flow<T2>, f3: Flow<T3>, f4: Flow<T4>, f5: Flow<T5>, f6: Flow<T6>, f7: Flow<T7>, f8: Flow<T8>, f9: Flow<T9>, f10: Flow<T10>, f11: Flow<T11>, f12: Flow<T12>, f13: Flow<T13>, f14: Flow<T14>, f15: Flow<T15>, f16: Flow<T16>, f17: Flow<T17>, f18: Flow<T18>, f19: Flow<T19>, f20: Flow<T20>, f21: Flow<T21>, f22: Flow<T22>, f23: Flow<T23>, f24: Flow<T24>, f25: Flow<T25>, f26: Flow<T26>, f27: Flow<T27>, f28: Flow<T28>, f29: Flow<T29>, f30: Flow<T30>): Flow<Tuple30<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30>> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, f22, f23, f24, f25, f26, f27, f28, f29, f30) { array: Array<*> ->
    @Suppress("UNCHECKED_CAST")
    Tuple30<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30>(array[0] as T1, array[1] as T2, array[2] as T3, array[3] as T4, array[4] as T5, array[5] as T6, array[6] as T7, array[7] as T8, array[8] as T9, array[9] as T10, array[10] as T11, array[11] as T12, array[12] as T13, array[13] as T14, array[14] as T15, array[15] as T16, array[16] as T17, array[17] as T18, array[18] as T19, array[19] as T20, array[20] as T21, array[21] as T22, array[22] as T23, array[23] as T24, array[24] as T25, array[25] as T26, array[26] as T27, array[27] as T28, array[28] as T29, array[29] as T30)
}

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> combineTuple(f1: Flow<T1>, f2: Flow<T2>, f3: Flow<T3>, f4: Flow<T4>, f5: Flow<T5>, f6: Flow<T6>, f7: Flow<T7>, f8: Flow<T8>, f9: Flow<T9>, f10: Flow<T10>, f11: Flow<T11>, f12: Flow<T12>, f13: Flow<T13>, f14: Flow<T14>, f15: Flow<T15>, f16: Flow<T16>, f17: Flow<T17>, f18: Flow<T18>, f19: Flow<T19>, f20: Flow<T20>, f21: Flow<T21>, f22: Flow<T22>, f23: Flow<T23>, f24: Flow<T24>, f25: Flow<T25>, f26: Flow<T26>, f27: Flow<T27>, f28: Flow<T28>, f29: Flow<T29>, f30: Flow<T30>, f31: Flow<T31>): Flow<Tuple31<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31>> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, f22, f23, f24, f25, f26, f27, f28, f29, f30, f31) { array: Array<*> ->
    @Suppress("UNCHECKED_CAST")
    Tuple31<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31>(array[0] as T1, array[1] as T2, array[2] as T3, array[3] as T4, array[4] as T5, array[5] as T6, array[6] as T7, array[7] as T8, array[8] as T9, array[9] as T10, array[10] as T11, array[11] as T12, array[12] as T13, array[13] as T14, array[14] as T15, array[15] as T16, array[16] as T17, array[17] as T18, array[18] as T19, array[19] as T20, array[20] as T21, array[21] as T22, array[22] as T23, array[23] as T24, array[24] as T25, array[25] as T26, array[26] as T27, array[27] as T28, array[28] as T29, array[29] as T30, array[30] as T31)
}

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> combineTuple(f1: Flow<T1>, f2: Flow<T2>, f3: Flow<T3>, f4: Flow<T4>, f5: Flow<T5>, f6: Flow<T6>, f7: Flow<T7>, f8: Flow<T8>, f9: Flow<T9>, f10: Flow<T10>, f11: Flow<T11>, f12: Flow<T12>, f13: Flow<T13>, f14: Flow<T14>, f15: Flow<T15>, f16: Flow<T16>, f17: Flow<T17>, f18: Flow<T18>, f19: Flow<T19>, f20: Flow<T20>, f21: Flow<T21>, f22: Flow<T22>, f23: Flow<T23>, f24: Flow<T24>, f25: Flow<T25>, f26: Flow<T26>, f27: Flow<T27>, f28: Flow<T28>, f29: Flow<T29>, f30: Flow<T30>, f31: Flow<T31>, f32: Flow<T32>): Flow<Tuple32<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32>> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, f22, f23, f24, f25, f26, f27, f28, f29, f30, f31, f32) { array: Array<*> ->
    @Suppress("UNCHECKED_CAST")
    Tuple32<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32>(array[0] as T1, array[1] as T2, array[2] as T3, array[3] as T4, array[4] as T5, array[5] as T6, array[6] as T7, array[7] as T8, array[8] as T9, array[9] as T10, array[10] as T11, array[11] as T12, array[12] as T13, array[13] as T14, array[14] as T15, array[15] as T16, array[16] as T17, array[17] as T18, array[18] as T19, array[19] as T20, array[20] as T21, array[21] as T22, array[22] as T23, array[23] as T24, array[24] as T25, array[25] as T26, array[26] as T27, array[27] as T28, array[28] as T29, array[29] as T30, array[30] as T31, array[31] as T32)
}

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32, T33> combineTuple(f1: Flow<T1>, f2: Flow<T2>, f3: Flow<T3>, f4: Flow<T4>, f5: Flow<T5>, f6: Flow<T6>, f7: Flow<T7>, f8: Flow<T8>, f9: Flow<T9>, f10: Flow<T10>, f11: Flow<T11>, f12: Flow<T12>, f13: Flow<T13>, f14: Flow<T14>, f15: Flow<T15>, f16: Flow<T16>, f17: Flow<T17>, f18: Flow<T18>, f19: Flow<T19>, f20: Flow<T20>, f21: Flow<T21>, f22: Flow<T22>, f23: Flow<T23>, f24: Flow<T24>, f25: Flow<T25>, f26: Flow<T26>, f27: Flow<T27>, f28: Flow<T28>, f29: Flow<T29>, f30: Flow<T30>, f31: Flow<T31>, f32: Flow<T32>, f33: Flow<T33>): Flow<Tuple33<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32, T33>> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, f22, f23, f24, f25, f26, f27, f28, f29, f30, f31, f32, f33) { array: Array<*> ->
    @Suppress("UNCHECKED_CAST")
    Tuple33<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32, T33>(array[0] as T1, array[1] as T2, array[2] as T3, array[3] as T4, array[4] as T5, array[5] as T6, array[6] as T7, array[7] as T8, array[8] as T9, array[9] as T10, array[10] as T11, array[11] as T12, array[12] as T13, array[13] as T14, array[14] as T15, array[15] as T16, array[16] as T17, array[17] as T18, array[18] as T19, array[19] as T20, array[20] as T21, array[21] as T22, array[22] as T23, array[23] as T24, array[24] as T25, array[25] as T26, array[26] as T27, array[27] as T28, array[28] as T29, array[29] as T30, array[30] as T31, array[31] as T32, array[32] as T33)
}

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32, T33, T34> combineTuple(f1: Flow<T1>, f2: Flow<T2>, f3: Flow<T3>, f4: Flow<T4>, f5: Flow<T5>, f6: Flow<T6>, f7: Flow<T7>, f8: Flow<T8>, f9: Flow<T9>, f10: Flow<T10>, f11: Flow<T11>, f12: Flow<T12>, f13: Flow<T13>, f14: Flow<T14>, f15: Flow<T15>, f16: Flow<T16>, f17: Flow<T17>, f18: Flow<T18>, f19: Flow<T19>, f20: Flow<T20>, f21: Flow<T21>, f22: Flow<T22>, f23: Flow<T23>, f24: Flow<T24>, f25: Flow<T25>, f26: Flow<T26>, f27: Flow<T27>, f28: Flow<T28>, f29: Flow<T29>, f30: Flow<T30>, f31: Flow<T31>, f32: Flow<T32>, f33: Flow<T33>, f34: Flow<T34>): Flow<Tuple34<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32, T33, T34>> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, f22, f23, f24, f25, f26, f27, f28, f29, f30, f31, f32, f33, f34) { array: Array<*> ->
    @Suppress("UNCHECKED_CAST")
    Tuple34<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32, T33, T34>(array[0] as T1, array[1] as T2, array[2] as T3, array[3] as T4, array[4] as T5, array[5] as T6, array[6] as T7, array[7] as T8, array[8] as T9, array[9] as T10, array[10] as T11, array[11] as T12, array[12] as T13, array[13] as T14, array[14] as T15, array[15] as T16, array[16] as T17, array[17] as T18, array[18] as T19, array[19] as T20, array[20] as T21, array[21] as T22, array[22] as T23, array[23] as T24, array[24] as T25, array[25] as T26, array[26] as T27, array[27] as T28, array[28] as T29, array[29] as T30, array[30] as T31, array[31] as T32, array[32] as T33, array[33] as T34)
}

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32, T33, T34, T35> combineTuple(f1: Flow<T1>, f2: Flow<T2>, f3: Flow<T3>, f4: Flow<T4>, f5: Flow<T5>, f6: Flow<T6>, f7: Flow<T7>, f8: Flow<T8>, f9: Flow<T9>, f10: Flow<T10>, f11: Flow<T11>, f12: Flow<T12>, f13: Flow<T13>, f14: Flow<T14>, f15: Flow<T15>, f16: Flow<T16>, f17: Flow<T17>, f18: Flow<T18>, f19: Flow<T19>, f20: Flow<T20>, f21: Flow<T21>, f22: Flow<T22>, f23: Flow<T23>, f24: Flow<T24>, f25: Flow<T25>, f26: Flow<T26>, f27: Flow<T27>, f28: Flow<T28>, f29: Flow<T29>, f30: Flow<T30>, f31: Flow<T31>, f32: Flow<T32>, f33: Flow<T33>, f34: Flow<T34>, f35: Flow<T35>): Flow<Tuple35<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32, T33, T34, T35>> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, f22, f23, f24, f25, f26, f27, f28, f29, f30, f31, f32, f33, f34, f35) { array: Array<*> ->
    @Suppress("UNCHECKED_CAST")
    Tuple35<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32, T33, T34, T35>(array[0] as T1, array[1] as T2, array[2] as T3, array[3] as T4, array[4] as T5, array[5] as T6, array[6] as T7, array[7] as T8, array[8] as T9, array[9] as T10, array[10] as T11, array[11] as T12, array[12] as T13, array[13] as T14, array[14] as T15, array[15] as T16, array[16] as T17, array[17] as T18, array[18] as T19, array[19] as T20, array[20] as T21, array[21] as T22, array[22] as T23, array[23] as T24, array[24] as T25, array[25] as T26, array[26] as T27, array[27] as T28, array[28] as T29, array[29] as T30, array[30] as T31, array[31] as T32, array[32] as T33, array[33] as T34, array[34] as T35)
}

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32, T33, T34, T35, T36> combineTuple(f1: Flow<T1>, f2: Flow<T2>, f3: Flow<T3>, f4: Flow<T4>, f5: Flow<T5>, f6: Flow<T6>, f7: Flow<T7>, f8: Flow<T8>, f9: Flow<T9>, f10: Flow<T10>, f11: Flow<T11>, f12: Flow<T12>, f13: Flow<T13>, f14: Flow<T14>, f15: Flow<T15>, f16: Flow<T16>, f17: Flow<T17>, f18: Flow<T18>, f19: Flow<T19>, f20: Flow<T20>, f21: Flow<T21>, f22: Flow<T22>, f23: Flow<T23>, f24: Flow<T24>, f25: Flow<T25>, f26: Flow<T26>, f27: Flow<T27>, f28: Flow<T28>, f29: Flow<T29>, f30: Flow<T30>, f31: Flow<T31>, f32: Flow<T32>, f33: Flow<T33>, f34: Flow<T34>, f35: Flow<T35>, f36: Flow<T36>): Flow<Tuple36<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32, T33, T34, T35, T36>> = combine(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, f22, f23, f24, f25, f26, f27, f28, f29, f30, f31, f32, f33, f34, f35, f36) { array: Array<*> ->
    @Suppress("UNCHECKED_CAST")
    Tuple36<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32, T33, T34, T35, T36>(array[0] as T1, array[1] as T2, array[2] as T3, array[3] as T4, array[4] as T5, array[5] as T6, array[6] as T7, array[7] as T8, array[8] as T9, array[9] as T10, array[10] as T11, array[11] as T12, array[12] as T13, array[13] as T14, array[14] as T15, array[15] as T16, array[16] as T17, array[17] as T18, array[18] as T19, array[19] as T20, array[20] as T21, array[21] as T22, array[22] as T23, array[23] as T24, array[24] as T25, array[25] as T26, array[26] as T27, array[27] as T28, array[28] as T29, array[29] as T30, array[30] as T31, array[31] as T32, array[32] as T33, array[33] as T34, array[34] as T35, array[35] as T36)
}