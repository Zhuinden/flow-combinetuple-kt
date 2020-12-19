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