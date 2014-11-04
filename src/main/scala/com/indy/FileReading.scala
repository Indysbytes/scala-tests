import scala.io.Source
import java.io._

class FileReading() {

def readFromFile(filenameRead: String = "tryMe.txt"): List[String] = {
  try {
    Source.fromFile(filenameRead).getLines()).toList

    // for (line <- Source.fromFile(filenameRead).getLines()) {
    //   println(line)

    // }
  }
  catch {
    case ex: FileNotFoundException => println("Couldn't find that file.")
    case ex: IOException => println("Had an IOException trying to read that file")
  }
}

def writeToFile(filenameWrite: String = "tryMeWrite.txt", contents: String = "Default Hello") {

   val writer = new PrintWriter(new File(filenameWrite))

    try{
      writer.write(contents)

    }
    catch{
      case ex: FileNotFoundException => println("Couldn't find that file.")
      case ex: IOException => println("Had an IOException trying to read that file")
      case _ : Throwable =>  println(s"Unexpected problems trying to write to file: $filenameWrite ")
    }
    finally{
      writer.close()
    }
}
}

object FileIO {

  def main(arg: String) = {
    val fileReading = new FileReading()
    readFile.readFromFile()
    readFile.writeToFile()
  }



// other way to read from file
// Source.fromFile("test.txt" ).foreach{ print  }

// SC472342C


}
