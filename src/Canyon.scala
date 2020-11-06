import scala.collection.mutable

object Canyon extends App{
  val r = scala.util.Random
  var n_monkeys = 10
  var qEW = mutable.Queue[Monkey]()
  var qWE = mutable.Queue[Monkey]()

  def gen_monkey(): Monkey = {
    var prob = r.nextFloat()
    if (prob > 0.5) {
      return new Monkey("EW")
    } else {
      return new Monkey("WE")
    }
  }

  for(i <- 0 to n_monkeys){
    var monkey = gen_monkey()
    wait(1)
    if(monkey.dir == "EW"){
      qEW.enqueue(monkey)
    }else{
      qWE.enqueue(monkey)
    }
    
  }

}