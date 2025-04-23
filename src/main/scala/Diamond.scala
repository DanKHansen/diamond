object Diamond:
   def rows(c: Char): List[String] =
      val iterations = c - 65
      println(s"Iterations: $iterations")

      val l = for it <- 0 to iterations
      yield {" " * (iterations-it) + (it+65).toChar + " " * (iterations) + (it+65).toChar  + " " * (iterations-it)}
      (l ++ l.reverse.drop(1)).foreach(println)

      (l ++ l.reverse.drop(1)).toList