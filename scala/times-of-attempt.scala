/*
    reference: NW H28 秋期 AM I 問1
    use: do-while Loop
    lesson: 「これ!!」の行の実行回数チェックとz値の推移を見てみた
*/

object TimesOfAttempt {

    def main(args: Array[String]): Unit = {

        var x: Double = 0
        var y: Double = 1
        var z: Double = (x + y) / 2 // これ!!
        var count: Int = 1

        println(s"$count 回目 z: $z")

        while (y - z >= 0.001) {
            if (z >= 0) {
                y = z
            } else {
                x = z
            }
            count += 1
            z = (x + y) / 2 // これ!!
            println(s"$count 回目 z: $z")
        }

    }

}
