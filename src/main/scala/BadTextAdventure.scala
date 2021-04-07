import scala.io.Source

object BadTextAdventure{
    def run(): Unit ={
        var dir = "N"
        val rooms = scala.util.Random.nextInt(1000).toInt

        for (i <- 1 to rooms){

            var spikes = scala.util.Random.nextInt(100).toInt
            if (spikes == 1){
            println("Oh no! Some how you did not see a very obvious SPIKE PIT in the middle of the room!")
            
                if (Victim.hp > 1){
                    Victim.hp = Victim.hp - 1
                    println("Don't worry, you were able to climb out. And you've still got "+ Victim.hp + " health left.")
                
                } else{
                    println ("Looks like you DIED in the SPIKE PIT. I didn't even know you could do that, you're really bad at this game. I'll quit for you.")
                    System.exit(0)
                }
            }
            if (dir == "N"){
                println ("You enter an empty cavern room. There is nothing interesting in here execpt for exits to the WEST, NORTH, EAST, and of course the door you just came from.")
            } else if (dir == "E"){
                println ("You enter an empty cavern room. There is nothing interesting in here execpt for exits to the NORTH, EAST, SOUTH, and of course the door you just came from.")
            } else if (dir == "S"){
                println ("You enter an empty cavern room. There is nothing interesting in here execpt for exits to the EAST, SOUTH, WEST, and of course the door you just came from.")
            } else if (dir == "W"){
                println ("You enter an empty cavern room. There is nothing interesting in here execpt for exits to the SOUTH, WEST, NORTH, and of course the door you just came from.")
            } else {
                 println("That's not a direction, if you're not going to play right I'll just quit.")
                 System.exit(0)
            }

            println ("Which direction do you go?")
            dir = scala.io.StdIn.readLine().toUpperCase().charAt(0).toString()
            
        }

        println("You eneter a cavern room, it is surprisingly not empty! In the center is a large treasure chest.")
        println ("Do you open it?")
        val open = scala.io.StdIn.readLine().toUpperCase().charAt(0).toString()

        if (open == "Y"){
            println("As you reach out to open the chest it opens to reveal a toothy maw and you are killed by a mimc.")
            System.exit(0)
        } else if (open == "N"){
            println("You decide not to open it, instead you attempt to leave the cavern, but when you turn your back to the chest. It opens to reveal a toothy maw and you are killed by a mimic.")
            System.exit(0)
        } else{
            println("If you're not going to play right I'll just quit.")
            System.exit(0)
        }
    }
}
