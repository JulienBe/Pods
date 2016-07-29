package draw

import brols.Timer
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.GL20
import main.Rome
import world.Checkpoint
import world.pod.Pod

class Drawer(gdxProvider: GdxProvider) extends Screener(gdxProvider) with GdxProvider {

  val timer = new Timer(90)
  var finished = false

  override def render(delta: Float) = {
    camera.update()
    Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)

    Rome.updatePods

    shapeRenderer.begin
    Rome.world.pods.foreach(draw _)
    Rome.world.checkpoints.foreach(draw(_))
    shapeRenderer.end

    if (timer.step(delta))
      Gdx.app.log("DEBUG", "Finished :)")
  }

  def draw(pod: Pod) = {
    shapeRenderer.circle(pod.x, pod.y, Pod.width)
  }

  def draw(checkpoint: Checkpoint) = {
    shapeRenderer.rect(checkpoint.pos.x, checkpoint.pos.y, checkpoint.pos.x + 10, checkpoint.pos.y + 10)
  }
}