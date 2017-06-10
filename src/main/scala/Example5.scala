import doodle.core._
import doodle.core.Image._
import doodle.syntax._
import doodle.jvm.Java2DFrame._
import doodle.backend.StandardInterpreter._

object Example5 {

	val roof = (triangle(100,80).fillColor(Color.brown))
	val house = ((rectangle(20,40).fillColor(Color.black)) on (rectangle(100, 120).fillColor(Color.red)))
	
	val road1 = (((rectangle(50,2).fillColor(Color.yellow)) beside (rectangle(20,2).fillColor(Color.black))))
	val	road2 = (rectangle(70,2).fillColor(Color.black)) 
	val road = ((road1 beside road1 beside road1) on (road2 beside road2 beside road2))
	val tree = (circle(30) above (rectangle(20,40)))

	(((roof above house) beside tree) above road).draw
}



//roof triangle
//above
//house (rectangle on rectangle)
//road ((rectangle beside rectangle beside rectangle) above rectangle)


//20 10 20 1 hoch
//50 3 hoch