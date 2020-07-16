package com.zhuinden.flowcombinetuplekt

import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow

import kotlinx.coroutines.runBlocking
import org.junit.Test


import org.assertj.core.api.Assertions.assertThat


class BasicTest {
    data class A(private val blah: String = "")
    data class B(private val blah: String = "")
    data class C(private val blah: String = "")
    data class D(private val blah: String = "")
    data class E(private val blah: String = "")
    data class F(private val blah: String = "")
    data class G(private val blah: String = "")
    data class H(private val blah: String = "")
    data class I(private val blah: String = "")
    data class J(private val blah: String = "")
    data class K(private val blah: String = "")
    data class L(private val blah: String = "")
    data class M(private val blah: String = "")
    data class N(private val blah: String = "")
    data class O(private val blah: String = "")
    data class P(private val blah: String = "")

    @ExperimentalCoroutinesApi
    @Test
    fun checkPair() {
        val a1 = A("a1")
        val a2 = A("a2")
        val b1 = B("b1")
        val b2 = B("b2")

        val flow1 = flow<A> {
            emit(a1)
            emit(a2)
        }
        val flow2 = flow<B> {
            emit(b1)
            emit(b2)
        }

        val setA = linkedSetOf<A>()
        val setB = linkedSetOf<B>()

        GlobalScope.run {
            runBlocking {
                combineTuple(flow1, flow2)
                    .collect { (a, b) ->
                        setA.add(a)
                        setB.add(b)
                    }
            }
        }

        assertThat(setA).containsExactly(a1, a2)
        assertThat(setB).containsExactly(b1, b2)
    }

    @ExperimentalCoroutinesApi
    @Test
    fun checkTriple() {
        val a1 = A("a1")
        val a2 = A("a2")
        val b1 = B("b1")
        val b2 = B("b2")
        val c1 = C("c1")
        val c2 = C("c2")
        
        val flow1 = flow<A> {
            emit(a1)
            emit(a2)
        }
        val flow2 = flow<B> {
            emit(b1)
            emit(b2)
        }
        val flow3 = flow<C> {
            emit(c1)
            emit(c2)
        }

        val setA = linkedSetOf<A>()
        val setB = linkedSetOf<B>()
        val setC = linkedSetOf<C>()

        GlobalScope.run {
            runBlocking {
                combineTuple(flow1, flow2, flow3)
                    .collect { (a, b, c) ->
                        setA.add(a)
                        setB.add(b)
                        setC.add(c)
                    }
            }
        }

        assertThat(setA).containsExactly(a1, a2)
        assertThat(setB).containsExactly(b1, b2)
        assertThat(setC).containsExactly(c1, c2)
    }

    @ExperimentalCoroutinesApi
    @Test
    fun checkTuple4() {
        val a1 = A("a1")
        val a2 = A("a2")
        val b1 = B("b1")
        val b2 = B("b2")
        val c1 = C("c1")
        val c2 = C("c2")
        val d1 = D("d1")
        val d2 = D("d2")

        val flow1 = flow<A> {
            emit(a1)
            emit(a2)
        }
        val flow2 = flow<B> {
            emit(b1)
            emit(b2)
        }
        val flow3 = flow<C> {
            emit(c1)
            emit(c2)
        }
        val flow4 = flow<D> {
            emit(d1)
            emit(d2)
        }


        val setA = linkedSetOf<A>()
        val setB = linkedSetOf<B>()
        val setC = linkedSetOf<C>()
        val setD = linkedSetOf<D>()

        GlobalScope.run {
            runBlocking {
                combineTuple(flow1, flow2, flow3, flow4)
                    .collect { (a, b, c, d) ->
                        setA.add(a)
                        setB.add(b)
                        setC.add(c)
                        setD.add(d)
                    }
            }
        }

        assertThat(setA).containsExactly(a1, a2)
        assertThat(setB).containsExactly(b1, b2)
        assertThat(setC).containsExactly(c1, c2)
        assertThat(setD).containsExactly(d1, d2)
    }

    @ExperimentalCoroutinesApi
    @Test
    fun checkTuple5() {
        val a1 = A("a1")
        val a2 = A("a2")
        val b1 = B("b1")
        val b2 = B("b2")
        val c1 = C("c1")
        val c2 = C("c2")
        val d1 = D("d1")
        val d2 = D("d2")
        val e1 = E("e1")
        val e2 = E("e2")

        val flow1 = flow<A> {
            emit(a1)
            emit(a2)
        }
        val flow2 = flow<B> {
            emit(b1)
            emit(b2)
        }
        val flow3 = flow<C> {
            emit(c1)
            emit(c2)
        }
        val flow4 = flow<D> {
            emit(d1)
            emit(d2)
        }
        val flow5 = flow<E> {
            emit(e1)
            emit(e2)
        }


        val setA = linkedSetOf<A>()
        val setB = linkedSetOf<B>()
        val setC = linkedSetOf<C>()
        val setD = linkedSetOf<D>()
        val setE = linkedSetOf<E>()

        GlobalScope.run {
            runBlocking {
                combineTuple(flow1, flow2, flow3, flow4, flow5)
                    .collect { (a, b, c, d, e) ->
                        setA.add(a)
                        setB.add(b)
                        setC.add(c)
                        setD.add(d)
                        setE.add(e)
                    }
            }
        }

        assertThat(setA).containsExactly(a1, a2)
        assertThat(setB).containsExactly(b1, b2)
        assertThat(setC).containsExactly(c1, c2)
        assertThat(setD).containsExactly(d1, d2)
        assertThat(setE).containsExactly(e1, e2)
    }

    @ExperimentalCoroutinesApi
    @Test
    fun checkTuple6() {
        val a1 = A("a1")
        val a2 = A("a2")
        val b1 = B("b1")
        val b2 = B("b2")
        val c1 = C("c1")
        val c2 = C("c2")
        val d1 = D("d1")
        val d2 = D("d2")
        val e1 = E("e1")
        val e2 = E("e2")
        val f1 = F("f1")
        val f2 = F("f2")

        val flow1 = flow<A> {
            emit(a1)
            emit(a2)
        }
        val flow2 = flow<B> {
            emit(b1)
            emit(b2)
        }
        val flow3 = flow<C> {
            emit(c1)
            emit(c2)
        }
        val flow4 = flow<D> {
            emit(d1)
            emit(d2)
        }
        val flow5 = flow<E> {
            emit(e1)
            emit(e2)
        }
        val flow6 = flow<F> {
            emit(f1)
            emit(f2)
        }


        val setA = linkedSetOf<A>()
        val setB = linkedSetOf<B>()
        val setC = linkedSetOf<C>()
        val setD = linkedSetOf<D>()
        val setE = linkedSetOf<E>()
        val setF = linkedSetOf<F>()

        GlobalScope.run {
            runBlocking {
                combineTuple(flow1, flow2, flow3, flow4, flow5, flow6)
                    .collect { (a, b, c, d, e, f) ->
                        setA.add(a)
                        setB.add(b)
                        setC.add(c)
                        setD.add(d)
                        setE.add(e)
                        setF.add(f)
                    }
            }
        }

        assertThat(setA).containsExactly(a1, a2)
        assertThat(setB).containsExactly(b1, b2)
        assertThat(setC).containsExactly(c1, c2)
        assertThat(setD).containsExactly(d1, d2)
        assertThat(setE).containsExactly(e1, e2)
        assertThat(setF).containsExactly(f1, f2)
    }

    @ExperimentalCoroutinesApi
    @Test
    fun checkTuple7() {
        val a1 = A("a1")
        val a2 = A("a2")
        val b1 = B("b1")
        val b2 = B("b2")
        val c1 = C("c1")
        val c2 = C("c2")
        val d1 = D("d1")
        val d2 = D("d2")
        val e1 = E("e1")
        val e2 = E("e2")
        val f1 = F("f1")
        val f2 = F("f2")
        val g1 = G("g1")
        val g2 = G("g2")

        val flow1 = flow<A> {
            emit(a1)
            emit(a2)
        }
        val flow2 = flow<B> {
            emit(b1)
            emit(b2)
        }
        val flow3 = flow<C> {
            emit(c1)
            emit(c2)
        }
        val flow4 = flow<D> {
            emit(d1)
            emit(d2)
        }
        val flow5 = flow<E> {
            emit(e1)
            emit(e2)
        }
        val flow6 = flow<F> {
            emit(f1)
            emit(f2)
        }
        val flow7 = flow<G> {
            emit(g1)
            emit(g2)
        }


        val setA = linkedSetOf<A>()
        val setB = linkedSetOf<B>()
        val setC = linkedSetOf<C>()
        val setD = linkedSetOf<D>()
        val setE = linkedSetOf<E>()
        val setF = linkedSetOf<F>()
        val setG = linkedSetOf<G>()

        GlobalScope.run {
            runBlocking {
                combineTuple(flow1, flow2, flow3, flow4, flow5, flow6, flow7)
                    .collect { (a, b, c, d, e, f, g) ->
                        setA.add(a)
                        setB.add(b)
                        setC.add(c)
                        setD.add(d)
                        setE.add(e)
                        setF.add(f)
                        setG.add(g)
                    }
            }
        }

        assertThat(setA).containsExactly(a1, a2)
        assertThat(setB).containsExactly(b1, b2)
        assertThat(setC).containsExactly(c1, c2)
        assertThat(setD).containsExactly(d1, d2)
        assertThat(setE).containsExactly(e1, e2)
        assertThat(setF).containsExactly(f1, f2)
        assertThat(setG).containsExactly(g1, g2)
    }

    @ExperimentalCoroutinesApi
    @Test
    fun checkTuple8() {
        val a1 = A("a1")
        val a2 = A("a2")
        val b1 = B("b1")
        val b2 = B("b2")
        val c1 = C("c1")
        val c2 = C("c2")
        val d1 = D("d1")
        val d2 = D("d2")
        val e1 = E("e1")
        val e2 = E("e2")
        val f1 = F("f1")
        val f2 = F("f2")
        val g1 = G("g1")
        val g2 = G("g2")
        val h1 = H("h1")
        val h2 = H("h2")

        val flow1 = flow<A> {
            emit(a1)
            emit(a2)
        }
        val flow2 = flow<B> {
            emit(b1)
            emit(b2)
        }
        val flow3 = flow<C> {
            emit(c1)
            emit(c2)
        }
        val flow4 = flow<D> {
            emit(d1)
            emit(d2)
        }
        val flow5 = flow<E> {
            emit(e1)
            emit(e2)
        }
        val flow6 = flow<F> {
            emit(f1)
            emit(f2)
        }
        val flow7 = flow<G> {
            emit(g1)
            emit(g2)
        }
        val flow8 = flow<H> {
            emit(h1)
            emit(h2)
        }


        val setA = linkedSetOf<A>()
        val setB = linkedSetOf<B>()
        val setC = linkedSetOf<C>()
        val setD = linkedSetOf<D>()
        val setE = linkedSetOf<E>()
        val setF = linkedSetOf<F>()
        val setG = linkedSetOf<G>()
        val setH = linkedSetOf<H>()

        GlobalScope.run {
            runBlocking {
                combineTuple(flow1, flow2, flow3, flow4, flow5, flow6, flow7, flow8)
                    .collect { (a, b, c, d, e, f, g, h) ->
                        setA.add(a)
                        setB.add(b)
                        setC.add(c)
                        setD.add(d)
                        setE.add(e)
                        setF.add(f)
                        setG.add(g)
                        setH.add(h)
                    }
            }
        }

        assertThat(setA).containsExactly(a1, a2)
        assertThat(setB).containsExactly(b1, b2)
        assertThat(setC).containsExactly(c1, c2)
        assertThat(setD).containsExactly(d1, d2)
        assertThat(setE).containsExactly(e1, e2)
        assertThat(setF).containsExactly(f1, f2)
        assertThat(setG).containsExactly(g1, g2)
        assertThat(setH).containsExactly(h1, h2)
    }

    @ExperimentalCoroutinesApi
    @Test
    fun checkTuple9() {
        val a1 = A("a1")
        val a2 = A("a2")
        val b1 = B("b1")
        val b2 = B("b2")
        val c1 = C("c1")
        val c2 = C("c2")
        val d1 = D("d1")
        val d2 = D("d2")
        val e1 = E("e1")
        val e2 = E("e2")
        val f1 = F("f1")
        val f2 = F("f2")
        val g1 = G("g1")
        val g2 = G("g2")
        val h1 = H("h1")
        val h2 = H("h2")
        val i1 = I("i1")
        val i2 = I("i2")

        val flow1 = flow<A> {
            emit(a1)
            emit(a2)
        }
        val flow2 = flow<B> {
            emit(b1)
            emit(b2)
        }
        val flow3 = flow<C> {
            emit(c1)
            emit(c2)
        }
        val flow4 = flow<D> {
            emit(d1)
            emit(d2)
        }
        val flow5 = flow<E> {
            emit(e1)
            emit(e2)
        }
        val flow6 = flow<F> {
            emit(f1)
            emit(f2)
        }
        val flow7 = flow<G> {
            emit(g1)
            emit(g2)
        }
        val flow8 = flow<H> {
            emit(h1)
            emit(h2)
        }
        val flow9 = flow<I> {
            emit(i1)
            emit(i2)
        }


        val setA = linkedSetOf<A>()
        val setB = linkedSetOf<B>()
        val setC = linkedSetOf<C>()
        val setD = linkedSetOf<D>()
        val setE = linkedSetOf<E>()
        val setF = linkedSetOf<F>()
        val setG = linkedSetOf<G>()
        val setH = linkedSetOf<H>()
        val setI = linkedSetOf<I>()

        GlobalScope.run {
            runBlocking {
                combineTuple(flow1, flow2, flow3, flow4, flow5, flow6, flow7, flow8, flow9)
                    .collect { (a, b, c, d, e, f, g, h, i) ->
                        setA.add(a)
                        setB.add(b)
                        setC.add(c)
                        setD.add(d)
                        setE.add(e)
                        setF.add(f)
                        setG.add(g)
                        setH.add(h)
                        setI.add(i)
                    }
            }
        }

        assertThat(setA).containsExactly(a1, a2)
        assertThat(setB).containsExactly(b1, b2)
        assertThat(setC).containsExactly(c1, c2)
        assertThat(setD).containsExactly(d1, d2)
        assertThat(setE).containsExactly(e1, e2)
        assertThat(setF).containsExactly(f1, f2)
        assertThat(setG).containsExactly(g1, g2)
        assertThat(setH).containsExactly(h1, h2)
        assertThat(setI).containsExactly(i1, i2)
    }

    @ExperimentalCoroutinesApi
    @Test
    fun checkTuple10() {
        val a1 = A("a1")
        val a2 = A("a2")
        val b1 = B("b1")
        val b2 = B("b2")
        val c1 = C("c1")
        val c2 = C("c2")
        val d1 = D("d1")
        val d2 = D("d2")
        val e1 = E("e1")
        val e2 = E("e2")
        val f1 = F("f1")
        val f2 = F("f2")
        val g1 = G("g1")
        val g2 = G("g2")
        val h1 = H("h1")
        val h2 = H("h2")
        val i1 = I("i1")
        val i2 = I("i2")
        val j1 = J("j1")
        val j2 = J("j2")

        val flow1 = flow<A> {
            emit(a1)
            emit(a2)
        }
        val flow2 = flow<B> {
            emit(b1)
            emit(b2)
        }
        val flow3 = flow<C> {
            emit(c1)
            emit(c2)
        }
        val flow4 = flow<D> {
            emit(d1)
            emit(d2)
        }
        val flow5 = flow<E> {
            emit(e1)
            emit(e2)
        }
        val flow6 = flow<F> {
            emit(f1)
            emit(f2)
        }
        val flow7 = flow<G> {
            emit(g1)
            emit(g2)
        }
        val flow8 = flow<H> {
            emit(h1)
            emit(h2)
        }
        val flow9 = flow<I> {
            emit(i1)
            emit(i2)
        }
        val flow10 = flow<J> {
            emit(j1)
            emit(j2)
        }


        val setA = linkedSetOf<A>()
        val setB = linkedSetOf<B>()
        val setC = linkedSetOf<C>()
        val setD = linkedSetOf<D>()
        val setE = linkedSetOf<E>()
        val setF = linkedSetOf<F>()
        val setG = linkedSetOf<G>()
        val setH = linkedSetOf<H>()
        val setI = linkedSetOf<I>()
        val setJ = linkedSetOf<J>()

        GlobalScope.run {
            runBlocking {
                combineTuple(flow1, flow2, flow3, flow4, flow5, flow6, flow7, flow8, flow9, flow10)
                    .collect { (a, b, c, d, e, f, g, h, i, j) ->
                        setA.add(a)
                        setB.add(b)
                        setC.add(c)
                        setD.add(d)
                        setE.add(e)
                        setF.add(f)
                        setG.add(g)
                        setH.add(h)
                        setI.add(i)
                        setJ.add(j)
                    }
            }
        }

        assertThat(setA).containsExactly(a1, a2)
        assertThat(setB).containsExactly(b1, b2)
        assertThat(setC).containsExactly(c1, c2)
        assertThat(setD).containsExactly(d1, d2)
        assertThat(setE).containsExactly(e1, e2)
        assertThat(setF).containsExactly(f1, f2)
        assertThat(setG).containsExactly(g1, g2)
        assertThat(setH).containsExactly(h1, h2)
        assertThat(setI).containsExactly(i1, i2)
        assertThat(setJ).containsExactly(j1, j2)
    }

    @ExperimentalCoroutinesApi
    @Test
    fun checkTuple11() {
        val a1 = A("a1")
        val a2 = A("a2")
        val b1 = B("b1")
        val b2 = B("b2")
        val c1 = C("c1")
        val c2 = C("c2")
        val d1 = D("d1")
        val d2 = D("d2")
        val e1 = E("e1")
        val e2 = E("e2")
        val f1 = F("f1")
        val f2 = F("f2")
        val g1 = G("g1")
        val g2 = G("g2")
        val h1 = H("h1")
        val h2 = H("h2")
        val i1 = I("i1")
        val i2 = I("i2")
        val j1 = J("j1")
        val j2 = J("j2")
        val k1 = K("k1")
        val k2 = K("k2")

        val flow1 = flow<A> {
            emit(a1)
            emit(a2)
        }
        val flow2 = flow<B> {
            emit(b1)
            emit(b2)
        }
        val flow3 = flow<C> {
            emit(c1)
            emit(c2)
        }
        val flow4 = flow<D> {
            emit(d1)
            emit(d2)
        }
        val flow5 = flow<E> {
            emit(e1)
            emit(e2)
        }
        val flow6 = flow<F> {
            emit(f1)
            emit(f2)
        }
        val flow7 = flow<G> {
            emit(g1)
            emit(g2)
        }
        val flow8 = flow<H> {
            emit(h1)
            emit(h2)
        }
        val flow9 = flow<I> {
            emit(i1)
            emit(i2)
        }
        val flow10 = flow<J> {
            emit(j1)
            emit(j2)
        }
        val flow11 = flow<K> {
            emit(k1)
            emit(k2)
        }


        val setA = linkedSetOf<A>()
        val setB = linkedSetOf<B>()
        val setC = linkedSetOf<C>()
        val setD = linkedSetOf<D>()
        val setE = linkedSetOf<E>()
        val setF = linkedSetOf<F>()
        val setG = linkedSetOf<G>()
        val setH = linkedSetOf<H>()
        val setI = linkedSetOf<I>()
        val setJ = linkedSetOf<J>()
        val setK = linkedSetOf<K>()

        GlobalScope.run {
            runBlocking {
                combineTuple(flow1, flow2, flow3, flow4, flow5, flow6, flow7, flow8, flow9, flow10, flow11)
                    .collect { (a, b, c, d, e, f, g, h, i, j, k) ->
                        setA.add(a)
                        setB.add(b)
                        setC.add(c)
                        setD.add(d)
                        setE.add(e)
                        setF.add(f)
                        setG.add(g)
                        setH.add(h)
                        setI.add(i)
                        setJ.add(j)
                        setK.add(k)
                    }
            }
        }

        assertThat(setA).containsExactly(a1, a2)
        assertThat(setB).containsExactly(b1, b2)
        assertThat(setC).containsExactly(c1, c2)
        assertThat(setD).containsExactly(d1, d2)
        assertThat(setE).containsExactly(e1, e2)
        assertThat(setF).containsExactly(f1, f2)
        assertThat(setG).containsExactly(g1, g2)
        assertThat(setH).containsExactly(h1, h2)
        assertThat(setI).containsExactly(i1, i2)
        assertThat(setJ).containsExactly(j1, j2)
        assertThat(setK).containsExactly(k1, k2)
    }

    @ExperimentalCoroutinesApi
    @Test
    fun checkTuple12() {
        val a1 = A("a1")
        val a2 = A("a2")
        val b1 = B("b1")
        val b2 = B("b2")
        val c1 = C("c1")
        val c2 = C("c2")
        val d1 = D("d1")
        val d2 = D("d2")
        val e1 = E("e1")
        val e2 = E("e2")
        val f1 = F("f1")
        val f2 = F("f2")
        val g1 = G("g1")
        val g2 = G("g2")
        val h1 = H("h1")
        val h2 = H("h2")
        val i1 = I("i1")
        val i2 = I("i2")
        val j1 = J("j1")
        val j2 = J("j2")
        val k1 = K("k1")
        val k2 = K("k2")
        val l1 = L("l1")
        val l2 = L("l2")

        val flow1 = flow<A> {
            emit(a1)
            emit(a2)
        }
        val flow2 = flow<B> {
            emit(b1)
            emit(b2)
        }
        val flow3 = flow<C> {
            emit(c1)
            emit(c2)
        }
        val flow4 = flow<D> {
            emit(d1)
            emit(d2)
        }
        val flow5 = flow<E> {
            emit(e1)
            emit(e2)
        }
        val flow6 = flow<F> {
            emit(f1)
            emit(f2)
        }
        val flow7 = flow<G> {
            emit(g1)
            emit(g2)
        }
        val flow8 = flow<H> {
            emit(h1)
            emit(h2)
        }
        val flow9 = flow<I> {
            emit(i1)
            emit(i2)
        }
        val flow10 = flow<J> {
            emit(j1)
            emit(j2)
        }
        val flow11 = flow<K> {
            emit(k1)
            emit(k2)
        }
        val flow12 = flow<L> {
            emit(l1)
            emit(l2)
        }


        val setA = linkedSetOf<A>()
        val setB = linkedSetOf<B>()
        val setC = linkedSetOf<C>()
        val setD = linkedSetOf<D>()
        val setE = linkedSetOf<E>()
        val setF = linkedSetOf<F>()
        val setG = linkedSetOf<G>()
        val setH = linkedSetOf<H>()
        val setI = linkedSetOf<I>()
        val setJ = linkedSetOf<J>()
        val setK = linkedSetOf<K>()
        val setL = linkedSetOf<L>()

        GlobalScope.run {
            runBlocking {
                combineTuple(flow1, flow2, flow3, flow4, flow5, flow6, flow7, flow8, flow9, flow10, flow11, flow12)
                    .collect { (a, b, c, d, e, f, g, h, i, j, k, l) ->
                        setA.add(a)
                        setB.add(b)
                        setC.add(c)
                        setD.add(d)
                        setE.add(e)
                        setF.add(f)
                        setG.add(g)
                        setH.add(h)
                        setI.add(i)
                        setJ.add(j)
                        setK.add(k)
                        setL.add(l)
                    }
            }
        }

        assertThat(setA).containsExactly(a1, a2)
        assertThat(setB).containsExactly(b1, b2)
        assertThat(setC).containsExactly(c1, c2)
        assertThat(setD).containsExactly(d1, d2)
        assertThat(setE).containsExactly(e1, e2)
        assertThat(setF).containsExactly(f1, f2)
        assertThat(setG).containsExactly(g1, g2)
        assertThat(setH).containsExactly(h1, h2)
        assertThat(setI).containsExactly(i1, i2)
        assertThat(setJ).containsExactly(j1, j2)
        assertThat(setK).containsExactly(k1, k2)
        assertThat(setL).containsExactly(l1, l2)
    }

    @ExperimentalCoroutinesApi
    @Test
    fun checkTuple13() {
        val a1 = A("a1")
        val a2 = A("a2")
        val b1 = B("b1")
        val b2 = B("b2")
        val c1 = C("c1")
        val c2 = C("c2")
        val d1 = D("d1")
        val d2 = D("d2")
        val e1 = E("e1")
        val e2 = E("e2")
        val f1 = F("f1")
        val f2 = F("f2")
        val g1 = G("g1")
        val g2 = G("g2")
        val h1 = H("h1")
        val h2 = H("h2")
        val i1 = I("i1")
        val i2 = I("i2")
        val j1 = J("j1")
        val j2 = J("j2")
        val k1 = K("k1")
        val k2 = K("k2")
        val l1 = L("l1")
        val l2 = L("l2")
        val m1 = M("m1")
        val m2 = M("m2")

        val flow1 = flow<A> {
            emit(a1)
            emit(a2)
        }
        val flow2 = flow<B> {
            emit(b1)
            emit(b2)
        }
        val flow3 = flow<C> {
            emit(c1)
            emit(c2)
        }
        val flow4 = flow<D> {
            emit(d1)
            emit(d2)
        }
        val flow5 = flow<E> {
            emit(e1)
            emit(e2)
        }
        val flow6 = flow<F> {
            emit(f1)
            emit(f2)
        }
        val flow7 = flow<G> {
            emit(g1)
            emit(g2)
        }
        val flow8 = flow<H> {
            emit(h1)
            emit(h2)
        }
        val flow9 = flow<I> {
            emit(i1)
            emit(i2)
        }
        val flow10 = flow<J> {
            emit(j1)
            emit(j2)
        }
        val flow11 = flow<K> {
            emit(k1)
            emit(k2)
        }
        val flow12 = flow<L> {
            emit(l1)
            emit(l2)
        }
        val flow13 = flow<M> {
            emit(m1)
            emit(m2)
        }


        val setA = linkedSetOf<A>()
        val setB = linkedSetOf<B>()
        val setC = linkedSetOf<C>()
        val setD = linkedSetOf<D>()
        val setE = linkedSetOf<E>()
        val setF = linkedSetOf<F>()
        val setG = linkedSetOf<G>()
        val setH = linkedSetOf<H>()
        val setI = linkedSetOf<I>()
        val setJ = linkedSetOf<J>()
        val setK = linkedSetOf<K>()
        val setL = linkedSetOf<L>()
        val setM = linkedSetOf<M>()

        GlobalScope.run {
            runBlocking {
                combineTuple(flow1, flow2, flow3, flow4, flow5, flow6, flow7, flow8, flow9, flow10, flow11, flow12, flow13)
                    .collect { (a, b, c, d, e, f, g, h, i, j, k, l, m) ->
                        setA.add(a)
                        setB.add(b)
                        setC.add(c)
                        setD.add(d)
                        setE.add(e)
                        setF.add(f)
                        setG.add(g)
                        setH.add(h)
                        setI.add(i)
                        setJ.add(j)
                        setK.add(k)
                        setL.add(l)
                        setM.add(m)
                    }
            }
        }

        assertThat(setA).containsExactly(a1, a2)
        assertThat(setB).containsExactly(b1, b2)
        assertThat(setC).containsExactly(c1, c2)
        assertThat(setD).containsExactly(d1, d2)
        assertThat(setE).containsExactly(e1, e2)
        assertThat(setF).containsExactly(f1, f2)
        assertThat(setG).containsExactly(g1, g2)
        assertThat(setH).containsExactly(h1, h2)
        assertThat(setI).containsExactly(i1, i2)
        assertThat(setJ).containsExactly(j1, j2)
        assertThat(setK).containsExactly(k1, k2)
        assertThat(setL).containsExactly(l1, l2)
        assertThat(setM).containsExactly(m1, m2)
    }

    @ExperimentalCoroutinesApi
    @Test
    fun checkTuple14() {
        val a1 = A("a1")
        val a2 = A("a2")
        val b1 = B("b1")
        val b2 = B("b2")
        val c1 = C("c1")
        val c2 = C("c2")
        val d1 = D("d1")
        val d2 = D("d2")
        val e1 = E("e1")
        val e2 = E("e2")
        val f1 = F("f1")
        val f2 = F("f2")
        val g1 = G("g1")
        val g2 = G("g2")
        val h1 = H("h1")
        val h2 = H("h2")
        val i1 = I("i1")
        val i2 = I("i2")
        val j1 = J("j1")
        val j2 = J("j2")
        val k1 = K("k1")
        val k2 = K("k2")
        val l1 = L("l1")
        val l2 = L("l2")
        val m1 = M("m1")
        val m2 = M("m2")
        val n1 = N("n1")
        val n2 = N("n2")

        val flow1 = flow<A> {
            emit(a1)
            emit(a2)
        }
        val flow2 = flow<B> {
            emit(b1)
            emit(b2)
        }
        val flow3 = flow<C> {
            emit(c1)
            emit(c2)
        }
        val flow4 = flow<D> {
            emit(d1)
            emit(d2)
        }
        val flow5 = flow<E> {
            emit(e1)
            emit(e2)
        }
        val flow6 = flow<F> {
            emit(f1)
            emit(f2)
        }
        val flow7 = flow<G> {
            emit(g1)
            emit(g2)
        }
        val flow8 = flow<H> {
            emit(h1)
            emit(h2)
        }
        val flow9 = flow<I> {
            emit(i1)
            emit(i2)
        }
        val flow10 = flow<J> {
            emit(j1)
            emit(j2)
        }
        val flow11 = flow<K> {
            emit(k1)
            emit(k2)
        }
        val flow12 = flow<L> {
            emit(l1)
            emit(l2)
        }
        val flow13 = flow<M> {
            emit(m1)
            emit(m2)
        }
        val flow14 = flow<N> {
            emit(n1)
            emit(n2)
        }


        val setA = linkedSetOf<A>()
        val setB = linkedSetOf<B>()
        val setC = linkedSetOf<C>()
        val setD = linkedSetOf<D>()
        val setE = linkedSetOf<E>()
        val setF = linkedSetOf<F>()
        val setG = linkedSetOf<G>()
        val setH = linkedSetOf<H>()
        val setI = linkedSetOf<I>()
        val setJ = linkedSetOf<J>()
        val setK = linkedSetOf<K>()
        val setL = linkedSetOf<L>()
        val setM = linkedSetOf<M>()
        val setN = linkedSetOf<N>()

        GlobalScope.run {
            runBlocking {
                combineTuple(flow1, flow2, flow3, flow4, flow5, flow6, flow7, flow8, flow9, flow10, flow11, flow12, flow13, flow14)
                    .collect { (a, b, c, d, e, f, g, h, i, j, k, l, m, n) ->
                        setA.add(a)
                        setB.add(b)
                        setC.add(c)
                        setD.add(d)
                        setE.add(e)
                        setF.add(f)
                        setG.add(g)
                        setH.add(h)
                        setI.add(i)
                        setJ.add(j)
                        setK.add(k)
                        setL.add(l)
                        setM.add(m)
                        setN.add(n)
                    }
            }
        }

        assertThat(setA).containsExactly(a1, a2)
        assertThat(setB).containsExactly(b1, b2)
        assertThat(setC).containsExactly(c1, c2)
        assertThat(setD).containsExactly(d1, d2)
        assertThat(setE).containsExactly(e1, e2)
        assertThat(setF).containsExactly(f1, f2)
        assertThat(setG).containsExactly(g1, g2)
        assertThat(setH).containsExactly(h1, h2)
        assertThat(setI).containsExactly(i1, i2)
        assertThat(setJ).containsExactly(j1, j2)
        assertThat(setK).containsExactly(k1, k2)
        assertThat(setL).containsExactly(l1, l2)
        assertThat(setM).containsExactly(m1, m2)
        assertThat(setN).containsExactly(n1, n2)
    }

    @ExperimentalCoroutinesApi
    @Test
    fun checkTuple15() {
        val a1 = A("a1")
        val a2 = A("a2")
        val b1 = B("b1")
        val b2 = B("b2")
        val c1 = C("c1")
        val c2 = C("c2")
        val d1 = D("d1")
        val d2 = D("d2")
        val e1 = E("e1")
        val e2 = E("e2")
        val f1 = F("f1")
        val f2 = F("f2")
        val g1 = G("g1")
        val g2 = G("g2")
        val h1 = H("h1")
        val h2 = H("h2")
        val i1 = I("i1")
        val i2 = I("i2")
        val j1 = J("j1")
        val j2 = J("j2")
        val k1 = K("k1")
        val k2 = K("k2")
        val l1 = L("l1")
        val l2 = L("l2")
        val m1 = M("m1")
        val m2 = M("m2")
        val n1 = N("n1")
        val n2 = N("n2")
        val o1 = O("o1")
        val o2 = O("o2")

        val flow1 = flow<A> {
            emit(a1)
            emit(a2)
        }
        val flow2 = flow<B> {
            emit(b1)
            emit(b2)
        }
        val flow3 = flow<C> {
            emit(c1)
            emit(c2)
        }
        val flow4 = flow<D> {
            emit(d1)
            emit(d2)
        }
        val flow5 = flow<E> {
            emit(e1)
            emit(e2)
        }
        val flow6 = flow<F> {
            emit(f1)
            emit(f2)
        }
        val flow7 = flow<G> {
            emit(g1)
            emit(g2)
        }
        val flow8 = flow<H> {
            emit(h1)
            emit(h2)
        }
        val flow9 = flow<I> {
            emit(i1)
            emit(i2)
        }
        val flow10 = flow<J> {
            emit(j1)
            emit(j2)
        }
        val flow11 = flow<K> {
            emit(k1)
            emit(k2)
        }
        val flow12 = flow<L> {
            emit(l1)
            emit(l2)
        }
        val flow13 = flow<M> {
            emit(m1)
            emit(m2)
        }
        val flow14 = flow<N> {
            emit(n1)
            emit(n2)
        }
        val flow15 = flow<O> {
            emit(o1)
            emit(o2)
        }


        val setA = linkedSetOf<A>()
        val setB = linkedSetOf<B>()
        val setC = linkedSetOf<C>()
        val setD = linkedSetOf<D>()
        val setE = linkedSetOf<E>()
        val setF = linkedSetOf<F>()
        val setG = linkedSetOf<G>()
        val setH = linkedSetOf<H>()
        val setI = linkedSetOf<I>()
        val setJ = linkedSetOf<J>()
        val setK = linkedSetOf<K>()
        val setL = linkedSetOf<L>()
        val setM = linkedSetOf<M>()
        val setN = linkedSetOf<N>()
        val setO = linkedSetOf<O>()

        GlobalScope.run {
            runBlocking {
                combineTuple(flow1, flow2, flow3, flow4, flow5, flow6, flow7, flow8, flow9, flow10, flow11, flow12, flow13, flow14, flow15)
                    .collect { (a, b, c, d, e, f, g, h, i, j, k, l, m, n, o) ->
                        setA.add(a)
                        setB.add(b)
                        setC.add(c)
                        setD.add(d)
                        setE.add(e)
                        setF.add(f)
                        setG.add(g)
                        setH.add(h)
                        setI.add(i)
                        setJ.add(j)
                        setK.add(k)
                        setL.add(l)
                        setM.add(m)
                        setN.add(n)
                        setO.add(o)
                    }
            }
        }

        assertThat(setA).containsExactly(a1, a2)
        assertThat(setB).containsExactly(b1, b2)
        assertThat(setC).containsExactly(c1, c2)
        assertThat(setD).containsExactly(d1, d2)
        assertThat(setE).containsExactly(e1, e2)
        assertThat(setF).containsExactly(f1, f2)
        assertThat(setG).containsExactly(g1, g2)
        assertThat(setH).containsExactly(h1, h2)
        assertThat(setI).containsExactly(i1, i2)
        assertThat(setJ).containsExactly(j1, j2)
        assertThat(setK).containsExactly(k1, k2)
        assertThat(setL).containsExactly(l1, l2)
        assertThat(setM).containsExactly(m1, m2)
        assertThat(setN).containsExactly(n1, n2)
        assertThat(setO).containsExactly(o1, o2)
    }

    @ExperimentalCoroutinesApi
    @Test
    fun checkTuple16() {
        val a1 = A("a1")
        val a2 = A("a2")
        val b1 = B("b1")
        val b2 = B("b2")
        val c1 = C("c1")
        val c2 = C("c2")
        val d1 = D("d1")
        val d2 = D("d2")
        val e1 = E("e1")
        val e2 = E("e2")
        val f1 = F("f1")
        val f2 = F("f2")
        val g1 = G("g1")
        val g2 = G("g2")
        val h1 = H("h1")
        val h2 = H("h2")
        val i1 = I("i1")
        val i2 = I("i2")
        val j1 = J("j1")
        val j2 = J("j2")
        val k1 = K("k1")
        val k2 = K("k2")
        val l1 = L("l1")
        val l2 = L("l2")
        val m1 = M("m1")
        val m2 = M("m2")
        val n1 = N("n1")
        val n2 = N("n2")
        val o1 = O("o1")
        val o2 = O("o2")
        val p1 = P("p1")
        val p2 = P("p2")

        val flow1 = flow<A> {
            emit(a1)
            emit(a2)
        }
        val flow2 = flow<B> {
            emit(b1)
            emit(b2)
        }
        val flow3 = flow<C> {
            emit(c1)
            emit(c2)
        }
        val flow4 = flow<D> {
            emit(d1)
            emit(d2)
        }
        val flow5 = flow<E> {
            emit(e1)
            emit(e2)
        }
        val flow6 = flow<F> {
            emit(f1)
            emit(f2)
        }
        val flow7 = flow<G> {
            emit(g1)
            emit(g2)
        }
        val flow8 = flow<H> {
            emit(h1)
            emit(h2)
        }
        val flow9 = flow<I> {
            emit(i1)
            emit(i2)
        }
        val flow10 = flow<J> {
            emit(j1)
            emit(j2)
        }
        val flow11 = flow<K> {
            emit(k1)
            emit(k2)
        }
        val flow12 = flow<L> {
            emit(l1)
            emit(l2)
        }
        val flow13 = flow<M> {
            emit(m1)
            emit(m2)
        }
        val flow14 = flow<N> {
            emit(n1)
            emit(n2)
        }
        val flow15 = flow<O> {
            emit(o1)
            emit(o2)
        }
        val flow16 = flow<P> {
            emit(p1)
            emit(p2)
        }


        val setA = linkedSetOf<A>()
        val setB = linkedSetOf<B>()
        val setC = linkedSetOf<C>()
        val setD = linkedSetOf<D>()
        val setE = linkedSetOf<E>()
        val setF = linkedSetOf<F>()
        val setG = linkedSetOf<G>()
        val setH = linkedSetOf<H>()
        val setI = linkedSetOf<I>()
        val setJ = linkedSetOf<J>()
        val setK = linkedSetOf<K>()
        val setL = linkedSetOf<L>()
        val setM = linkedSetOf<M>()
        val setN = linkedSetOf<N>()
        val setO = linkedSetOf<O>()
        val setP = linkedSetOf<P>()

        GlobalScope.run {
            runBlocking {
                combineTuple(flow1, flow2, flow3, flow4, flow5, flow6, flow7, flow8, flow9, flow10, flow11, flow12, flow13, flow14, flow15, flow16)
                    .collect { (a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p) ->
                        setA.add(a)
                        setB.add(b)
                        setC.add(c)
                        setD.add(d)
                        setE.add(e)
                        setF.add(f)
                        setG.add(g)
                        setH.add(h)
                        setI.add(i)
                        setJ.add(j)
                        setK.add(k)
                        setL.add(l)
                        setM.add(m)
                        setN.add(n)
                        setO.add(o)
                        setP.add(p)
                    }
            }
        }

        assertThat(setA).containsExactly(a1, a2)
        assertThat(setB).containsExactly(b1, b2)
        assertThat(setC).containsExactly(c1, c2)
        assertThat(setD).containsExactly(d1, d2)
        assertThat(setE).containsExactly(e1, e2)
        assertThat(setF).containsExactly(f1, f2)
        assertThat(setG).containsExactly(g1, g2)
        assertThat(setH).containsExactly(h1, h2)
        assertThat(setI).containsExactly(i1, i2)
        assertThat(setJ).containsExactly(j1, j2)
        assertThat(setK).containsExactly(k1, k2)
        assertThat(setL).containsExactly(l1, l2)
        assertThat(setM).containsExactly(m1, m2)
        assertThat(setN).containsExactly(n1, n2)
        assertThat(setO).containsExactly(o1, o2)
        assertThat(setP).containsExactly(p1, p2)
    }
}