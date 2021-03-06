package draw

import com.badlogic.gdx.graphics.OrthographicCamera
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import main.Rome

/**
  * Created by julein on 05/07/16.
  */
trait GdxProvider {
  def getCamera() = {
    val cam = new OrthographicCamera(Rome.world.width, Rome.world.height)
    cam.position.set(cam.viewportWidth / 2f, cam.viewportHeight / 2f, 0)
    cam
  }
  def getShapeRenderer() = {
    val shapeRenderer = new ShapeRenderer
    shapeRenderer.setAutoShapeType(true)
    shapeRenderer
  }
  def getSpriteBatch() = new SpriteBatch
}
