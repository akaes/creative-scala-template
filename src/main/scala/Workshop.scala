import doodle.core._
import doodle.core.Image._
import doodle.syntax._
import doodle.jvm.Java2DFrame._
import doodle.backend.StandardInterpreter._


object Workshop{

	val myCircleOne = circle(1)
	val myCircleTwo = circle(10)
	val myCircleThree = circle(100)
	val myCircleFour = circle(20)
	val myCircleFive = circle(30)
	val myRectangle = rectangle(10,20)
	val myRectangleTwo = rectangle(6, 20)
	val myRectangleThree = rectangle(20, 6)
	val myRectangleFour = rectangle(80, 25)
	val myTriangle = triangle(60,40)


	def drawCircle = {

		val myCircle = circle(10)
		myCircle.draw
	}

	def drawRectangle = {
		
		myRectangle.draw
	}

	def drawTriangle = {
	
		myTriangle.draw
	}

	def drawGoRoundInCircles = {
		
		myCircleOne.draw
		myCircleTwo.draw
		myCircleThree.draw
	}

	def drawMoreFigures = {

		(myCircleTwo beside myTriangle).draw

	}

	def drawCircleBesideRectangle = {

		(myCircleTwo beside myRectangle).draw

	}

	def drawCircleAboveRectangle = {

		(myCircleTwo above myRectangle).draw

	}

	def drawCircleBelowRectangle = {

		(myCircleTwo below myRectangle).draw

	}

	def drawCircleOnRectangle = {

		(myCircleTwo on myRectangle).draw

	}

	def drawCircleUnderRectangle = {

		(myCircleTwo under myRectangle).draw

	}

	def drawStayOnTarget = {

		(
			(myCircleTwo fillColor Color.red) on
			(myCircleFour fillColor Color.white) on
			(myCircleFive fillColor Color.red lineWidth 2) above
			(myRectangleTwo fillColor Color.white above myRectangleThree fillColor Color.brown) above
			(myRectangleFour lineWidth 0 fillColor Color.green)
		)
	}

}