import doodle.core._
import doodle.core.Image._
import doodle.syntax._
import doodle.jvm.Java2DFrame._
import doodle.backend.StandardInterpreter._


object Workshop{

	def drawCircle = {

		val myCircle = circle(10)
		myCircle.draw
	}

	def drawRectangle = {

		val myRectangle = rectangle(100,50)
		myRectangle.draw
	}

	def drawTriangle = {

		val myTriangle = triangle(60,40)
		myTriangle.draw
	}

}