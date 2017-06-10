import doodle.core._
import doodle.core.Image._
import doodle.syntax._
import doodle.jvm.Java2DFrame._
import doodle.backend.StandardInterpreter._

object Workshop2 {

	val aBox = Image.rectangle(20, 20).fillColor(Color.red)

	val oneBox = aBox beside Image.empty

	val twoBoxes = aBox beside oneBox

	val threeBoxes = aBox beside twoBoxes

	def boxes(count: Int): Image = 

		count match {
			case 0 => Image.empty
			case n => aBox beside boxes(n-1)

		}

		boxes(12).draw
}