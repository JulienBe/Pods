package world.pod

import world.Checkpoint

class Pod(var checkpoint: Checkpoint) {

  var fitness = 0f
  var x = 30
  var y = 25
  var speed = 0

  def move() = {
    new PodOutput(checkpoint.pos, 100)
  }

  def updatePos(x: Int, y: Int) = {
    this.x = x
    this.y = y
  }

}

object Pod {
  val width = 10

  def createPods(nb: Int, checkpoint: Checkpoint) = {
    List.tabulate(nb)(i => new Pod(checkpoint))
  }
}
