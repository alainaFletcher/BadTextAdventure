import scala.io.Source

object Main extends App {
  println("Hail and well met traveler! What is your name?")
  val name = scala.io.StdIn.readLine()
  //create a Victim -I mean adventuerer- Object
  val health = scala.util.Random.nextInt(10).toInt
  val player = new Victim.Victim(name, health)

  println(name + "! A good name! A brave name!")
  println( "But are you brave enough to enter the Dungeon of Doom?")
  println ("Please enter Yes or No.")
  val enter = scala.io.StdIn.readLine().toUpperCase().charAt(0).toString()

  if (enter == "Y"){
      BadTextAdventure.run()
  } else if (enter == "N"){
      println("Coward!")
      System.exit(0)
  } else{
      println("If you're not going to do this right I'll just quit.")
      System.exit(0)
  }
  
}