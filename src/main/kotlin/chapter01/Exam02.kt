package chapter01

import java.util.concurrent.TimeUnit
import kotlin.concurrent.thread

fun main(args: Array<String>) {

    /*  var num = 0

      for (i in 1..1000) {
          thread {
              TimeUnit.MILLISECONDS.sleep(10)
              num += 1
          }
      }

      TimeUnit.SECONDS.sleep(5)
      println("num = $num")*/


    var lock = Any()
    var num = 0

    for (i in 1..1000) {
        thread {
            TimeUnit.MILLISECONDS.sleep(10)
            synchronized(lock) {
                num += 1
            }
        }
    }

    TimeUnit.SECONDS.sleep(1)
    println("num = $num")
}
