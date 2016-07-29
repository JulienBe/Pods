package pod

class Pod {

  var fitness = 0f
  var x = 30
  var y = 25
  var speed = 0

  def act(x: Int, y: Int, speed: Int, xCP: Int, yCP: Int, distCP: Int, angleCP: Int) = {
    this.x = x
    this.y = y
    this.speed = speed

    new PodOutput(xCP, yCP, 100)
  }

}

object Pod {
  val width = 10

  def createPods(nb: Int) = {
    List.tabulate(nb)(i => new Pod)
  }
}
