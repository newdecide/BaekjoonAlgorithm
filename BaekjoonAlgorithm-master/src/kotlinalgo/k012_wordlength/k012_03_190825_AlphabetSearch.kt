package kotlinalgo.k012_wordlength

import java.util.Scanner

    fun main(args: Array<String>) {
        // 10809번
        // 알파벳 찾기

        val sc = Scanner(System.`in`)

        val str = sc.next()

        val arr = str.toCharArray() // 입력 받은 문자열을 배열을 생성후 한 글자씩 배정.

        val result_arr = whereisAlpha(arr)

        for (i in result_arr.indices) {
            print(result_arr[i].toString() + " ")
        }
    }

    internal fun whereisAlpha(arr: CharArray): IntArray {

        val location = IntArray(26) // 알파벳 총 26자의 위치 정보를 저장하기 위한 배열.
        val locate: Int

        for (i in 0..25) { // 모든 알파벳을 탐색하기 위한 반복문.
            val alphabet = (i + 97).toChar() // 97(아스키코드로 a)부터 강제 형변환 시켜주어 문자를 대입.
            for (j in arr.indices) { // 문자열을 담은 배열에 해당 알파벳이 있는지 검사.
                if (arr[j] == alphabet) {
                    location[i] = j // 같다면 배열 location에 해당 알파벳이 있던 위치 정보를 대입.
                    break
                } else if (j == arr.size - 1 && arr[j] != alphabet) { // 문자열을 끝까지 탐색했으나 해당 알파벳이 없으면,
                    location[i] = -1 // -1을 대입.
                }
            }
        }
        return location
        // baekjoon
        // 1 0 -1 -1 2 -1 -1 -1 -1 4 3 -1 -1 7 5 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1
    }



