import doodle.core._
import doodle.core.Image._
import doodle.syntax._
import doodle.jvm.Java2DFrame._
import doodle.backend.StandardInterpreter._

object Example4 {

	val box = 
		Image.rectangle(40,40).
			lineWidth(5.0).
			lineColor(Color.royalBlue.spin(30.degrees)).
			fillColor(Color.royalBlue)

	(box beside box beside box beside box beside box).draw
	

}

