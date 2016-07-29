package main

import akka.actor.ActorSystem
import com.badlogic.gdx.Game
import com.badlogic.gdx.math.Vector2
import draw.{Drawer, GdxProvider}
import world.GameWorld
import world.pod.{Pod, PodOutput}

object Rome extends Game {

  val system = ActorSystem()
  val populationSize = 70
  val world = new GameWorld

  override def create() = {
    setScreen(new Drawer(new GdxProvider {}))
  }

  def updatePods = {
    world.pods.foreach(p =>
      processOutput(p.move, p)
    )
  }

  def processOutput(move: PodOutput, p: Pod) = {
    val mvt = new Vector2(p.x, p.y)
    mvt.sub(move.target)
    mvt.nor()
    mvt.scl(-move.speed)
    p.updatePos(p.x + move.target.x.toInt, p.y + move.target.y.toInt)
  }

}
