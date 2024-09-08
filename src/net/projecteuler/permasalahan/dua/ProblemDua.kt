package net.projecteuler.permasalahan.dua

import net.projecteuler.permasalahan.satu.ProblemSatu

class ProblemDua {
    fun result(n:Int): Int{
        var sum = 0
        var awal = 1
        var akhir = 1
        var c = awal + akhir
        while(c < n){
            sum += c
            awal = c + akhir
            akhir = awal + c
            c = awal + akhir
        }
        return sum-1
    }
}

fun main(){
    var problem = ProblemDua()

    println(problem.result(4_000_000))
}