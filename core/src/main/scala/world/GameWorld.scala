package world

import brols.Creator
import pod.Pod

case class GameWorld(width: Int = 160, height: Int = 100, nbPods: Int = 100) {

  val checkpoints = Checkpoint.createCheckpoints(Creator.intInBounds(Checkpoint.minCheckpoints, Checkpoint.maxCheckpoints), width, height)
  val pods: List[Pod] = Pod.createPods(100, checkpoints(0))

}