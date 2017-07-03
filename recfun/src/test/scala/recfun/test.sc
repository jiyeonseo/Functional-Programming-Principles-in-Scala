import scala.annotation.tailrec

@tailrec
def compression(args: List[String],count:Int, acc: String) : String = {

  if(args.length == 0 ) acc
  else {
//    println("args",args)
//    println("acc",acc)
    if(acc.length != 0 ){

      if(acc.last == args(0)) {
//        println("acc.last",acc.last)
println("??")
        compression(args.tail,  count+1,  acc)
      }else {
        println("nonosamelast", acc.last)
        println("nonosame", args(0))
        compression(args.tail,  0,  acc.concat(count.toString))
      }
    }else {
      compression(args.tail, 1, acc.concat(args(0)))
    }

  }
}
def cheese(args: List[String] ) = {
  compression(args,0,"")
}

val ba : List[String] = List("a", "a", "a")
val result = cheese(ba)



