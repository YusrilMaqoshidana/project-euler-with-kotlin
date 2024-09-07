package net.projecteuler.permasalahan.satu

import kotlin.system.measureTimeMillis

class ProblemSatu {
    val s1 = 3
    val s2 = 5

    // Fungsi solutionNormal
    fun solutionNormal(n: Int) {
        var list = 0L
        for (i in 1 until n) {
            if (i % s1 == 0 || i % s2 == 0) {
                list += i
            }
        }
        println("Hasil solutionNormal: $list")
    }

    // Fungsi solutionAdvance
    fun solutionAdvance(n: Int): Long {
        val param = n - 1

        val v1 = param / 3
        val v2 = param / 5
        val v3 = param / 15

        val resultS1 = v1.toLong() * (s1 + (v1 * s1)) / 2
        val resultS2 = v2.toLong() * (s2 + (v2 * s2)) / 2
        val resultS3 = v3.toLong() * ((s1 * s2) + (v3 * (s1 * s2))) / 2

        val result = resultS1 + resultS2 - resultS3
        return result
    }
}

fun main() {
    val problem = ProblemSatu()

    // Mengukur kecepatan solutionAdvance O(1)
    val advanceTime = measureTimeMillis {
        val resultAdvance = problem.solutionAdvance(1_000_000)
        println("Hasil solutionAdvance: $resultAdvance")
    }
    println("Waktu eksekusi solutionAdvance: $advanceTime ms")

    // Mengukur kecepatan solutionNormal O(n)
    val normalTime = measureTimeMillis {
        problem.solutionNormal(1_000_000)
    }
    println("Waktu eksekusi solutionNormal: $normalTime ms")

}
