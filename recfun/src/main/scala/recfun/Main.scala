package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int = {
      if (c == 0 || c == r) 1
      else pascal(c - 1, r - 1) + pascal(c, r - 1)

    }
  
  /**
   * Exercise 2
   * chars.isEmpty: 리스트가 비어있는지 아닌지 boolean
   * chars.head: 리스트의 첫번째 element
   * chars.tail: 리스트 첫번째 element 뺴고 다
    *
    * open 될때마다 +1
    * close 될때마다 -1 씩해서
    * 마지막까지 돌았을때 0 이면 balance 된것
    */
    def balance(chars: List[Char]): Boolean = {
      def balanced(chars: List[Char], open: Int): Boolean = {
        if (chars.isEmpty) open == 0
        else if (chars.head == '(') balanced(chars.tail,open+1)
        else if (chars.head == ')') open>0 && balanced(chars.tail,open-1)
        else balanced(chars.tail,open)
      }
      balanced(chars,0)
    }
  
  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = {
      if(money == 0)
        1
      else if(money > 0 && !coins.isEmpty)
        countChange(money - coins.head, coins) + countChange(money, coins.tail)
      else
        0
    }

  }
