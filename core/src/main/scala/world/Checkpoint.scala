package world

import brols.Creator

/**
  * Created by julein on 29/07/16.
  */
case class Checkpoint(x: Int, y: Int)

object Checkpoint {
  val diameter = 600
  val radius = diameter / 2
  val minCheckpoints = 2
  val maxCheckpoints = 12

  def createCheckpoints(nb: Int, width: Int, height: Int) = {
    if (nb < minCheckpoints || nb > maxCheckpoints)
      throw new IllegalArgumentException("Invalid number of checkpoints : " + nb + " min is : " + minCheckpoints + " max is : " + maxCheckpoints)
    List.tabulate(nb)(i =>
      new Checkpoint(Creator.int(width), Creator.int(height))
    )
  }
}
