package main

import akka.actor.ActorSystem
import com.badlogic.gdx.Game
import draw.{Drawer, GdxProvider}
import world.GameWorld

object Rome extends Game {

  val system = ActorSystem()
  val populationSize = 70
  val world = new GameWorld

  override def create() = {
    setScreen(new Drawer(new GdxProvider {}))
  }

}
