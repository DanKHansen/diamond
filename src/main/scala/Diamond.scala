object Diamond:
   def rows(c: Char): List[String] =
      val iterations = c - 65
      val ls =
         for x <- 'A' to c
         yield
            val leftside = " " * (iterations - (x - 65)) + x + " " * (x - 65)
            leftside ++ leftside.reverse.drop(1)
      ls.toList ++ ls.reverse.drop(1)
